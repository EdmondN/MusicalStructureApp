package com.example.android.musicalstructureapp;

public class Music {

    private String mChartNumber;

    private String mTrackID;

    public Music(String ChartNumber, String TrackID) {
        mChartNumber = ChartNumber;
        mTrackID = TrackID;
    }

    public String getChartNumber() {
        return mChartNumber;
    }

    public String getTrackID() {
        return mTrackID;
    }
}