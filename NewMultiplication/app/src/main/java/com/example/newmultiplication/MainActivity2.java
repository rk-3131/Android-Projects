package com.example.newmultiplication;

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
        Intent intent = getIntent();
        textView = findViewById(R.id.textView2);
        int Num1 = intent.getIntExtra("num1", 1);
        int Num2 = intent.getIntExtra("num2", 1);
        int mul1 = intent.getIntExtra("mul", 1);
        textView.setText("Multiplication of two number "+Num1+" and "+Num2+" is "+mul1);
    }
}