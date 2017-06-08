package com.example.user.uniremington;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main5Activity extends AppCompatActivity {

    String url= "https://accounts.google.com/ServiceLogin/signinchooser?hl=es&passive=true&continue=https%3A%2F%2Fwww.google.com.co%2Fwebhp%3Fauthuser%3D0&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        WebView web= (WebView) findViewById(R.id.correo);
        web.setWebViewClient(new Main5Activity.MyWebViewClient());
        WebSettings settings= web.getSettings();
        settings.setJavaScriptEnabled(true);
        web.loadUrl(url);
    }
    public class MyWebViewClient extends WebViewClient {
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}
