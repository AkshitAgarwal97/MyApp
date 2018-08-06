package com.example.akki.myapp;

import android.renderscript.Script;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class brouser extends AppCompatActivity implements View.OnClickListener {
EditText e1;
Button b1;
WebView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brouser);
        e1=findViewById(R.id.edittext1);
        w1=findViewById(R.id.webview1);
        w1.getSettings().setJavaScriptEnabled(true);
        w1.setWebViewClient(new WebViewClient());
        w1.loadUrl("http://www.google.com");
        b1=findViewById(R.id.button1);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String url=e1.getText().toString();
        w1.loadUrl("http://"+ url);
    }
}
