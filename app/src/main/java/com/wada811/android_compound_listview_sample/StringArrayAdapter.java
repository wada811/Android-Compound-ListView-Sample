package com.wada811.android_compound_listview_sample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class StringArrayAdapter extends ArrayAdapter<String> {

    LayoutInflater inflater;

    public StringArrayAdapter(Context context, String[] objects){
        super(context, 0, objects);
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent){
        if(convertView == null){
            convertView = inflater.inflate(R.layout.list_item, parent, false);
        }
        convertView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v){
                Toast.makeText(getContext(), "StringArrayAdapter" + position, Toast.LENGTH_LONG).show();
            }
        });
        TextView textView1 = (TextView)convertView.findViewById(R.id.TextView1);
        textView1.setText(getItem(position));
        return convertView;
    }
}
