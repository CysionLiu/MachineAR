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
    public static final String BIAN_SU_QI = "obj06_biansuqi";
    public static final String BIAN_SU_QI_TITLE = "手动变速器";
    public static final String QIAN_ZHAO_DENG = "obj07_chedeng";
    public static final String QIAN_ZHAO_DENG_TITLE = "前照灯";
    public static final String DI_TU_DING_WEI = "obj08_ditudingwei";
    public static final String DI_TU_DING_WEI_TITLE = "卫星定位";
    public static final String PAPO = "obj09_papo";
    public static final String PAPO_TITLE = "汽车爬坡性能";
    public static final String QI_CHE_DI_PAN = "obj10_qichedipan";
    public static final String QI_CHE_DI_PAN_TITLE = "汽车底盘动力传输";
    public static final String SHI_BO_QI = "obj11_shiboqi";
    public static final String SHI_BO_QI_TITLE = "示波器";
    public static final String YA_SUO_JI = "obj12_yasuoji";
    public static final String YA_SUO_JI_TITLE = "空调压缩机";
    public static final String ZHI_DONG_QI = "obj13_zhidongqi";
    public static final String ZHI_DONG_QI_TITLE = "制动器";

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
        }else if (BIAN_SU_QI.equals(targetName)) {
            src.clear();
            src.addAll(Provider.getDataForBianSuQi());
            title = BIAN_SU_QI_TITLE;
        }else if (QIAN_ZHAO_DENG.equals(targetName)) {
            src.clear();
            src.addAll(Provider.getDataForQianZhaoDeng());
            title = QIAN_ZHAO_DENG_TITLE;
        }else if (DI_TU_DING_WEI.equals(targetName)) {
            src.clear();
            src.addAll(Provider.getDataForWeiXingDingWei());
            title = DI_TU_DING_WEI_TITLE;
        }else if (PAPO.equals(targetName)) {
            src.clear();
            src.addAll(Provider.getDataForPaPo());
            title = PAPO_TITLE;
        }else if (QI_CHE_DI_PAN.equals(targetName)) {
            src.clear();
            src.addAll(Provider.getDataForQiCheDiPan());
            title = QI_CHE_DI_PAN_TITLE;
        }else if (SHI_BO_QI.equals(targetName)) {
            src.clear();
            src.addAll(Provider.getDataForShiBoQi());
            title = SHI_BO_QI_TITLE;
        }else if (YA_SUO_JI.equals(targetName)) {
            src.clear();
            src.addAll(Provider.getDataForYaSuoJi());
            title = YA_SUO_JI_TITLE;
        }else if (ZHI_DONG_QI.equals(targetName)) {
            src.clear();
            src.addAll(Provider.getDataForZhiDongQi());
            title = ZHI_DONG_QI_TITLE;
        }
        return title;
    }
}
