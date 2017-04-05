package com.endurance.mamuch.communityu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AboutCu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_cu);

        Button getsignin = (Button)findViewById(R.id.btnBackLogin);
        Button getRegister = (Button)findViewById(R.id.btnBackReg);
        Button browseComm = (Button) findViewById(R.id.btnBrowse);

        getsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getBack = new Intent(AboutCu.this,home.class);
                startActivity(getBack);
            }
        });

        getRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getRegBack = new Intent(AboutCu.this,register.class);
                startActivity(getRegBack);
            }
        });

        browseComm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Intent getHome = new Intent(AboutCu.this,MainPage.class);
                startActivity(getHome);
                //TODO get the Browse Button to point to a community browse page for communities only.
            }
        });


    }
}
