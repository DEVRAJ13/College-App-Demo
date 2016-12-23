package com.ghec.shekharmandhotra.ghec;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;




public class MainActivity extends Activity {
   final CharSequence[] items = {"01792262501", "01792262503", "+919418024393"};
    ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewFlipper vflipp=(ViewFlipper)findViewById(R.id.flipper1) ;
        vflipp.startFlipping();

        button=(ImageButton)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

// TODO Auto-generated method stub

                AlertDialog.Builder builder3 = new AlertDialog.Builder(MainActivity.this);
                builder3.setTitle("Contacts").setItems(items, new DialogInterface.OnClickListener() {

                    @Override

                    public void onClick(DialogInterface dialog, int which) {

// TODO Auto-generated method stub


                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:" + items[which]));
                        startActivity(callIntent);

                        Toast.makeText(getApplicationContext(), "Calling... " + items[which], Toast.LENGTH_LONG).show();

                    }

                });

                builder3.show();

            }

        });




    }



    public void onClick2(View v) {
        startActivity(new Intent("com.ghec.shekharmandhotra.ghec.Departments"));

    }
    public void onClick10(View v) {
        startActivity(new Intent("com.ghec.shekharmandhotra.ghec.INFO"));

    }public void onClick33(View v) {
        startActivity(new Intent("com.ghec.shekharmandhotra.ghec.EMAIL"));


    }
    public void onClick20(View v) {
        startActivity(new Intent("com.ghec.shekharmandhotra.ghec.WEBSITE"));


    }
    public void onClick12(View v){
        startActivity(new Intent("com.ghec.shekharmandhotra.ghec.MapsActivity"));
    }
    public void onClick44(View v){
        startActivity(new Intent("com.ghec.shekharmandhotra.ghec.Payments"));
    }


}
