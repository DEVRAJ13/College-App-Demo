package com.ghec.shekharmandhotra.ghec;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Shekhar Mandhotra on 02-04-2016.
 */
public class Civil extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.civil);
        TabHost th = (TabHost) findViewById(R.id.tabHost);
        th.setup();
        TabHost.TabSpec specs = th.newTabSpec("tag3");
        specs.setContent(R.id.tab3);
        specs.setIndicator("Department");
        th.addTab(specs);

        specs = th.newTabSpec("tag4");
        specs.setContent(R.id.tab4);
        specs.setIndicator("Staff");
        th.addTab(specs);


    }

}
