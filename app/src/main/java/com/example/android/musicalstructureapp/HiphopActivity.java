package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HiphopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // Create a list of music
        final ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(new Music("Top 1", "All The Stars - Kendrick Lamar & SZA"));
        musics.add(new Music("Top 2", "God's Plan - Drake"));
        musics.add(new Music("Top 3", "Pray For Me - The Weeknd & Kendrick Lamar"));
        musics.add(new Music("Top 4", "rockstar - Post Malone Feat. 21 Savage"));
        musics.add(new Music("Top 5", "Him & I - G-Eazy & Halsey"));
        musics.add(new Music("Top 6", "Bum Bum Tam Tam - MC Fioti Feat. J Balvin & Future & Stefflon Don & Juan Magan"));
        musics.add(new Music("Top 7", "Look Alive - BlocBoy JB Feat. Drake"));
        musics.add(new Music("Top 8", "Lemon - N.E.R.D & Rihanna"));
        musics.add(new Music("Top 9", "Psycho - Post Malone Feat. Ty Dolla $Ign"));
        musics.add(new Music("Top 10", "Mi Gna (Maître Gims Remix) - Maître Gims & Super Sako Feat. Hayko"));

        // Create an {@link MusicAdapter}, whose data source is a list of {@link Music}s. The
        // adapter knows how to create list items for each item in the list.
        MusicAdapter adapter =
                new MusicAdapter(this, musics);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // music_listy file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WMusicAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Music} in the list.
        listView.setAdapter(adapter);
        // Bind the abstract method to the ListView and gives parameters to its interface
        // And It Shows what the Music ChartNumber and TrackID the user clicks
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent playerIntent = new Intent(HiphopActivity.this, PlayerActivity.class);
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
