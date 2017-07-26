package com.cysion.machinear;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.PixelFormat;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.cysion.machinear.model.BottomBean;
import com.cysion.machinear.model.Constant;
import com.cysion.machinear.model.TargetDispatcher;
import com.cysion.machinear.view.BottomBar;
import com.cysion.machinear.view.ImgBottomBar;
import com.cysion.machinear.view.TopLayout;
import com.cysion.machinear.view.WebActivity;
import com.unity3d.player.UnityPlayer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UnityPlayerActivity extends Activity {
    protected UnityPlayer mUnityPlayer; // don't change the name of this variable; referenced from native code
    private View mIndexView;
    private TextView mTxtCountDown;
    private View mHomeView;
    private boolean isHomeShow = false;
    private ImageView mImgStartScan;
    private View mModelShowView;
    private TopLayout mTopLayout;
    private ImgBottomBar mBottomBar;
    private RelativeLayout mTipsToScan;
    private MediaPlayer mPlayer;
    private boolean isARCanShow = false;
    private boolean objIsShowing = false;

    // Setup activity layout
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        getWindow().setFormat(PixelFormat.RGBX_8888); // <--- This makes xperia play happy
        mUnityPlayer = new UnityPlayer(this);
        setContentView(mUnityPlayer);
        initOutLayer();
        mUnityPlayer.requestFocus();
    }


    // Pause Unity
    @Override
    protected void onPause() {
        super.onPause();
        mUnityPlayer.pause();
    }

    // Resume Unity
    @Override
    protected void onResume() {
        super.onResume();
        mUnityPlayer.resume();
    }

    // This ensures the layout will be correct.
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mUnityPlayer.configurationChanged(newConfig);
    }

    // Notify Unity of the focus change.
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        mUnityPlayer.windowFocusChanged(hasFocus);
    }

    // For some reason the multiple keyevent type is not supported by the ndk.
    // Force event injection by overriding dispatchKeyEvent().
    private long lastClickTime = 0L;

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (System.currentTimeMillis() - lastClickTime > 500) {
            lastClickTime = System.currentTimeMillis();
            return true;
        }
        if (event.getKeyCode() == KeyEvent.KEYCODE_BACK) {
            if (isHomeShow) {
                mUnityPlayer.quit();
                finish();
            } else {
                showHomeAgain();
                stopMediaPlayer();
            }
            return true;
        }
        if (event.getKeyCode() == KeyEvent.KEYCODE_MENU) {
            return true;
        }
        if (event.getAction() == KeyEvent.ACTION_MULTIPLE)
            return mUnityPlayer.injectEvent(event);
        return super.dispatchKeyEvent(event);
    }

    // Pass any events not handled by (unfocused) views straight to UnityPlayer
    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        return mUnityPlayer.injectEvent(event);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) { //监控/拦截/屏蔽返回键
            return true;
        } else if (keyCode == KeyEvent.KEYCODE_MENU) {//MENU键
            //监控/拦截菜单键
            return true;
        }
        return mUnityPlayer.injectEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return mUnityPlayer.injectEvent(event);
    }

    /*API12*/
    public boolean onGenericMotionEvent(MotionEvent event) {
        return mUnityPlayer.injectEvent(event);
    }

    //------android-------
    private String targetName = "";
    private List<BottomBean> srcList = new ArrayList<>();
    private String lastName;
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case Constant.CAMERA_START:
                    mIndexView.setVisibility(View.GONE);
                    break;
                case Constant.FOUND_TARGET:
                    targetName = (String) msg.obj;
                    objIsShowing = true;
                    Log.e("flag--", "handleMessage(UnityPlayerActivity.java:160)---->>" + targetName);
                    if (!targetName.equals(lastName) && isARCanShow) {
                        Toast.makeText(UnityPlayerActivity.this, "识别成功", Toast.LENGTH_SHORT).show();
                    }
                    lastName = targetName;
                    mTopLayout.setTitle(TargetDispatcher.getResByName(targetName, srcList));
                    changeModelShowLayout(1);
                    break;
                case Constant.LOST_TARGET:
                    targetName = (String) msg.obj;
                    objIsShowing = false;
                    changeModelShowLayout(0);
                    break;
            }
        }
    };


    private void initOutLayer() {
        //主页面
        setUpHomePage();
        //引导页面
        setupIndexPage();
        //模型展示页面
        setupModelPage();
    }

    private void setupModelPage() {
        mModelShowView = LayoutInflater.from(this).inflate(R.layout.lay_model_show, null);
        getWindow().addContentView(mModelShowView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        mTopLayout = (TopLayout) mModelShowView.findViewById(R.id.topbar_model_showpage);
        mBottomBar = (ImgBottomBar) mModelShowView.findViewById(R.id.bottombar_model_showpage);
        mTipsToScan = (RelativeLayout) mModelShowView.findViewById(R.id.tips_bottom_show);
        mModelShowView.setVisibility(View.GONE);
        changeModelShowLayout(0);
        mTopLayout.setOnTopBarClickListener(new TopLayout.OnTopBarClickListener() {
            @Override
            public void onIconClicked(View aView, TopLayout.Pos aPosition) {
                if (aPosition == TopLayout.Pos.LEFT) {
                    showHomeAgain();
                    stopMediaPlayer();
                }
            }
        });
        mBottomBar.setOnBottomBarClickListener(new ImgBottomBar.OnBottomBarClickListener() {
            @Override
            public void onIconClicked(View aView, BottomBar.Queue aPosition) {
                if (TextUtils.isEmpty(targetName)) {
                    return;
                }
                BottomBean temp = null;
                switch (aPosition) {
                    case FIRST:
                        temp = srcList.get(0);
                        if (temp.isCanClick()) {
                            if (temp.getType() == Constant.WEB_GUIDE) {
                                jumpToWeb(temp);
                            }
                        }
                        break;
                    case SECOND:
                        onVoiceGuideClicked();
                        break;
                    case THIRD:
                        temp = srcList.get(2);
                        if (temp.getType() == Constant.WEB_GUIDE && temp.isCanClick()) {
                            jumpToWeb(temp);
                        }
                        break;
                    case FOURTH:
                        temp = srcList.get(3);
                        if (temp.getType() == Constant.WEB_GUIDE && temp.isCanClick()) {
                            jumpToWeb(temp);
                        }
                        break;
                }
            }
        });
    }

    private void jumpToWeb(BottomBean aTemp) {
        Intent myIntent = new Intent(UnityPlayerActivity.this, WebActivity.class);
        myIntent.putExtra(Constant.WEB_URL, aTemp.getTargetUrl());
        myIntent.putExtra(Constant.WEB_TITLE, aTemp.getTitle());
        startActivity(myIntent);
    }

    private void onVoiceGuideClicked() {
        BottomBean temp;
        temp = srcList.get(1);
        if (temp.getType() == Constant.VOICE_GUIDE && temp.isCanClick()) {
            if (mPlayer != null && mPlayer.isPlaying()) {
                mPlayer.stop();
                mPlayer.reset();
                return;
            }
            if (mPlayer == null) {
                mPlayer = new MediaPlayer();
            }
            try {
                mPlayer.reset();
                mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mPlayer.setDataSource(temp.getContent());
                mPlayer.prepareAsync();
                mPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mPlayer.start();
                    }
                });
            } catch (IOException aE) {
                aE.printStackTrace();
            }
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopMediaPlayer();
        mUnityPlayer.pause();
    }

    private void stopMediaPlayer() {
        if (mPlayer != null) {
            mPlayer.stop();
        }
    }

    private void releasePlayer() {
        if (mPlayer != null) {
            mPlayer.stop();
            mPlayer.reset();
            mPlayer.release();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        mUnityPlayer.resume();
    }

    private void showHomeAgain() {
        mModelShowView.setVisibility(View.GONE);
        mHomeView.setVisibility(View.VISIBLE);
        isHomeShow = true;
        UnityPlayer.UnitySendMessage("GlobalScript", "stopARScan", "");
        isARCanShow = false;
    }

    //参数为1时，发现识别物
    private void changeModelShowLayout(int aI) {
        if (aI == 1) {
            mTopLayout.setVisibility(View.VISIBLE);
            mBottomBar.setVisibility(View.VISIBLE);
            mTipsToScan.setVisibility(View.GONE);
        } else {
            mTopLayout.setVisibility(View.GONE);
            mBottomBar.setVisibility(View.GONE);
            mTipsToScan.setVisibility(View.VISIBLE);
        }
        if (srcList != null && srcList.size() >= 4) {
            mBottomBar.setEachIconable(srcList.get(0).isCanClick(), srcList.get(1).isCanClick(),
                    srcList.get(2).isCanClick(), srcList.get(3).isCanClick());
        }
    }

    private void setupIndexPage() {
        mIndexView = LayoutInflater.from(this).inflate(R.layout.lay_index_page, null);
        mTxtCountDown = (TextView) mIndexView.findViewById(R.id.txt_count_down);
        getWindow().addContentView(mIndexView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
    }

    private void setUpHomePage() {
        mHomeView = LayoutInflater.from(this).inflate(R.layout.lay_home_page, null);
        isHomeShow = true;
        mImgStartScan = (ImageView) mHomeView.findViewById(R.id.img_start_scan);
        getWindow().addContentView(mHomeView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        mImgStartScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mHomeView.setVisibility(View.GONE);
                isHomeShow = false;
                mModelShowView.setVisibility(View.VISIBLE);
                UnityPlayer.UnitySendMessage("GlobalScript", "startARScan", "");
                isARCanShow = true;
                if (objIsShowing) {
                    Toast.makeText(UnityPlayerActivity.this, "识别成功", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    public void onARStarted() {
        mHandler.sendEmptyMessageDelayed(Constant.CAMERA_START, 500);
    }

    public void onTargetFound(String targetName) {

        Message msg = Message.obtain();
        msg.obj = targetName;
        if (TextUtils.isEmpty(targetName)) {
            msg.what = Constant.LOST_TARGET;
        } else {
            msg.what = Constant.FOUND_TARGET;
        }
        mHandler.sendMessage(msg);

    }

    // Quit Unity
    @Override
    protected void onDestroy() {
        mUnityPlayer.quit();
        super.onDestroy();
        releasePlayer();
    }
}
