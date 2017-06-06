package com.example.user.uniremington;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.RadioButton;

public class MainActivityvalidacion extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityvalidacion);


        this.setContentView(R.layout.activity_main_activityvalidacion);
        WebView myWebView = (WebView) this.findViewById(R.id.validacion);
        myWebView.loadUrl("https://www.q10academico.com/login?ReturnUrl=/&aplentId=a2e25504-9d7b-4e4e-861a-5f015f373d8f");


    }
}
