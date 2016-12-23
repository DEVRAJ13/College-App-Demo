package com.ghec.shekharmandhotra.ghec;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Shekhar Mandhotra on 07-05-2016.
 */
public class Electrical extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.electrical);
        TabHost th = (TabHost) findViewById(R.id.tabHost);
        th.setup();
        TabHost.TabSpec specs = th.newTabSpec("tag9");
        specs.setContent(R.id.tab9);
        specs.setIndicator("Department");
        th.addTab(specs);

        specs = th.newTabSpec("tag10");
        specs.setContent(R.id.tab10);
        specs.setIndicator("Staff");
        th.addTab(specs);


    }



}
