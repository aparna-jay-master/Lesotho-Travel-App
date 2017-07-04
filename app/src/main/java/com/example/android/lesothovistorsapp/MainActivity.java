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

        // Find the View that shows the Historic Sites category
        TextView historic = (TextView) findViewById(R.id.historic_sites);

        // Set a click listener on that View
        historic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HistoricSites}
                Intent historicIntent = new Intent(MainActivity.this, HistoricSites.class);

                // Start the new activity
                startActivity(historicIntent);
            }
        });

        // Find the View that shows the Activities category
        TextView activities = (TextView) findViewById(R.id.activities);

        // Set a click listener on that View
        activities.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Activities category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Activities}
                Intent activitiesIntent = new Intent(MainActivity.this, Activities.class);

                // Start the new activity
                startActivity(activitiesIntent);
            }
        });

        // Find the View that shows the Nature category
        final TextView nature = (TextView) findViewById(R.id.nature);

        // Set a click listener on that View
        nature.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Nature category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Nature}
                Intent natureIntent = new Intent(MainActivity.this, Nature.class);

                // Start the new activity
                startActivity(natureIntent);
            }
        });

        // Find the View that shows the Landmark category
        final TextView landmarks = (TextView) findViewById(R.id.landmarks);

        // Set a click listener on that View
        landmarks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Landmarks category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Nature}
                Intent landmarksIntent = new Intent(MainActivity.this, Landmarks.class);

                // Start the new activity
                startActivity(landmarksIntent);
            }
        });
    }
}
