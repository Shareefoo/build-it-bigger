package com.udacity.displayjokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class DisplayJokesActivity extends AppCompatActivity {

    public static final String KEY_JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_jokes);

        // get the joke from intent and display it
        String joke = getIntent().getStringExtra(KEY_JOKE);
        Toast.makeText(this, joke, Toast.LENGTH_LONG).show();
    }

}