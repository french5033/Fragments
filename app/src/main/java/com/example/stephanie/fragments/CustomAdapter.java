package com.example.stephanie.fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.Button;

public class CustomAdapter extends ArrayAdapter<String> {

    private static final String TAG = "MainActivity";

    CustomAdapter(Context context, String[] names) {
        super(context, R.layout.customlayout_view, names);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater customInflater = LayoutInflater.from(getContext());
        View customView = customInflater.inflate(R.layout.customlayout_view, parent, false);

        //String singleItem = getItem(position);
        //TextView txt4 = (TextView) customView.findViewById(R.id.textView4);
        //ImageView img2 = (ImageView) customView.findViewById(R.id.image); // add img id
        Button btn = (Button) customView.findViewById(R.id.backbtn);
        //img2.setImageResource(R.drawable.cover_300x);

        return customView;
    }

}
