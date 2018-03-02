package com.example.android.musicalstructureapp;

import java.util.ArrayList;
import java.util.List;

public class MusicDataStorage {

    public static List<Music> getDanceMusic() {
        List<Music> musics = new ArrayList<>();
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
        return musics;
    }

    public static List<Music> getHiphopMusic() {
        List<Music> musics = new ArrayList<>();
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
        return musics;
    }

    public static List<Music> getPopMusic() {
        List<Music> musics = new ArrayList<>();
        musics.add(new Music("Top 1", "Perfect - Ed Sheeran"));
        musics.add(new Music("Top 2", "For You (Fifty Shades Freed) - Liam Payne & Rita Ora"));
        musics.add(new Music("Top 3", "Never Be The Same - Camila Cabello"));
        musics.add(new Music("Top 4", "Échame La Culpa - Luis Fonsi & Demi Lovato"));
        musics.add(new Music("Top 5", "Havana - Camila Cabello Feat. Young Thug"));
        musics.add(new Music("Top 6", "Say Something - Justin Timberlake Feat. Chris Stapleton"));
        musics.add(new Music("Top 7", "Mine - Bazzi"));
        musics.add(new Music("Top 8", "Finesse (Remix) - Bruno Mars Feat. Cardi B"));
        musics.add(new Music("Top 9", "New Rules - Dua Lipa"));
        musics.add(new Music("Top 10", "IDGAF - Dua Lipa"));
        return musics;
    }

    public static List<Music> getLatinMusic() {
        List<Music> musics = new ArrayList<>();
        musics.add(new Music("Top 1", "La Modelo - Cardi B & Ozuna"));
        musics.add(new Music("Top 2", "Dura - Daddy Yankee"));
        musics.add(new Music("Top 3", "El Farsante - Ozuna"));
        musics.add(new Music("Top 4", "Amorfoda - Bad Bunny"));
        musics.add(new Music("Top 5", "Mi Gente - J Balvin & Willy William Feat. Beyoncé"));
        musics.add(new Music("Top 6", "Sensualidad - Bad Bunny & Prince Royce & J Balvin"));
        musics.add(new Music("Top 7", "Machika - Anitta, J. Balvin & Jeon"));
        musics.add(new Music("Top 8", "Échame La Culpa - Luis Fonsi & Demi Lovato"));
        musics.add(new Music("Top 9", "El Baño - Enrique Iglesias Feat. Bad Bunny"));
        musics.add(new Music("Top 10", "Solita - Almighty, Bad Bunny, DJ Luian, Mambo Kingz, Ozuna & Wisin"));
        return musics;
    }
}