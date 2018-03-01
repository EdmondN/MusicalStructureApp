package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class DanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);
        
        // Create a list of Music
        final ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(new Music("Top 1", "Breathe - Jax Jones Feat. Ina Wroldsen"));
        musics.add(new Music("Top 2", "These Days - Rudimental Feat. Jess Glynne, Macklemore & Dan Caplen"));
        musics.add(new Music("Top 3", "The Middle - Zedd, Maren Morris & Grey"));
        musics.add(new Music("Top 4", "Best Friend - Sofi Tukker Feat. NERVO & The Knocks & Alisa Ueno"));
        musics.add(new Music("Top 5", "Drunk Groove - MARUV & BOOSIN"));
        musics.add(new Music("Top 6", "Cola - CamelPhat & Elderbrook"));
        musics.add(new Music("Top 7", "Katchi (Ofenbach Vs. Nick Waterhouse)"));
        musics.add(new Music("Top 8", "Crazy - Lost Frequencies & Zonderling"));
        musics.add(new Music("Top 9", "So Far Away - Martin Garrix & David Guetta Feat. Jamie Scott & Romy Dya"));
        musics.add(new Music("Top 10", "La Louze - SHANGUY"));

        // Create an {@link MusicAdapter}, whose data source is a list of {@link Music}s. The
        // adapter knows how to create list items for each item in the list.
        MusicAdapter adapter =
                new MusicAdapter(this, musics);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // music_list file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@link MusicAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Music} in the list.
        listView.setAdapter(adapter);
        // Bind the abstract method to the ListView and gives parameters to its interface
        // And It Shows what the Music ChartNumber and TrackID the user clicks
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent playerIntent = new Intent(DanceActivity.this, PlayerActivity.class);
                Music currentTrack = musics.get(position);
                Bundle dataForNextActivity = new Bundle();

                String[] musicDataArray = {currentTrack.getChartNumber(), currentTrack.getTrackID()};
                dataForNextActivity.putStringArray("musicDataArray", musicDataArray);

                playerIntent.putExtras(dataForNextActivity);
                startActivity(playerIntent);
            }
        });
    }
}
