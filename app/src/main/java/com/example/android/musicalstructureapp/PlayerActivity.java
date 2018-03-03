package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PlayerActivity extends AppCompatActivity {

    String currentlyChartNumber;
    String currentlyTrackId;

    //Go Back To The Music List.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(this, R.string.backTop10, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_activity);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        if (getIntent().getExtras() != null) {
            Intent intent = getIntent();
            Bundle receivedData = intent.getExtras();
            // rest of the processing
            if (!receivedData.isEmpty()) {
                if (receivedData.containsKey("musicDataArray")) {
                    String[] musicDataArray = receivedData.getStringArray("musicDataArray");
                    if (musicDataArray != null) {
                        currentlyChartNumber = musicDataArray[0];
                        currentlyTrackId = musicDataArray[1];
                    }
                    Toast.makeText(this, "Now playing: " + currentlyChartNumber + "\n" + currentlyTrackId, Toast.LENGTH_LONG).show();
                }
            }
        }
        // Find the View that shows the Home category
        Button home = (Button) findViewById(R.id.home_Button);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home Button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent homeIntent = new Intent(PlayerActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(homeIntent);
            }
        });
    }
}