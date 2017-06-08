package com.example.user.uniremington;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        this.setContentView(R.layout.activity_main3);
        WebView myWebView = (WebView) this.findViewById(R.id.q10);
        myWebView.loadUrl("https://www.q10academico.com/login?ReturnUrl=/&aplentId=a2e25504-9d7b-4e4e-861a-5f015f373d8f");
    }

}




