package com.example.splash2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;





public class SplashActivity extends AppCompatActivity {

    ImageView ivSplash;
    TextView tvSplash;

    //Object of Animation Class
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ivSplash=findViewById(R.id.ivSplash);
        tvSplash=findViewById(R.id.tvSplash);

        //Load Animation
        animation = AnimationUtils.loadAnimation(this,R.anim.splash_animation);

        //Set Animation Listerner
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                startActivity(new Intent(SplashActivity.this,MainActivity.class));
                finish();


            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }


    //**********************************
    //Default method of activity lifecycle
    @Override
    protected void onStart() {
        super.onStart();
        ivSplash.startAnimation(animation);
        tvSplash.startAnimation(animation);
    }
}