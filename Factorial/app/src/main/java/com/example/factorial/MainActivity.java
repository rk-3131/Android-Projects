package com.example.factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText number;
    private TextView Result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        number = findViewById(R.id.editTextNumber);
        Result = findViewById(R.id.textView3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = number.getText().toString();
                int actNumber = Integer.parseInt(number1);
                long factorial = 1;
                for (int i = actNumber; i>=1; i--){
                    factorial *= i;
                }
                Result.setText("Factorial of a given number "+actNumber+" is "+ factorial);
            }
        });
    }
}