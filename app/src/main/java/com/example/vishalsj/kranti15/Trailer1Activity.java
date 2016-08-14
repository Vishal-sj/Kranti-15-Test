package com.example.vishalsj.kranti15;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;


public class Trailer1Activity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trailer1);


        Button buttonPlayVideo2 = (Button) findViewById(R.id.button);
        getWindow().setFormat(PixelFormat.TRANSPARENT);
//displays a video file
        VideoView mVideoView2 = (VideoView) findViewById(R.id.videoView);
        String uriPath2 = "android.resource://com.example.vishalsj.kranti15/" + R.raw.trailer1;
        Uri uri2 = Uri.parse(uriPath2);
        assert mVideoView2 != null;
        mVideoView2.setVideoURI(uri2);
        mVideoView2.requestFocus();
        mVideoView2.start();

        assert buttonPlayVideo2 != null;

        buttonPlayVideo2.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                VideoView mVideoView2 = (VideoView) findViewById(R.id.videoView);
// VideoView mVideoView = new VideoView(this);
                String uriPath = "android.resource://com.example.vishalsj.kranti15/" + R.raw.trailer1;
                Uri uri2 = Uri.parse(uriPath);
                assert mVideoView2 != null;
                mVideoView2.setVideoURI(uri2);
                mVideoView2.requestFocus();
                mVideoView2.start();
            }
        });


    }

}






