package com.cysion.machinear.view;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.webkit.WebView;

import com.cysion.machinear.R;
import com.cysion.machinear.model.Constant;
import com.cysion.machinear.utils.TdDebugUtils;
import com.cysion.machinear.utils.TdStateUtils;

/**
 * Created by xianshang.liu on 2017/5/19.
 */

public class WebActivity extends Activity {

    private WebView mWebView;
    private TopLayout mTopLayout;
    private String mTopTitle = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_web_guide);
        mWebView = (WebView) findViewById(R.id.web_guide);
        mTopLayout = (TopLayout) findViewById(R.id.topbar_guide_hyper);
        Intent intent = getIntent();
        String url = intent.getStringExtra(Constant.WEB_URL);
        mTopTitle = intent.getStringExtra(Constant.WEB_TITLE);
        mWebView.loadUrl(url);
        mTopLayout.setTitle(mTopTitle);
        mTopLayout.setImageRes(R.drawable.refresh_net, TopLayout.Pos.RIGHT);
        mTopLayout.setOnTopBarClickListener(new TopLayout.OnTopBarClickListener() {
            @Override
            public void onIconClicked(View aView, TopLayout.Pos aPosition) {
                if (aPosition == TopLayout.Pos.LEFT) {
                    finish();
                } else if (aPosition == TopLayout.Pos.RIGHT) {
                    mWebView.reload();
                }
            }
        });
        mWebView.setWebViewClient(new CustomWebView.InnerClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                String title = view.getTitle();
                Log.d("flag--","onPageFinished(WebActivity.java:53)---->>"+title);
                if (title != null&&!title.endsWith(".html")) {
                    mTopLayout.setTitle(title);
                }
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                if (!TdStateUtils.isNetAvailable(getApplicationContext())) {
                    TdDebugUtils.toast(getApplicationContext(), getString(R.string.str_no_net), Gravity.CENTER);
                }
            }
        });

    }

    @Override
    protected void onDestroy() {
        mWebView.destroy();
        mWebView.clearCache(true);
        mWebView.clearHistory();
        super.onDestroy();
    }
}
