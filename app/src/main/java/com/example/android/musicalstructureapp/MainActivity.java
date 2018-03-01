package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the Dance category
        TextView dance = (TextView) findViewById(R.id.textViewDance);

        // Set a click listener on that View
        dance.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DanceActivity}
                Intent danceIntent = new Intent(MainActivity.this, DanceActivity.class);

                // Start the new activity
                startActivity(danceIntent);
            }
        });

        // Find the View that shows the Hiphop category
        TextView hiphop = (TextView) findViewById(R.id.textViewHiphop);

        // Set a click listener on that View
        hiphop.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HiphopActivity}
                Intent hiphopIntent = new Intent(MainActivity.this, HiphopActivity.class);

                // Start the new activity
                startActivity(hiphopIntent);
            }
        });

        // Find the View that shows the Pop category
        TextView pop = (TextView) findViewById(R.id.textViewPop);

        // Set a click listener on that View
        pop.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PopActivity}
                Intent popIntent = new Intent(MainActivity.this, PopActivity.class);

                // Start the new activity
                startActivity(popIntent);
            }
        });

        // Find the View that shows the Latin category
        TextView latin = (TextView) findViewById(R.id.textViewLatin);

        // Set a click listener on that View
        latin.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LatinActivity}
                Intent latinIntent = new Intent(MainActivity.this, LatinActivity.class);

                // Start the new activity
                startActivity(latinIntent);
            }
        });
    }
}
