package com.example.newaddition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    Button submit;
    public static final int Sum1 = 0;
    public static final int num1 = 0;
    public static final int num2 = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = findViewById(R.id.editTextNumber);
        number2 = findViewById(R.id.editTextNumber2);

    }
    public void performAction(View view){
        Toast.makeText(this, "Opening in new page", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        String strNum1 = number1.getText().toString();
        String strNum2 = number2.getText().toString();
        int Sum = Integer.parseInt(strNum1) + Integer.parseInt(strNum2);
        intent.putExtra("Sum1", Sum);
        intent.putExtra("num1", Integer.parseInt(strNum1));
        intent.putExtra("num2", Integer.parseInt(strNum2));
        startActivity(intent);

    }
}