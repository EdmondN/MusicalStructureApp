package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Eddie on 28/2/2018.
 */

public class LatinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // Create a list of words
        ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(new Music("Top 1", "La Modelo - Cardi B & Ozuna"));
        musics.add(new Music("Top 2", "Dura - Daddy Yankee"));
        musics.add(new Music("Top 3", "El Farsante - Ozuna"));
        musics.add(new Music("Top 4", "Amorfoda - Bad Bunny"));
        musics.add(new Music("Top 5", "Mi Gente - J Balvin & Willy William Feat. Beyoncé"));
        musics.add(new Music("Top 6", "Sensualidad - Bad Bunny & Prince Royce & J Balvin"));
        musics.add(new Music("Top 7", "Machika - Anitta, J. Balvin & Jeon"));
        musics.add(new Music("Top 8", "Échame La Culpa - Luis Fonsi & Demi Lovato"));
        musics.add(new Music("Top 9", "El Baño - Enrique Iglesias Feat. Bad Bunny"));
        musics.add(new Music("Top 10","Solita - Almighty, Bad Bunny, DJ Luian, Mambo Kingz, Ozuna & Wisin"));

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
