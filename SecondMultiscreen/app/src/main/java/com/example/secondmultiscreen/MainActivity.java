package com.example.secondmultiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText number;
    public static final String PHONE_NUMBER = "com.example.secondmultiscreen.phoneNumber";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = findViewById(R.id.editTextPhone);

    }
    public void showPhone(View view){
        Toast.makeText(this, "Opening the second screen", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        String PhoneNumber = number.getText().toString();
        intent.putExtra(PHONE_NUMBER, PhoneNumber);
        startActivity(intent);

    }
}