package com.ghec.shekharmandhotra.ghec;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Shekhar Mandhotra on 02-04-2016.
 */
public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent openMainActivity = new Intent("com.ghec.shekharmandhotra.ghec.MAINACTIVITY");
                    startActivity(openMainActivity);
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
