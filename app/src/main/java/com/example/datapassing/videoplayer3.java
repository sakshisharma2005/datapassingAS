package com.example.datapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class videoplayer3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_videoplayer3 );

        VideoView videoView = findViewById( R.id.videoView );

        String vPath = "android.resource://" + getPackageName() + "/raw/doremon";
        String onlinePath = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4";

        //Uri videoURI = Uri.parse(vPath);
        Uri onlineVideoURI = Uri.parse( onlinePath );

        //videoView.setVideoPath( vPath );
        videoView.setVideoURI( onlineVideoURI );
        videoView.start();

        MediaController mediaController = new MediaController( this );
        videoView.setMediaController( mediaController );
        mediaController.setAnchorView( videoView );
    }
}