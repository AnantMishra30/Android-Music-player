package com.example.anantmishra.basicmusicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public MediaPlayer mediaPlayer;
    private Button playButton;
    private Button pauseButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer=MediaPlayer.create(this,R.raw.zinda);
        playButton= (Button) findViewById(R.id.play);
        pauseButton= (Button) findViewById(R.id.pause);
    }

    public void playMusic(View view){
        mediaPlayer.start();
    }

    public void pauseMusic(View view){
        mediaPlayer.pause();
    }
}
