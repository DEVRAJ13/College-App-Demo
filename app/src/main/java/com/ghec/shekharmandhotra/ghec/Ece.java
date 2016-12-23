package com.ghec.shekharmandhotra.ghec;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Shekhar Mandhotra on 08-05-2016.
 */
public class Ece extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ece);
        TabHost th = (TabHost) findViewById(R.id.tabHost);
        th.setup();
        TabHost.TabSpec specs = th.newTabSpec("tag16");
        specs.setContent(R.id.tab16);
        specs.setIndicator("Department");
        th.addTab(specs);

        specs = th.newTabSpec("tag17");
        specs.setContent(R.id.tab17);
        specs.setIndicator("Staff");
        th.addTab(specs);


    }



}