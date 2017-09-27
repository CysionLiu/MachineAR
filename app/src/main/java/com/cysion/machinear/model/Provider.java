package com.cysion.machinear.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianshang.liu on 2017/5/19.
 */

public class Provider {

    public static List<BottomBean> getDataForTire() {
        List<BottomBean> lists = new ArrayList<>();
        BottomBean bean1 = new BottomBean();
        bean1.setType(Constant.WEB_GUIDE);//图文说明
        bean1.setCanClick(true);
        bean1.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx01doc01.html");
        BottomBean bean2 = new BottomBean();
        bean2.setType(Constant.VOICE_GUIDE);//语音
        bean2.setCanClick(true);
        bean2.setContent("http://ihygg.com/qxsxarupoos/audio/qxsx01audio.mp3");
        BottomBean bean3 = new BottomBean();
        bean3.setType(Constant.WEB_GUIDE);//数学知识
        bean3.setCanClick(true);
        bean3.setTitle("数学知识");
        bean3.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx01Math01.html");
        BottomBean bean4 = new BottomBean();
        bean4.setType(Constant.WEB_GUIDE);//视频介绍
        bean4.setCanClick(false);
        bean4.setTitle("视频介绍");
        bean4.setTargetUrl("http://www.csdn.net/?ref=toolbar");
        lists.add(bean1);
        lists.add(bean2);
        lists.add(bean3);
        lists.add(bean4);
        return lists;

    }

    public static List<BottomBean> getDataForDeceter() {
        List<BottomBean> lists = new ArrayList<>();
        BottomBean bean1 = new BottomBean();
        bean1.setType(Constant.WEB_GUIDE);//图文说明
        bean1.setCanClick(true);
        bean1.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx02doc01.html");
        BottomBean bean2 = new BottomBean();
        bean2.setType(Constant.VOICE_GUIDE);//语音
        bean2.setCanClick(true);
        bean2.setContent("http://ihygg.com/qxsxarupoos/audio/qxsx02audio01.mp3");
        BottomBean bean3 = new BottomBean();
        bean3.setType(Constant.WEB_GUIDE);//数学知识
        bean3.setCanClick(true);
        bean3.setTitle("数学知识");
        bean3.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx02Math01.html");
        BottomBean bean4 = new BottomBean();
        bean4.setType(Constant.WEB_GUIDE);//视频介绍
        bean4.setCanClick(true);
        bean4.setTitle("视频介绍");
        bean4.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx02video01.html");
        lists.add(bean1);
        lists.add(bean2);
        lists.add(bean3);
        lists.add(bean4);
        return lists;

    }

    public static List<BottomBean> getDataForXiangLiang() {
        List<BottomBean> lists = new ArrayList<>();
        BottomBean bean1 = new BottomBean();
        bean1.setType(Constant.WEB_GUIDE);//图文说明
        bean1.setCanClick(true);
        bean1.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx03doc01.html");
        BottomBean bean2 = new BottomBean();
        bean2.setType(Constant.VOICE_GUIDE);//语音
        bean2.setCanClick(true);
        bean2.setContent("http://ihygg.com/qxsxarupoos/audio/qxsx03audio.mp3");
        BottomBean bean3 = new BottomBean();
        bean3.setType(Constant.WEB_GUIDE);//数学知识
        bean3.setCanClick(true);
        bean3.setTitle("数学知识");
        bean3.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx03Math01.html");
        BottomBean bean4 = new BottomBean();
        bean4.setType(Constant.WEB_GUIDE);//视频介绍
        bean4.setCanClick(false);
        bean4.setTitle("视频介绍");
        bean4.setTargetUrl("http://hyggpro.net/ar/qxsx02video01.html");
        lists.add(bean1);
        lists.add(bean2);
        lists.add(bean3);
        lists.add(bean4);
        return lists;

    }

    public static List<BottomBean> getDataForQuBingLianGan() {
        List<BottomBean> lists = new ArrayList<>();
        BottomBean bean1 = new BottomBean();
        bean1.setType(Constant.WEB_GUIDE);//图文说明
        bean1.setCanClick(true);
        bean1.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx04doc01.html");
        BottomBean bean2 = new BottomBean();
        bean2.setType(Constant.VOICE_GUIDE);//语音
        bean2.setCanClick(true);
        bean2.setContent("http://ihygg.com/qxsxarupoos/audio/qxsx04audio.mp3");
        BottomBean bean3 = new BottomBean();
        bean3.setType(Constant.WEB_GUIDE);//数学知识
        bean3.setCanClick(true);
        bean3.setTitle("数学知识");
        bean3.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx04Math01.html");
        BottomBean bean4 = new BottomBean();
        bean4.setType(Constant.WEB_GUIDE);//视频介绍
        bean4.setCanClick(true);
        bean4.setTitle("视频介绍");
        bean4.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx04video01.html");
        lists.add(bean1);
        lists.add(bean2);
        lists.add(bean3);
        lists.add(bean4);
        return lists;

    }

    public static List<BottomBean> getDataForYeLiBianJu() {
        List<BottomBean> lists = new ArrayList<>();
        BottomBean bean1 = new BottomBean();
        bean1.setType(Constant.WEB_GUIDE);//图文说明
        bean1.setCanClick(true);
        bean1.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx05doc01.html");
        BottomBean bean2 = new BottomBean();
        bean2.setType(Constant.VOICE_GUIDE);//语音
        bean2.setCanClick(true);
        bean2.setContent("http://ihygg.com/qxsxarupoos/audio/qxsx05audio.mp3");
        BottomBean bean3 = new BottomBean();
        bean3.setType(Constant.WEB_GUIDE);//数学知识
        bean3.setCanClick(true);
        bean3.setTitle("数学知识");
        bean3.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx05Math01.html");
        BottomBean bean4 = new BottomBean();
        bean4.setType(Constant.WEB_GUIDE);//视频介绍
        bean4.setCanClick(true);
        bean4.setTitle("视频介绍");
        bean4.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx05video01.html");
        lists.add(bean1);
        lists.add(bean2);
        lists.add(bean3);
        lists.add(bean4);
        return lists;

    }
    public static List<BottomBean> getDataForBianSuQi() {
        List<BottomBean> lists = new ArrayList<>();
        BottomBean bean1 = new BottomBean();
        bean1.setType(Constant.WEB_GUIDE);//图文说明
        bean1.setCanClick(true);
        bean1.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx12Math01.html");
        BottomBean bean2 = new BottomBean();
        bean2.setType(Constant.VOICE_GUIDE);//语音
        bean2.setCanClick(true);
        bean2.setContent("http://ihygg.com/qxsxarupoos/audio/qxsx12audio.mp3");
        BottomBean bean3 = new BottomBean();
        bean3.setType(Constant.WEB_GUIDE);//数学知识
        bean3.setCanClick(true);
        bean3.setTitle("数学知识");
        bean3.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx12doc01.html");
        BottomBean bean4 = new BottomBean();
        bean4.setType(Constant.WEB_GUIDE);//视频介绍
        bean4.setCanClick(false);
        bean4.setTitle("视频介绍");
        bean4.setTargetUrl("http://ihygg.com/");
        lists.add(bean1);
        lists.add(bean2);
        lists.add(bean3);
        lists.add(bean4);
        return lists;

    }
    public static List<BottomBean> getDataForQianZhaoDeng() {
        List<BottomBean> lists = new ArrayList<>();
        BottomBean bean1 = new BottomBean();
        bean1.setType(Constant.WEB_GUIDE);//图文说明
        bean1.setCanClick(true);
        bean1.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx06Math01.html");
        BottomBean bean2 = new BottomBean();
        bean2.setType(Constant.VOICE_GUIDE);//语音
        bean2.setCanClick(true);
        bean2.setContent("http://ihygg.com/qxsxarupoos/audio/qxsx05audio.mp3");
        BottomBean bean3 = new BottomBean();
        bean3.setType(Constant.WEB_GUIDE);//数学知识
        bean3.setCanClick(true);
        bean3.setTitle("数学知识");
        bean3.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx05doc01.html");
        BottomBean bean4 = new BottomBean();
        bean4.setType(Constant.WEB_GUIDE);//视频介绍
        bean4.setCanClick(true);
        bean4.setTitle("视频介绍");
        bean4.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx05video01.html");
        lists.add(bean1);
        lists.add(bean2);
        lists.add(bean3);
        lists.add(bean4);
        return lists;

    }
    public static List<BottomBean> getDataForWeiXingDingWei() {
        List<BottomBean> lists = new ArrayList<>();
        BottomBean bean1 = new BottomBean();
        bean1.setType(Constant.WEB_GUIDE);//图文说明
        bean1.setCanClick(true);
        bean1.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx13Math01.html");
        BottomBean bean2 = new BottomBean();
        bean2.setType(Constant.VOICE_GUIDE);//语音
        bean2.setCanClick(true);
        bean2.setContent("http://ihygg.com/qxsxarupoos/audio/qxsx13audio.mp3");
        BottomBean bean3 = new BottomBean();
        bean3.setType(Constant.WEB_GUIDE);//数学知识
        bean3.setCanClick(false);
        bean3.setTitle("数学知识");
        bean3.setTargetUrl("http://ihygg.com/");
        BottomBean bean4 = new BottomBean();
        bean4.setType(Constant.WEB_GUIDE);//视频介绍
        bean4.setCanClick(false);
        bean4.setTitle("视频介绍");
        bean4.setTargetUrl("http://ihygg.com/");
        lists.add(bean1);
        lists.add(bean2);
        lists.add(bean3);
        lists.add(bean4);
        return lists;

    }

    public static List<BottomBean> getDataForPaPo() {
        List<BottomBean> lists = new ArrayList<>();
        BottomBean bean1 = new BottomBean();
        bean1.setType(Constant.WEB_GUIDE);//图文说明
        bean1.setCanClick(true);
        bean1.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx08Math01.html");
        BottomBean bean2 = new BottomBean();
        bean2.setType(Constant.VOICE_GUIDE);//语音
        bean2.setCanClick(true);
        bean2.setContent("http://ihygg.com/qxsxarupoos/audio/qxsx08audio.mp3");
        BottomBean bean3 = new BottomBean();
        bean3.setType(Constant.WEB_GUIDE);//数学知识
        bean3.setCanClick(false);
        bean3.setTitle("数学知识");
        bean3.setTargetUrl("http://ihygg.com/");
        BottomBean bean4 = new BottomBean();
        bean4.setType(Constant.WEB_GUIDE);//视频介绍
        bean4.setCanClick(false);
        bean4.setTitle("视频介绍");
        bean4.setTargetUrl("http://ihygg.com/");
        lists.add(bean1);
        lists.add(bean2);
        lists.add(bean3);
        lists.add(bean4);
        return lists;

    }

    public static List<BottomBean> getDataForQiCheDiPan() {
        List<BottomBean> lists = new ArrayList<>();
        BottomBean bean1 = new BottomBean();
        bean1.setType(Constant.WEB_GUIDE);//图文说明
        bean1.setCanClick(true);
        bean1.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx11Math01.html");
        BottomBean bean2 = new BottomBean();
        bean2.setType(Constant.VOICE_GUIDE);//语音
        bean2.setCanClick(true);
        bean2.setContent("http://ihygg.com/qxsxarupoos/audio/qxsx11audio.mp3");
        BottomBean bean3 = new BottomBean();
        bean3.setType(Constant.WEB_GUIDE);//数学知识
        bean3.setCanClick(true);
        bean3.setTitle("数学知识");
        bean3.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx11doc01.html");
        BottomBean bean4 = new BottomBean();
        bean4.setType(Constant.WEB_GUIDE);//视频介绍
        bean4.setCanClick(false);
        bean4.setTitle("视频介绍");
        bean4.setTargetUrl("http://ihygg.com/");
        lists.add(bean1);
        lists.add(bean2);
        lists.add(bean3);
        lists.add(bean4);
        return lists;

    }

    public static List<BottomBean> getDataForShiBoQi() {
        List<BottomBean> lists = new ArrayList<>();
        BottomBean bean1 = new BottomBean();
        bean1.setType(Constant.WEB_GUIDE);//图文说明
        bean1.setCanClick(true);
        bean1.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx09Math01.html");
        BottomBean bean2 = new BottomBean();
        bean2.setType(Constant.VOICE_GUIDE);//语音
        bean2.setCanClick(true);
        bean2.setContent("http://ihygg.com/qxsxarupoos/audio/qxsx09audio01.mp3");
        BottomBean bean3 = new BottomBean();
        bean3.setType(Constant.WEB_GUIDE);//数学知识
        bean3.setCanClick(true);
        bean3.setTitle("数学知识");
        bean3.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx09doc01.html");
        BottomBean bean4 = new BottomBean();
        bean4.setType(Constant.WEB_GUIDE);//视频介绍
        bean4.setCanClick(true);
        bean4.setTitle("视频介绍");
        bean4.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx09video01.html");
        lists.add(bean1);
        lists.add(bean2);
        lists.add(bean3);
        lists.add(bean4);
        return lists;

    }

    public static List<BottomBean> getDataForYaSuoJi() {
        List<BottomBean> lists = new ArrayList<>();
        BottomBean bean1 = new BottomBean();
        bean1.setType(Constant.WEB_GUIDE);//图文说明
        bean1.setCanClick(true);
        bean1.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx07Math01.html");
        BottomBean bean2 = new BottomBean();
        bean2.setType(Constant.VOICE_GUIDE);//语音
        bean2.setCanClick(true);
        bean2.setContent("http://ihygg.com/qxsxarupoos/audio/qxsx07audio.mp3");
        BottomBean bean3 = new BottomBean();
        bean3.setType(Constant.WEB_GUIDE);//数学知识
        bean3.setCanClick(true);
        bean3.setTitle("数学知识");
        bean3.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx07doc01.html");
        BottomBean bean4 = new BottomBean();
        bean4.setType(Constant.WEB_GUIDE);//视频介绍
        bean4.setCanClick(true);
        bean4.setTitle("视频介绍");
        bean4.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx07video01.html");
        lists.add(bean1);
        lists.add(bean2);
        lists.add(bean3);
        lists.add(bean4);
        return lists;

    }


    public static List<BottomBean> getDataForZhiDongQi() {
        List<BottomBean> lists = new ArrayList<>();
        BottomBean bean1 = new BottomBean();
        bean1.setType(Constant.WEB_GUIDE);//图文说明
        bean1.setCanClick(true);
        bean1.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx10Math01.html");
        BottomBean bean2 = new BottomBean();
        bean2.setType(Constant.VOICE_GUIDE);//语音
        bean2.setCanClick(true);
        bean2.setContent("http://ihygg.com/qxsxarupoos/audio/qxsx10audio.mp3");
        BottomBean bean3 = new BottomBean();
        bean3.setType(Constant.WEB_GUIDE);//数学知识
        bean3.setCanClick(true);
        bean3.setTitle("数学知识");
        bean3.setTargetUrl("http://ihygg.com/qxsxarupoos/qxsx10doc01.html");
        BottomBean bean4 = new BottomBean();
        bean4.setType(Constant.WEB_GUIDE);//视频介绍
        bean4.setCanClick(false);
        bean4.setTitle("视频介绍");
        bean4.setTargetUrl("http://ihygg.com/");
        lists.add(bean1);
        lists.add(bean2);
        lists.add(bean3);
        lists.add(bean4);
        return lists;

    }

}
