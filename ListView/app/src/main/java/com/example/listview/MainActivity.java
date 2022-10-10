package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String [] arr = {"Name1", "Name2", "Name3", "Name4", "Name5","Name6", "Name7", "Name8", "Name9", "Name10","Name1", "Name2", "Name3", "Name4", "Name5","Name6", "Name7", "Name8", "Name9", "Name10"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);

        listView.setAdapter(adapter);


    }
}