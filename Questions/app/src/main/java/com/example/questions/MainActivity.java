package com.example.questions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button yes;
    Button no;
    TextView textView;


    String Questions [] = {
            "Is my birthday 15th May?",
            "I am from Nagar",
            "I am good person",
            "I love traveling",
            "I love reading"
    };
    int index = 0;
    int score = 0;


    boolean[] Answers = {true, true, false, true, false};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.button);
        no = findViewById(R.id.button2);
        textView = findViewById(R.id.textView);
        textView.setText(Questions[index]);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index <= Questions.length - 1){
                    if (Answers[index] == true){
                        score++;
                    }
                    index++;

                    if (index <= Questions.length -1 ){
                        textView.setText(Questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is "+score, Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index <= Questions.length -1){
                    if (Answers[index] == false){
                        score++;
                    }
                    index++;

                    if (index <= Questions.length -1){
                        textView.setText(Questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is "+score, Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });






    }
}