package com.cysion.machinear.model;

import java.util.List;

/**
 * Created by xianshang.liu on 2017/7/26.
 */

public class TargetDispatcher {

    public static final String LUNTAI = "obj01_tire";
    public static final String LUNTAI_TITLE = "动力轮胎";
    public static final String JIANSUQI = "obj02_deceter";
    public static final String JIANSUQI_TITLE = "可靠减速器";

    public static String getResByName(String targetName, List<BottomBean> src) {
        String title = "";
        if (LUNTAI.equals(targetName)) {
            src.clear();
            src.addAll(Provider.getDataForTire());
            title = LUNTAI_TITLE;
        } else if (JIANSUQI.equals(targetName)) {
            src.clear();
            src.addAll(Provider.getDataForDeceter());
            title = JIANSUQI_TITLE;
        }
        return title;
    }
}
