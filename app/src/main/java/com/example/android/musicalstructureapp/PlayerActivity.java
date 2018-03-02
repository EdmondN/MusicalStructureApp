package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
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
        Toast.makeText(this, "You Are Back to The Top 10 Chart List", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_activity);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        Bundle receivedData = intent.getExtras();
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
}