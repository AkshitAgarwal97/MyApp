package com.example.akki.myapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class video extends AppCompatActivity {
VideoView vv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        vv=findViewById(R.id.videoview1);
        MediaController c=new MediaController(this);
        vv.setMediaController(c);
        Uri uri=Uri.parse("//android.resources://"+getPackageName()+"/"+R.raw.v);
        vv.setVideoURI(uri);
    }
}
