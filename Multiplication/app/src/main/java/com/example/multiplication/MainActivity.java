package com.example.multiplication;

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
        textView = findViewById(R.id.textView4);
        number1 = findViewById(R.id.editTextTextPersonName);
        number2 = findViewById(R.id.editTextTextPersonName2);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numstr1 = number1.getText().toString();
                String numstr2 = number2.getText().toString();
                int Multiplication = Integer.parseInt(numstr1) * Integer.parseInt(numstr2);
                textView.setText("Multiplication of two numbers "+numstr1+ " and "+numstr2+" is "+Multiplication);
            }
        });
    }
}