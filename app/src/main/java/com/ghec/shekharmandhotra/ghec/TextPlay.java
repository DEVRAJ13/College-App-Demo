package com.ghec.shekharmandhotra.ghec;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

/**
 * Created by Shekhar Mandhotra on 02-04-2016.
 */
public class TextPlay extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text);

        Button chkCmd = (Button)findViewById(R.id.bResult);
        ToggleButton passTog = (ToggleButton) findViewById(R.id.tbPassword);
        EditText input = (EditText) findViewById(R.id.etCommands);
        TextView display = (TextView) findViewById(R.id.tvResults);

    }
}

