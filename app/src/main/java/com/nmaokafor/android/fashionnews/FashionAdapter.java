package com.nmaokafor.android.fashionnews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class FashionAdapter extends ArrayAdapter<Fashion> {
    public FashionAdapter(Context context) {
        super(context, -1, new ArrayList<Fashion>());
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView
                    = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        TextView section = (TextView) convertView.findViewById(R.id.section);
        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView author = (TextView) convertView.findViewById(R.id.author);
        TextView date = (TextView) convertView.findViewById(R.id.date);


        Fashion currentNews = getItem(position);
        section.setText(currentNews.getSection());
        title.setText(currentNews.getTitle());
        author.setText(currentNews.getAuthor());
        date.setText(currentNews.getDate());


        return convertView;
    }
}