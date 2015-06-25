package com.wada811.android_compound_listview_sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    final MainActivity self = this;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.Button1).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(ScrollViewActivity.createIntent(self));
            }
        });
        findViewById(R.id.Button2).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(MergeAdapterActivity.createIntent(self));
            }
        });
    }
}
