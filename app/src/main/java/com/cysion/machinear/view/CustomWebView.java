package com.cysion.machinear.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by xianshang.liu on 2016/12/3.
 * 自定义webview
 * 可用来保存图片，暂停/继续播放视频以及其它一些配置
 */

public class CustomWebView extends WebView {
    private Context mContext;

    public CustomWebView(Context context) {
        super(context);
        init(context);

    }

    public CustomWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);

    }

    public CustomWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }


    private void init(Context aContext) {
        mContext = aContext;
        initSettings();
    }

    //配置webview的设置
    private void initSettings() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        } else {
            CookieManager.getInstance().setAcceptCookie(true);
        }
        WebSettings settings = getSettings();
        settings.setCacheMode(WebSettings.LOAD_NO_CACHE);
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        setWebViewClient(new InnerClient());
    }

    //当窗口焦点改变时，暂停或恢复视频
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        if (hasWindowFocus) {
            onResume();
        } else {
            onPause();
        }
    }

    public static class InnerClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
