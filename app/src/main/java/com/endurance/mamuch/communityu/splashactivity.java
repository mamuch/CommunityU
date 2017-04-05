package com.endurance.mamuch.communityu;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class splashactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_splashactivity);

        int SPLASH_TIME_OUT = 5000;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                    Intent mainintent = new Intent(splashactivity.this,home.class);
                            splashactivity.this.startActivity(mainintent);
                            splashactivity.this.finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
