package com.example.testproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import java.lang.annotation.Target;

public class ChernobylActivity extends AppCompatActivity {

    VideoView vidchernobyl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chernobyl);

        vidchernobyl = (VideoView) findViewById(R.id.vidchernobyl);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.chernobyl);
        vidchernobyl.setVideoURI(uri);
        vidchernobyl.setMediaController(new MediaController(ChernobylActivity.this));
        vidchernobyl.start();
    }
}