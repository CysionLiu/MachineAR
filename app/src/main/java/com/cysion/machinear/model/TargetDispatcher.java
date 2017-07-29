package com.cysion.machinear.model;

import java.util.List;

/**
 * Created by xianshang.liu on 2017/7/26.
 */

public class TargetDispatcher {

    public static final String LUNTAI = "obj01_tire";
    public static final String LUNTAI_TITLE = "轮胎";
    public static final String SHU_LA_CHE = "obj02_shulache";
    public static final String SHU_LA_CHE_TITLE = "向量分解力例";
    public static final String QU_BING_LIAN_GAN = "obj03_qubingliangan";
    public static final String QU_BING_LIAN_GAN_TITLE = "曲柄连杆机构";
    public static final String YE_YA_BIAN_JU_QI = "obj04_yelibianjuqi";
    public static final String YE_YA_BIAN_JU_QI_TITLE = "液力变矩器";
    public static final String JIAN_SU_QI = "obj05_zhujiansuqi";
    public static final String JIAN_SU_QI_TITLE = "准双曲面齿轮";

    public static String getResByName(String targetName, List<BottomBean> src) {
        String title = "";
        if (LUNTAI.equals(targetName)) {
            src.clear();
            src.addAll(Provider.getDataForTire());
            title = LUNTAI_TITLE;
        } else if (SHU_LA_CHE.equals(targetName)) {
            src.clear();
            src.addAll(Provider.getDataForXiangLiang());
            title = SHU_LA_CHE_TITLE;
        }else if (QU_BING_LIAN_GAN.equals(targetName)) {
            src.clear();
            src.addAll(Provider.getDataForQuBingLianGan());
            title = QU_BING_LIAN_GAN_TITLE;
        }else if (YE_YA_BIAN_JU_QI.equals(targetName)) {
            src.clear();
            src.addAll(Provider.getDataForYeLiBianJu());
            title = YE_YA_BIAN_JU_QI_TITLE;
        }else if (JIAN_SU_QI.equals(targetName)) {
            src.clear();
            src.addAll(Provider.getDataForDeceter());
            title = JIAN_SU_QI_TITLE;
        }
        return title;
    }
}
