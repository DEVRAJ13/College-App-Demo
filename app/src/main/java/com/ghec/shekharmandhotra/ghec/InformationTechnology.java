package com.ghec.shekharmandhotra.ghec;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Shekhar Mandhotra on 07-05-2016.
 */
public class InformationTechnology extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informationtech);
        TabHost th = (TabHost) findViewById(R.id.tabHost);
        th.setup();
        TabHost.TabSpec specs = th.newTabSpec("tag11");
        specs.setContent(R.id.tab11);
        specs.setIndicator("Department");
        th.addTab(specs);

        specs = th.newTabSpec("tag12");
        specs.setContent(R.id.tab12);
        specs.setIndicator("Staff");
        th.addTab(specs);


    }



}
