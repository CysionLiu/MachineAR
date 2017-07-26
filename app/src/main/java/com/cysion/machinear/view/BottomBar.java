package com.cysion.machinear.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cysion.machinear.R;

import org.jetbrains.annotations.Nullable;

/**
 * Created by xianshang.liu on 2017/5/17.
 */

public class BottomBar extends RelativeLayout {

    private TextView mTextFirst;
    private TextView mTextSecond;
    private TextView mTextThird;
    private TextView mTextFourth;
    private OnBottomBarClickListener mOnBottomBarClickListener = new OnBottomBarClickListener() {
        @Override
        public void onIconClicked(View aView, Queue aPosition) {

        }
    };

    public BottomBar(Context context) {
        super(context);
    }

    public BottomBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        View mRootView = inflater.inflate(R.layout.lay_bottom_bar_ui, this);
        mTextFirst = (TextView) mRootView.findViewById(R.id.txt_first_bottom);
        mTextSecond = (TextView) mRootView.findViewById(R.id.txt_second_bottom);
        mTextThird = (TextView) mRootView.findViewById(R.id.txt_third_bottom);
        mTextFourth = (TextView) mRootView.findViewById(R.id.txt_fourth_bottom);
        mTextFirst.setOnClickListener(mOnClickListener);
        mTextSecond.setOnClickListener(mOnClickListener);
        mTextThird.setOnClickListener(mOnClickListener);
        mTextFourth.setOnClickListener(mOnClickListener);
    }

    public BottomBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    public enum Queue {
        FIRST, SECOND, THIRD, FOURTH
    }

    public interface OnBottomBarClickListener {
        void onIconClicked(View aView, Queue aPosition);
    }

    private OnClickListener mOnClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            int viewId = v.getId();
            switch (viewId) {
                case R.id.txt_first_bottom:
                    mOnBottomBarClickListener.onIconClicked(v, Queue.FIRST);
                    break;
                case R.id.txt_second_bottom:
                    mOnBottomBarClickListener.onIconClicked(v, Queue.SECOND);
                    break;
                case R.id.txt_third_bottom:
                    mOnBottomBarClickListener.onIconClicked(v, Queue.THIRD);
                    break;
                case R.id.txt_fourth_bottom:
                    mOnBottomBarClickListener.onIconClicked(v, Queue.FOURTH);
                    break;
                default:
                    break;
            }
        }
    };

    public void setOnBottomBarClickListener(OnBottomBarClickListener aOnBottomBarClickListener) {
        mOnBottomBarClickListener = aOnBottomBarClickListener;

    }

    public void setEachIconable(boolean first, boolean second, boolean three, boolean fourth) {
        mTextFirst.setTextColor(getResources().getColor(R.color.txt_dark_x));
        mTextSecond.setTextColor(getResources().getColor(R.color.txt_dark_x));
        mTextThird.setTextColor(getResources().getColor(R.color.txt_dark_x));
        mTextFourth.setTextColor(getResources().getColor(R.color.txt_dark_x));
        if (first) {
            mTextFirst.setTextColor(getResources().getColor(R.color.txt_dark_xxx));
        }
        if (second) {
            mTextSecond.setTextColor(getResources().getColor(R.color.txt_dark_xxx));
        }
        if (three) {
            mTextThird.setTextColor(getResources().getColor(R.color.txt_dark_xxx));
        }
        if (fourth) {
            mTextFourth.setTextColor(getResources().getColor(R.color.txt_dark_xxx));
        }
    }
}
