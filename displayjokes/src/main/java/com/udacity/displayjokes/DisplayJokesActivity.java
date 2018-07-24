package com.udacity.displayjokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class DisplayJokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_jokes);

        // get the joke from intent and display it
        String joke = getIntent().getStringExtra("joke");
        Toast.makeText(this, joke, Toast.LENGTH_LONG).show();
    }

}