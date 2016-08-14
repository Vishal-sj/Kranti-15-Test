package com.example.vishalsj.kranti15;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.view.View;
import android.widget.VideoView;
import android.graphics.PixelFormat;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPlayVideo2 = (Button) findViewById(R.id.button);
        getWindow().setFormat(PixelFormat.TRANSPARENT);
//displays a video file
        VideoView mVideoView2 = (VideoView) findViewById(R.id.videoView1);
        String uriPath2 = "android.resource://com.example.vishalsj.kranti15/" + R.raw.krantivid;
        Uri uri2 = Uri.parse(uriPath2);
        mVideoView2.setVideoURI(uri2);
        mVideoView2.requestFocus();
        mVideoView2.start();
        findViewById(R.id.button1).setOnClickListener(new handleButton());
        findViewById(R.id.button2).setOnClickListener(new handleButton2());
        findViewById(R.id.button3).setOnClickListener(new handleButton3());
        findViewById(R.id.button5).setOnClickListener(new handleButton5());
        findViewById(R.id.button6).setOnClickListener(new handleButton6());

        buttonPlayVideo2.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                VideoView mVideoView2 = (VideoView) findViewById(R.id.videoView1);
// VideoView mVideoView = new VideoView(this);
                String uriPath = "android.resource://com.example.vishalsj.kranti15/" + R.raw.krantivid;
                Uri uri2 = Uri.parse(uriPath);
                mVideoView2.setVideoURI(uri2);
                mVideoView2.requestFocus();
                mVideoView2.start();
            }
        });
    }

    class handleButton implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, MapsActivity.class);
            startActivity(intent);
        }
    }

    class handleButton2 implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Trailer1Activity.class);
            startActivity(intent);
        }
    }

    class handleButton3 implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Trailer2Activity.class);
            startActivity(intent);
        }
    }

    class handleButton5 implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, WebActivity.class);
            startActivity(intent);
        }
    }

    class handleButton6 implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, GalleryActivity.class);
            startActivity(intent);
        }
    }
}
