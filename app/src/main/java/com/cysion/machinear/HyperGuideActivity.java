package com.cysion.machinear;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.cysion.machinear.view.TopLayout;

/**
 * Created by xianshang.liu on 2017/5/19.
 */

public class HyperGuideActivity extends Activity {

    private TopLayout mTopLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_hyper_guide);
        mTopLayout = (TopLayout) findViewById(R.id.topbar_guide_hyper);
        mTopLayout.setOnTopBarClickListener(new TopLayout.OnTopBarClickListener() {
            @Override
            public void onIconClicked(View aView, TopLayout.Pos aPosition) {
                if (aPosition== TopLayout.Pos.LEFT) {
                    finish();
                }
            }
        });
        mTopLayout.setTitle("图文说明");
    }
}
