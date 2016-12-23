package com.ghec.shekharmandhotra.ghec;

import android.app.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Email extends Activity{
    private EditText subject,body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        subject=(EditText)findViewById(R.id.subject);
        body=(EditText)findViewById(R.id.body);

        Button sendBtn=(Button)findViewById(R.id.sendEmail);
        sendBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {

                sendEmail();

                subject.setText("");
                body.setText("");
            }
        });
    }
    protected void sendEmail(){

        String[] recipients={"contact@ghec.co.in"};
        Intent email=new Intent(Intent.ACTION_SEND, Uri.parse("mailto:"));
        email.setType("message/rfc822");
        email.putExtra(Intent.EXTRA_EMAIL,recipients);
        email.putExtra(Intent.EXTRA_SUBJECT,subject.getText().toString());
        email.putExtra(Intent.EXTRA_TEXT,body.getText().toString());

        try {
            startActivity(Intent.createChooser(email, "Choose an email client from..."));
        }catch (android.content.ActivityNotFoundException ex){

            Toast.makeText(Email.this,"No email client installed.",Toast.LENGTH_LONG).show();
        }

    }

}
