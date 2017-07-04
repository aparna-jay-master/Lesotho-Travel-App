package com.example.android.lesothovistorsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Landmark category
        final TextView landmarks = (TextView) findViewById(R.id.landmarks);

        // Set a click listener on that View
        landmarks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Landmarks category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Landmarks}
                Intent landmarksIntent = new Intent(MainActivity.this, Landmarks.class);

                // Start the new activity
                startActivity(landmarksIntent);
            }
        });

        // Find the View that shows the Language category
        final TextView language = (TextView) findViewById(R.id.language);

        // Set a click listener on that View
        language.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Landmarks category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Landmarks}
                Intent languageIntent = new Intent(MainActivity.this, LanguageActivity.class);

                // Start the new activity
                startActivity(languageIntent);
            }
        });
    }
}
