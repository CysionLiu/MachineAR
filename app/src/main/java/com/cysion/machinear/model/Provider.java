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
        bean1.setTargetUrl("http://hyggpro.net/ar/qxsx01doc01.html");
        BottomBean bean2 = new BottomBean();
        bean2.setType(Constant.VOICE_GUIDE);//语音
        bean2.setCanClick(true);
        bean2.setContent("http://hyggpro.net/ar/audio/qxsx01audio01.mp3");
        BottomBean bean3 = new BottomBean();
        bean3.setType(Constant.WEB_GUIDE);//数学知识
        bean3.setCanClick(true);
        bean3.setTitle("数学知识");
        bean3.setTargetUrl("http://hyggpro.net/ar/qxsx01Math01.html");
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
        bean1.setTargetUrl("http://hyggpro.net/ar/qxsx02doc01.html");
        BottomBean bean2 = new BottomBean();
        bean2.setType(Constant.VOICE_GUIDE);//语音
        bean2.setCanClick(true);
        bean2.setContent("http://hyggpro.net/ar/audio/qxsx02audio01.mp3");
        BottomBean bean3 = new BottomBean();
        bean3.setType(Constant.WEB_GUIDE);//数学知识
        bean3.setCanClick(true);
        bean3.setTitle("数学知识");
        bean3.setTargetUrl("http://hyggpro.net/ar/qxsx02Math01.html");
        BottomBean bean4 = new BottomBean();
        bean4.setType(Constant.WEB_GUIDE);//视频介绍
        bean4.setCanClick(true);
        bean4.setTitle("视频介绍");
        bean4.setTargetUrl("http://hyggpro.net/ar/qxsx02video01.html");
        lists.add(bean1);
        lists.add(bean2);
        lists.add(bean3);
        lists.add(bean4);
        return lists;

    }
}
