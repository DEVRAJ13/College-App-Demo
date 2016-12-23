package com.ghec.shekharmandhotra.ghec;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Shekhar Mandhotra on 27-04-2016.
 */
public class Payments extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.epayments);
    }
    public void onClick55(View v) {
        startActivity(new Intent("com.ghec.shekharmandhotra.ghec.Student"));

    }
    public void onClick66(View v) {
        startActivity(new Intent("com.ghec.shekharmandhotra.ghec.Admin"));

    }
}
