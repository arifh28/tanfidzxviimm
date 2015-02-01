package com.fasco.tanfidzxviimmonline.adapter;

/**
 * Created by Arifh on 20/01/2015.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fasco.tanfidzxviimmonline.R;
import com.fasco.tanfidzxviimmonline.model.LinkModel;


public class LinkAdapter extends ArrayAdapter<LinkModel> {


    public LinkAdapter(Context context) {

        super(context, 0);

    }


    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.link_row_item, null);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView1);
        TextView title = (TextView) convertView.findViewById(R.id.textView1);
        TextView desc = (TextView) convertView.findViewById(R.id.textView2);
        TextView expired = (TextView) convertView.findViewById(R.id.textView3);

        imageView.setImageResource(getItem(position).img);
        title.setText(getItem(position).title);
        desc.setText(getItem(position).desc);
        expired.setText(getItem(position).expired);

        return convertView;

    }

}