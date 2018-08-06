package com.example.akki.myapp;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class camera extends AppCompatActivity implements View.OnClickListener {
ImageView i1;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        i1=findViewById(R.id.imageview1);
        b1=findViewById(R.id.button1);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent in= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(in,1);
    }
}
