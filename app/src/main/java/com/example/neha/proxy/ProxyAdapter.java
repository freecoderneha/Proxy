package com.example.neha.proxy;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class ProxyAdapter extends ArrayAdapter<Proxy>{


    public ProxyAdapter(Context context, ArrayList<Proxy> proxies) {
        super(context, 0,proxies);


    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_layout, parent, false);
        }


        Proxy currentProxy = getItem(position);


        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        titleTextView.setText(currentProxy.getTitleId());


        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
        descriptionTextView.setText(currentProxy.getDescriptionId());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentProxy.getPhotoId());


        TextView durationTextView = (TextView) listItemView.findViewById(R.id.duration);
        durationTextView.setText(currentProxy.getDurationId());

        return listItemView;

    }
}
