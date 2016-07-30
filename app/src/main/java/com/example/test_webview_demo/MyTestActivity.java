package com.example.test_webview_demo;

import android.app.Activity;
import android.os.Bundle;

import com.example.test_webview_demo.utils.X5WebView;

/**
 * Created by Administrator on 2016/6/2.
 */
public class MyTestActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.mytest);

        X5WebView webView = (X5WebView) findViewById(R.id.web_jsjava);

        webView.loadUrl("http://m.yingwuluo.cc/actmain/user/133");
    }
}
