package com.ghec.shekharmandhotra.ghec;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Shekhar Mandhotra on 27-04-2016.
 */
public class Student extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_site);

        WebView ourBrow = (WebView)findViewById(R.id.wvBrowser);
        ourBrow.clearCache(true);
        ourBrow.clearHistory();
        ourBrow.loadUrl("https://smarthubeducation.hdfcbank.com/SmartFees/directLoadQuickPay.action;jsessionid=QijZQvhVlcDhfsn9M+gYQV7f?uniqueSessionIdentifier=028616623043449892230123456789&redirectionURL=");
        ourBrow.getSettings().setJavaScriptEnabled(true);
        ourBrow.getSettings().setBuiltInZoomControls(true);
        ourBrow.setWebViewClient(new ourViewClient());


    }
}