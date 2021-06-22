package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView play;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = findViewById(R.id.play);
        mp = MediaPlayer.create(MainActivity.this,R.raw.m1);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                checking music is playing or not
                if(mp.isPlaying()){
                    play.setImageResource(R.drawable.pause_button);

                }else{

                }
            }
        });

        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
            }
        });

    }
}