package com.example.unconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView3);
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Your input is taken in Successfully", Toast.LENGTH_SHORT).show();
                String value = editText.getText().toString();
                int number = Integer.parseInt(value);
                double kg = number / 2.205;
                textView.setText("The value of kg for the entered pound value is "+ kg);
            }
        });


    }
}