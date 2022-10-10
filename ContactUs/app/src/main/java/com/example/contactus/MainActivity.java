package com.example.contactus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText name;
    private EditText phone;
    private EditText email;
    private EditText problem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);
        name = findViewById(R.id.editTextTextPersonName);
        email = findViewById(R.id.editTextTextEmailAddress);
        phone = findViewById(R.id.editTextPhone);
        problem = findViewById(R.id.editTextTextPersonName2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1 = name.getText().toString();
                String email1 = email.getText().toString();
                String phone1 = phone.getText().toString();
                String problem1 = problem.getText().toString();
                textView.setText("Name: "+name1+"\nemail: "+email1+"\nPhone Number: "+phone1+"\nProblem: "+problem1);
            }
        });
    }
}