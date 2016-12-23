package com.ghec.shekharmandhotra.ghec;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Shekhar Mandhotra on 27-04-2016.
 */
public class Admin extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_site);

        WebView ourBrow = (WebView)findViewById(R.id.wvBrowser);
        ourBrow.loadUrl("https://smarthubeducation.hdfcbank.com/SmartfeesAdmin/");
        ourBrow.getSettings().setJavaScriptEnabled(true);
        ourBrow.getSettings().setBuiltInZoomControls(true);
        ourBrow.setWebViewClient(new ourViewClient());


    }
}