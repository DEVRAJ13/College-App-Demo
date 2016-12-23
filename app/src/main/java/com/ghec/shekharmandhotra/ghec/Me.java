package com.ghec.shekharmandhotra.ghec;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Shekhar Mandhotra on 08-05-2016.
 */
public class Me extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.me);
        TabHost th = (TabHost) findViewById(R.id.tabHost);
        th.setup();
        TabHost.TabSpec specs = th.newTabSpec("tag14");
        specs.setContent(R.id.tab14);
        specs.setIndicator("Department");
        th.addTab(specs);

        specs = th.newTabSpec("14");
        specs.setContent(R.id.tab15);
        specs.setIndicator("Staff");
        th.addTab(specs);


    }



}