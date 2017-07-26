package com.cysion.machinear.model;

/**
 * Created by xianshang.liu on 2017/5/19.
 */

public class BottomBean {
    private int type;
    private boolean canClick;
    private String targetUrl;
    private String content;
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String aTitle) {
        title = aTitle;
    }

    public int getType() {
        return type;
    }

    public void setType(int aType) {
        type = aType;
    }

    public boolean isCanClick() {
        return canClick;
    }

    public void setCanClick(boolean aCanClick) {
        canClick = aCanClick;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String aTargetUrl) {
        targetUrl = aTargetUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String aContent) {
        content = aContent;
    }
}
