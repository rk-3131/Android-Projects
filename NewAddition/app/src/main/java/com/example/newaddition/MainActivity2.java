package com.example.newaddition;

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
        int Num1 = intent.getIntExtra("num1",0);
        int Num2 = intent.getIntExtra("num2", 0);
        int Sum1 = intent.getIntExtra("Sum1", 0);
        textView.setText("The Sum of Numbers "+Num1+" and "+Num2+" is "+Sum1);

    }
}