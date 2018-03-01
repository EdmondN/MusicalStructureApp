package com.example.android.musicalstructureapp;

/**
 * Created by Eddie on 28/2/2018.
 */

public class Music {

    /**
     * Default translation for the word
     */
    private String mChartNumber;

    /**
     * Miwok translation for the word
     */
    private String mTrackID;


    public Music(String ChartNumber, String TrackID) {
        mChartNumber = ChartNumber;
        mTrackID = TrackID;
    }

    /**
     * Get the default translation of the word.
     */
    public String getChartNumber() {

        return mChartNumber;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getTrackID() {
        return mTrackID;
    }

}