package com.example.akki.myapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class call extends AppCompatActivity {
EditText e1;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        e1.findViewById(R.id.edittext1);
        b1=findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=e1.getText().toString();
                Uri uri= Uri.parse("tel : " + s);
                Intent in=new Intent(Intent.ACTION_CALL, uri);
                startActivity(in);

            }
        });
    }
}
