package com.cysion.machinear.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by xianshang.liu on 2017/7/26.
 */

public class MaskImageView extends ImageView {

    private Paint mPaint = new Paint();
    private boolean hasMask = false;

    public boolean isHasMask() {
        return hasMask;
    }

    public void setHasMask(boolean aHasMask) {
        hasMask = aHasMask;
    }

    public MaskImageView(Context context) {
        super(context);
    }

    public MaskImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MaskImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!hasMask) {
            return;
        }
        mPaint.setColor(0xaaffffff);
        int width = getWidth();
        int height = getHeight();
        canvas.drawRect(0, 0, width, height, mPaint);
    }
}
