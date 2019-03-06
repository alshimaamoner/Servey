package com.example.hp.servey;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
       new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
Intent intent=new Intent(SplashActivity.this,Login.class);
startActivity(intent);
            }
        },2000);
    }
}
