package com.example.contactusnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView2);
        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.Name);
        String email = intent.getStringExtra(MainActivity.Email);
        String phone = intent.getStringExtra(MainActivity.Phone);
        int age = intent.getIntExtra("Age", 0);
        textView.setText("Name that you entered is "+name+"\nYou have entered an email address as "+email+"\nalso your phone number is "+phone+" and your age is "+age);
    }
}