package com.udacity.windy.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button spotify;
    Button scores;
    Button library;
    Button build;
    Button reader;
    Button capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotify = (Button) findViewById(R.id.spotify_btn);
        spotify.setOnClickListener(this);

        scores = (Button) findViewById(R.id.scores_btn);
        scores.setOnClickListener(this);


        library = (Button) findViewById(R.id.library_btn);
        library.setOnClickListener(this);


        build = (Button) findViewById(R.id.build_btn);
        build.setOnClickListener(this);

        reader = (Button) findViewById(R.id.reader_btn);
        reader.setOnClickListener(this);

        capstone = (Button) findViewById(R.id.capstone_btn);
        capstone.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.spotify_btn:
                Toast.makeText(MainActivity.this,"This button will launch my spotify app",Toast.LENGTH_SHORT).show();
                break;
            case R.id.scores_btn:
                Toast.makeText(MainActivity.this,"This button will launch my scores app",Toast.LENGTH_SHORT).show();
                break;
            case R.id.library_btn:
                Toast.makeText(MainActivity.this,"This button will launch my library app",Toast.LENGTH_SHORT).show();
                break;
            case R.id.build_btn:
                Toast.makeText(MainActivity.this,"This button will launch my build app",Toast.LENGTH_SHORT).show();
                break;
            case R.id.reader_btn:
                Toast.makeText(MainActivity.this,"This button will launch my Reader app",Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone_btn:
                Toast.makeText(MainActivity.this,"This button will launch my capstone app",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

    }
}
