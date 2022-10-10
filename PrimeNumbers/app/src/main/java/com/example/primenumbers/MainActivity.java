package com.example.primenumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText number1;
    EditText number2;
    public static final int Number1 = 1;
    public static final int Number2 = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = findViewById(R.id.editTextNumber);
        number2 = findViewById(R.id.editTextNumber2);


    }
    public void performTask(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        String NumberOne = number1.getText().toString();
        String NumberTwo = number2.getText().toString();
        intent.putExtra("Number1", Integer.parseInt(NumberOne));
        intent.putExtra("Number2", Integer.parseInt(NumberTwo));
        startActivity(intent);

    }
}