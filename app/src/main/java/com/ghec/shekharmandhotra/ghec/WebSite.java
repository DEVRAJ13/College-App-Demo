package com.ghec.shekharmandhotra.ghec;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import java.security.KeyStore;

/**
 * Created by Shekhar Mandhotra on 02-04-2016.
 */
public class WebSite extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_site);

        WebView ourBrow = (WebView)findViewById(R.id.wvBrowser);
        ourBrow.loadUrl("http://www.ghec.co.in");
        ourBrow.getSettings().setJavaScriptEnabled(true);
        ourBrow.getSettings().setBuiltInZoomControls(true);
        ourBrow.getSettings().setAppCacheEnabled(true);
        ourBrow.setWebViewClient(new ourViewClient());


    }
}
