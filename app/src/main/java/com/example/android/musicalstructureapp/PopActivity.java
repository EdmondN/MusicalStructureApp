package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Eddie on 28/2/2018.
 */

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // Create a list of words
        ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(new Music("Top 1", "Perfect - Ed Sheeran"));
        musics.add(new Music("Top 2", "For You (Fifty Shades Freed) - Liam Payne & Rita Ora"));
        musics.add(new Music("Top 3", "Never Be The Same - Camila Cabello"));
        musics.add(new Music("Top 4", "Échame La Culpa - Luis Fonsi & Demi Lovato"));
        musics.add(new Music("Top 5", "Havana - Camila Cabello Feat. Young Thug"));
        musics.add(new Music("Top 6", "Say Something - Justin Timberlake Feat. Chris Stapleton"));
        musics.add(new Music("Top 7", "Mine - Bazzi"));
        musics.add(new Music("Top 8", "Finesse (Remix) - Bruno Mars Feat. Cardi B"));
        musics.add(new Music("Top 9", "New Rules - Dua Lipa"));
        musics.add(new Music("Top 10","IDGAF - Dua Lipa"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        MusicAdapter adapter =
                new MusicAdapter(this, musics);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
