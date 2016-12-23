package com.ghec.shekharmandhotra.ghec;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Shekhar Mandhotra on 02-04-2016.
 */
public class Departments extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.departments);

    }
    public void onClick3(View v) {
        startActivity(new Intent("com.ghec.shekharmandhotra.ghec.MENU"));


    }
    public void onClick5(View v) {
        startActivity(new Intent("com.ghec.shekharmandhotra.ghec.MENUTWO"));


    }
}
