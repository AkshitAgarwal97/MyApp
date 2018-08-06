package com.example.akki.myapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class Music extends AppCompatActivity implements View.OnClickListener {
MediaPlayer m1;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        b1.findViewById(R.id.button1);
        b1.setOnClickListener(this);
        m1=MediaPlayer.create(this,R.raw.r);
        try {
            m1.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View v) {
        m1.start();
    }
}
