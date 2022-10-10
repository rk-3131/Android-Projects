package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button True;
    Button False;
    TextView textView;


    String Questions [] = {
            "Java is a language",
            "Java was developed in the 1990",
            "Java was developed by moon microsystem",
            "Java is useful to design the GUI",
            "Java is object oriented language"
    };

    boolean Answers [] = {true, true, false, true, true};

    int index = 0;
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView2);
        True = findViewById(R.id.button);
        False = findViewById(R.id.button2);

        textView.setText(Questions[index]);

        True.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index < Questions.length){
                    if (Answers[index] == true){
                        score++;
                    }
                    index++;
                    if (index < Questions.length){
                        textView.setText(Questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is "+ score, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        False.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index < Questions.length){
                    if (Answers[index] == false){
                        score++;
                    }
                    index++;
                    if (index < Questions.length){
                        textView.setText(Questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is "+ score, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}