package com.netscapelabs.surpriseme.grocery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends AppCompatActivity {
    ImageView logoicon;
    TextView mtxtheader;
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        logoicon=findViewById(R.id.logo);
        mtxtheader=findViewById(R.id.logotext);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.topanimation);
        Animation animation2=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rightmoveanimation);
        logoicon.startAnimation(animation);
        mtxtheader.startAnimation(animation2);
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(splash.this,Mainpagelogin.class);
                startActivity(intent);
            }
        },2000);

    }


}