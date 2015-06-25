package com.wada811.android_compound_listview_sample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ScrollViewActivity extends AppCompatActivity {

    public static Intent createIntent(Context context){
        return new Intent(context, ScrollViewActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);

        ListView listView1 = (ListView)findViewById(R.id.ListView1);
        ListView listView2 = (ListView)findViewById(R.id.ListView2);
        setListViewHeightBasedOnChildren(listView1);
        setListViewHeightBasedOnChildren(listView2);
    }

    private void setListViewHeightBasedOnChildren(ListView listView){
        ListAdapter listAdapter = listView.getAdapter();
        if(listAdapter == null){
            return;
        }
        int totalHeight = listView.getPaddingTop() + listView.getPaddingBottom();
//        for(int i = 0; i < listAdapter.getCount(); i++){
            View listItem = listAdapter.getView(0, null, listView);
            if(listItem instanceof ViewGroup){
                listItem.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
            }
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight() * listAdapter.getCount();
//        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
    }
}
