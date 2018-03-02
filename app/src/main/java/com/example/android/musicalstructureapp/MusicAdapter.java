package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class MusicAdapter extends ArrayAdapter<Music> {

    public MusicAdapter(Activity context, List<Music> musics) {
        super(context, 0, musics);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Music currentMusic = getItem(position);

        TextView chartTextView = (TextView) listItemView.findViewById(R.id.chart_text_view);
        chartTextView.setText(currentMusic.getChartNumber());

        TextView trackIDTextView = (TextView) listItemView.findViewById(R.id.trackID_text_view);
        trackIDTextView.setText(currentMusic.getTrackID());

        return listItemView;
    }

}
