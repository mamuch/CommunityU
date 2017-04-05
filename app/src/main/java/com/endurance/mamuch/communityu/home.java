package com.endurance.mamuch.communityu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.endurance.mamuch.communityu.R.layout.activity_home;

public class home extends AppCompatActivity {
    //TODO Declare all global variables here.
    Button register;
    Button loginHome;
    Button aboutButton;
    Button forgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_home);

        register = (Button) findViewById(R.id.btnregister);
        loginHome = (Button) findViewById(R.id.btnsignin);
        forgotPassword = (Button) findViewById(R.id.forgotpassword);
        aboutButton = (Button) findViewById(R.id.aboutcu);

        register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this,register.class);
                startActivity(intent);
            }
        });

        loginHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intention = new Intent(home.this,MainPage.class);
                startActivity(intention);
                //TODO Make this button signin when the user entered boht the Username and correct password.
            }
        });

        aboutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentAbout = new Intent(home.this,AboutCu.class);
                startActivity(intentAbout);
            }
        });

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentForgot = new Intent(home.this,forgotpassword.class);
                startActivity(intentForgot);
            }
        });
    }
}
