package com.example.adelina.newlab4;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by Adelina on 06.05.2018.
 */

public class VideoActivity extends Activity {

    VideoView videoPlayer;
    VideoView videoPlayerInternet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_video);

        videoPlayer =  (VideoView)findViewById(R.id.videoPlayer);

        videoPlayer.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.video));

        MediaController mediaController = new MediaController(this);
        videoPlayer.setMediaController(mediaController);
        mediaController.setMediaPlayer(videoPlayer);

       // videoPlayerInternet =  (VideoView)findViewById(R.id.videoPlayerInternet);
      //  videoPlayer.setVideoPath("https://www.youtube.com/watch?v=wEKLEeY_WeQ");
    }

  //  public void play(View view){
  //      videoPlayerInternet.start();
   // }
    //public void pause(View view){
      //  videoPlayerInternet.pause();
   // }
   // public void stop(View view){
     //   videoPlayer.stopPlayback();
       // videoPlayerInternet.resume();
    //}
}
