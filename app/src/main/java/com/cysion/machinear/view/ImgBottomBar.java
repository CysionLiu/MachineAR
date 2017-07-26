package com.cysion.machinear.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.cysion.machinear.R;

/**
 * Created by xianshang.liu on 2017/7/26.
 */

public class ImgBottomBar extends RelativeLayout {

    private MaskImageView img1;
    private MaskImageView img2;
    private MaskImageView img3;
    private MaskImageView img4;
    private ImageView[] imgs = new ImageView[4];

    public interface OnBottomBarClickListener {
        void onIconClicked(View aView, BottomBar.Queue aPosition);
    }

    private ImgBottomBar.OnBottomBarClickListener mOnBottomBarClickListener = new ImgBottomBar.OnBottomBarClickListener() {
        @Override
        public void onIconClicked(View aView, BottomBar.Queue aPosition) {

        }
    };
    private OnClickListener mOnClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            int viewId = v.getId();
            switch (viewId) {
                case R.id.img_first_bottom:
                    mOnBottomBarClickListener.onIconClicked(v, BottomBar.Queue.FIRST);
                    break;
                case R.id.img_second_bottom:
                    mOnBottomBarClickListener.onIconClicked(v, BottomBar.Queue.SECOND);
                    break;
                case R.id.img_third_bottom:
                    mOnBottomBarClickListener.onIconClicked(v, BottomBar.Queue.THIRD);
                    break;
                case R.id.img_fourth_bottom:
                    mOnBottomBarClickListener.onIconClicked(v, BottomBar.Queue.FOURTH);
                    break;
                default:
                    break;
            }
        }
    };

    public void setOnBottomBarClickListener(ImgBottomBar.OnBottomBarClickListener aOnBottomBarClickListener) {
        mOnBottomBarClickListener = aOnBottomBarClickListener;

    }

    public ImgBottomBar(Context context) {
        super(context);
    }

    public ImgBottomBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        View mRootView = inflater.inflate(R.layout.lay_img_bottom, this);
        img1 = (MaskImageView) mRootView.findViewById(R.id.img_first_bottom);
        img2 = (MaskImageView) mRootView.findViewById(R.id.img_second_bottom);
        img3 = (MaskImageView) mRootView.findViewById(R.id.img_third_bottom);
        img4 = (MaskImageView) mRootView.findViewById(R.id.img_fourth_bottom);
        img1.setOnClickListener(mOnClickListener);
        img2.setOnClickListener(mOnClickListener);
        img3.setOnClickListener(mOnClickListener);
        img4.setOnClickListener(mOnClickListener);
        imgs[0] = img1;
        imgs[1] = img2;
        imgs[2] = img3;
        imgs[3] = img4;
    }

    public ImgBottomBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setEachIconable(boolean first, boolean second, boolean three, boolean fourth) {
        img1.setHasMask(!first);
        img2.setHasMask(!second);
        img3.setHasMask(!three);
        img4.setHasMask(!fourth);
        for (int i = 0; i < imgs.length; i++) {
            imgs[i].invalidate();
        }
    }
}
