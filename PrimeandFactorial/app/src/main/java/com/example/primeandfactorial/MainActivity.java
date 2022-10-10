package com.example.primeandfactorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText number;
    public static final int Number = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.editTextNumber);
    }
    public void performAction(View view){
        Toast.makeText(this, "Performing Calculations", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this , MainActivity2.class);
        String strNumber = number.getText().toString();
        int ActNumber = Integer.parseInt(strNumber);
        intent.putExtra("Number", ActNumber);
        startActivity(intent);
    }
}