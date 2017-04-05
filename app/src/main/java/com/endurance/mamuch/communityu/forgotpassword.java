package com.endurance.mamuch.communityu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.endurance.mamuch.communityu.R.id.fpemail;

public class forgotpassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);

        Button getCode = (Button) findViewById(R.id.sendCode);
        Button backToSignIn = (Button) findViewById(R.id.backSignin);

        backToSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getBack = new Intent(forgotpassword.this,home.class);
                startActivity(getBack);
            }
        });

        getCode.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                //TODO Make an a condition to accept login input.
                EditText emailCode = (EditText) findViewById(fpemail);
                String fpemail = emailCode.getText().toString();

                Toast toast = new Toast(getApplicationContext());
            }
        });


    }
}
