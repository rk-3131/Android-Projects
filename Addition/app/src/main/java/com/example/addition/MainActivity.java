package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText number1;
    private EditText number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        number1 = findViewById(R.id.editTextNumber);
        number2 = findViewById(R.id.editTextNumber2);
        textView = findViewById(R.id.textView4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numstr1 = number1.getText().toString();
                int number1 = Integer.parseInt(numstr1);
                String numstr2 = number2.getText().toString();
                int number2 = Integer.parseInt(numstr2);
                int Sum = number1 + number2;
                textView.setText("The sum of the two numbers "+number1+" and "+number2+" is "+Sum);
            }
        });
    }
}