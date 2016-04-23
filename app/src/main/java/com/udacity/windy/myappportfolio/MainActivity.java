package com.udacity.windy.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotify = (Button) findViewById(R.id.spotify_btn);
        spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my spotify app",Toast.LENGTH_SHORT).show();
            }
        });

        Button scores = (Button) findViewById(R.id.scores_btn);
        scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my scores app",Toast.LENGTH_SHORT).show();
            }
        });


        Button library = (Button) findViewById(R.id.library_btn);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my library app",Toast.LENGTH_SHORT).show();
            }
        });


        Button build = (Button) findViewById(R.id.build_btn);
        build.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my build app",Toast.LENGTH_SHORT).show();
            }
        });

        Button reader = (Button) findViewById(R.id.reader_btn);
        reader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my Reader app",Toast.LENGTH_SHORT).show();
            }
        });

        Button capstone = (Button) findViewById(R.id.capstone_btn);
        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my capstone app",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
