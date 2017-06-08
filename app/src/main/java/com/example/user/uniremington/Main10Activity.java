package com.example.user.uniremington;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main10Activity extends AppCompatActivity {
    String url = "http://www.uniremington.edu.co/manizales/buscador.html?isc=1&category_id=&xf_1=2&xf_2=33&programa=si";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        WebView web = (WebView) findViewById(R.id.tecnolo);
        web.setWebViewClient(new Main10Activity.MyWebViewClient());
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        web.loadUrl(url);
    }

    public class MyWebViewClient extends WebViewClient {
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}

