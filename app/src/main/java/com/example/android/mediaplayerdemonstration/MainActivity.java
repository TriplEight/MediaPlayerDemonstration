package com.example.android.mediaplayerdemonstration;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mySound;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySound = MediaPlayer.create(this, R.raw.smellsliketeenspirit);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mySound.release();
    }

    public void playMusic(View view) {
        mySound.start();

    }

}
