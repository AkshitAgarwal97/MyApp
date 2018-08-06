package com.example.akki.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.imageview1);
        Animation anim= AnimationUtils.loadAnimation(this,R.anim.acti);
        anim.setAnimationListener(this);
        img.startAnimation(anim);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent in=new Intent(MainActivity.this,Select1.class);
        startActivity(in);
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
