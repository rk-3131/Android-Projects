package com.example.primenumbers;

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

        int digit1 = intent.getIntExtra("Number1", 1);
        int digit2 = intent.getIntExtra("Number2", 1);
        //textView.setText("Number 1 is "+digit1+" and Number 2 is "+digit2);

        for (int i = digit1; i <= digit2; i++){
            if (i == 1 || i == 0){
                continue;
            }

            int flag = 1;

            for (int j = 2; j <= (i/2); j++){
                if (i % j == 0){
                    flag = 0;
                    break;
                }
            }
            if (flag == 1){
                textView.setText(i);
            }
        }
    }
}