package com.example.testproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class ChernobylActivity extends AppCompatActivity {

    WebView webchernobyl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chernobyl);

        webchernobyl = (WebView) findViewById(R.id.webchernobyl);
        webchernobyl.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (Uri.parse(url).getHost().equals("https://www.youtube.com/watch?v=s9APLXM9Ei8")) {
                    Toast.makeText(ChernobylActivity.this, "Error", Toast.LENGTH_SHORT).show();
                    return false;
                }
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                return true;
            }
        });
    }
}