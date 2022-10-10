package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    Contact1 c1 = new Contact1("1", "Name", "7558313179");
    Contact1 c2 = new Contact1("1", "Name", "7558313179");
    Contact1 c3 = new Contact1("1", "Name", "7558313179");
    Contact1 c4 = new Contact1("1", "Name", "7558313179");
    Contact1 c5 = new Contact1("1", "Name", "7558313179");
    Contact1 c6 = new Contact1("1", "Name", "7558313179");
    Contact1 c7 = new Contact1("1", "Name", "7558313179");
    Contact1 c8 = new Contact1("1", "Name", "7558313179");
    Contact1 c9 = new Contact1("1", "Name", "7558313179");
    Contact1 c10 = new Contact1("1", "Name", "7558313179");
    Contact1 c11 = new Contact1("1", "Name", "7558313179");
    Contact1 c12 = new Contact1("1", "Name", "7558313179");
    Contact1 c13 = new Contact1("1", "Name", "7558313179");

    Contact1[] arr = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = new RecyclerView(this);
        CustomAdapter c = new CustomAdapter(arr);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(c);
    }
}