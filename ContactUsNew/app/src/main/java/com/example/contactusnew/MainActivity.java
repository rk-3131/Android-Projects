package com.example.contactusnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText phone;
    EditText email;
    EditText age;
    public static final String Name = "com.example.contactusnew.name";
    public static final String Email = "com.example.contactusnew.email";
    public static final String Phone = "com.example.contactusnew.phone";
    public static final int Age = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.editTextTextPersonName);
        phone = findViewById(R.id.editTextPhone);
        email = findViewById(R.id.editTextTextEmailAddress);
        age = findViewById(R.id.editTextNumber);

    }
    public void performAction(View view){
        Toast.makeText(this, "Opening second activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        String Name1 = name.getText().toString();
        String Email1 = email.getText().toString();
        String Phone1 = phone.getText().toString();
        String Agestr = age.getText().toString();
        int Age1 = Integer.parseInt(Agestr);
        intent.putExtra(Name, Name1);
        intent.putExtra(Email, Email1);
        intent.putExtra(Phone, Phone1);
        intent.putExtra("Age", Age1);
        startActivity(intent);

    }
}