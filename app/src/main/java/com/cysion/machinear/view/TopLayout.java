package com.cysion.machinear.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cysion.machinear.R;

/**
 * Created by xianshang.liu on 2017/5/17.
 */

public class TopLayout extends RelativeLayout {

    private View mRootView;
    private TextView mTxtTitle;
    private ImageView mImgRight;
    private ImageView mImgLeft;
    private OnTopBarClickListener mOnTopBarClickListener = new OnTopBarClickListener() {
        @Override
        public void onIconClicked(View aView, Pos aPosition) {
            try {
                throw new Exception("should invoke set method");
            } catch (Exception aE) {
                aE.printStackTrace();
            }
        }
    };
    private OnClickListener mOnClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            int viewId = v.getId();
            switch (viewId) {
                case R.id.img_left_topbar:
                    mOnTopBarClickListener.onIconClicked(v, Pos.LEFT);
                    break;
                case R.id.txt_title_topbar:
                    mOnTopBarClickListener.onIconClicked(v, Pos.MIDDLE);
                    break;
                case R.id.img_right_topbar:
                    mOnTopBarClickListener.onIconClicked(v, Pos.RIGHT);
                    break;
                default:
                    break;
            }
        }

    };


    public enum Pos {
        LEFT, RIGHT, MIDDLE
    }

    public interface OnTopBarClickListener {
        void onIconClicked(View aView, Pos aPosition);
    }

    public TopLayout(Context context) {
        super(context);
    }


    public TopLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public TopLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    private void init(Context aContext) {
        LayoutInflater inflater = (LayoutInflater) aContext.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        mRootView = inflater.inflate(R.layout.lay_top_bar_ui, this);
        mImgLeft = (ImageView) mRootView.findViewById(R.id.img_left_topbar);
        mImgRight = (ImageView) mRootView.findViewById(R.id.img_right_topbar);
        mTxtTitle = (TextView) mRootView.findViewById(R.id.txt_title_topbar);
        mImgLeft.setOnClickListener(mOnClickListener);
        mTxtTitle.setOnClickListener(mOnClickListener);
        mImgRight.setOnClickListener(mOnClickListener);
    }

    public void setOnTopBarClickListener(OnTopBarClickListener aOnTopBarClickListener) {
        mOnTopBarClickListener = aOnTopBarClickListener;
    }


    public void setImageRes(int resId, Pos aPos) {
        if (aPos == Pos.LEFT) {
            mImgLeft.setImageResource(resId);
        } else if (aPos == Pos.RIGHT) {
            mImgRight.setImageResource(resId);
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public void setTitle(String text) {
        mTxtTitle.setText(text);
        Log.e("flag--", "setTitle(CysionTopBar.java:102)-->>" + text);
    }

    public View getView(Pos aPos) {
        switch (aPos) {
            case LEFT:
                return mImgLeft;
            case MIDDLE:
                return mImgLeft;
            case RIGHT:
                return mImgLeft;
        }
        return null;
    }
}
