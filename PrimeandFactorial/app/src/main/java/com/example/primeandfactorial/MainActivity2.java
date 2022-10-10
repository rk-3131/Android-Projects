package com.example.primeandfactorial;

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
        int Number1 = intent.getIntExtra("Number", 0);
        int Factorial = 1;
         for (int i = Number1; i >= 1; i--){
             Factorial *= i;
         }

         boolean isPrime = true;

         for (int i = 2; i <= (Number1/2); i++){
             if (Number1 % i == 0){
                 isPrime = false;
                 break;
             }
         }

         if (isPrime == true){
             textView.setText("Given number "+Number1+" is a prime Number and it's factorial is "+Factorial);
         }
         else{
             textView.setText("Given Number "+Number1+" is not a prime number and it's factorial is "+Factorial);
         }
    }
}