package com.example.basicphases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public void playPhrases(View view){
        String btnTag = view.getTag().toString();
        Log.i("play"+btnTag,"clicked");
        MediaPlayer mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(btnTag,
                "raw", getPackageName()));
        mediaPlayer.start();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}