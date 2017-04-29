package com.example.android.musia_musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.main_activity_name);

//Interpret activity call intent
        Button showInterpret = (Button) findViewById(R.id.open_interpret_btn);

        showInterpret.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent aboutInterpretIntent = new Intent(MainActivity.this, AboutInterpret.class);

                // Start the new activity
                startActivity(aboutInterpretIntent);
            }
        });

        // Album details activity call

        Button showAlbumDetails= (Button) findViewById(R.id.open_album_btn);

        showAlbumDetails.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent albumDetails = new Intent(MainActivity.this, AlbumDetails.class);

                // Start the new activity
                startActivity(albumDetails);
            }
        });


        // Song details activity call

        Button showSongDetails= (Button) findViewById(R.id.song_detail_btn);

        showSongDetails.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent songDetails = new Intent(MainActivity.this, SongDetail.class);

                // Start the new activity
                startActivity(songDetails);
            }
        });
    }
}
