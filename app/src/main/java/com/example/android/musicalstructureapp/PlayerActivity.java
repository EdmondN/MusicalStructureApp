package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class PlayerActivity extends AppCompatActivity {

    String currentlyChartNumber;
    String currentlyTrackId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_activity);

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