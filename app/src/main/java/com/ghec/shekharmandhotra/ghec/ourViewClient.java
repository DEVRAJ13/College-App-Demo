package com.ghec.shekharmandhotra.ghec;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Shekhar Mandhotra on 27-04-2016.
 */
public class ourViewClient extends WebViewClient {

    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        // TODO Auto-generated method stub
        view.loadUrl(url);
        return super.shouldOverrideUrlLoading(view, url);
    }
}