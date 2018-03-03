package com.example.android.musicalstructureapp;

public class Music {

    private String mChartNumber;

    private String mTrackID;

    public Music(String chartNumber, String trackID) {
        mChartNumber = chartNumber;
        mTrackID = trackID;
    }

    public String getChartNumber() {
        return mChartNumber;
    }

    public String getTrackID() {
        return mTrackID;
    }
}