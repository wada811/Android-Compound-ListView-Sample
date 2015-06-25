package com.wada811.android_compound_listview_sample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.commonsware.cwac.merge.MergeAdapter;

public class MergeAdapterActivity extends AppCompatActivity {

    public static Intent createIntent(Context context){
        return new Intent(context, MergeAdapterActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merge);

        ListView listView = (ListView)findViewById(R.id.ListView);

        MergeAdapter mergeAdapter = new MergeAdapter();

        View view = LayoutInflater.from(this).inflate(R.layout.list, null, false);

        TextView textView1 = (TextView)view.findViewById(R.id.TextView1);
        ListView listView1 = (ListView)view.findViewById(R.id.ListView1);
        Button button1 = (Button)view.findViewById(R.id.Button1);
        TextView textView2 = (TextView)view.findViewById(R.id.TextView2);
        ListView listView2 = (ListView)view.findViewById(R.id.ListView2);
        Button button2 = (Button)view.findViewById(R.id.Button2);

        mergeAdapter.addView(textView1);
        mergeAdapter.addAdapter(listView1.getAdapter());
        mergeAdapter.addView(button1);
        mergeAdapter.addView(textView2);
        mergeAdapter.addAdapter(listView2.getAdapter());
        mergeAdapter.addView(button2);

        listView.setAdapter(mergeAdapter);

    }
}
