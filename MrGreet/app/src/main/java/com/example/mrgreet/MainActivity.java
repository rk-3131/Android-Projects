package com.example.mrgreet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editTextmail;
    private EditText password;
    private EditText name;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editTextmail = findViewById(R.id.emailadress);
        password = findViewById(R.id.editTextTextPassword);
        name = findViewById(R.id.PersonName2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1 = name.getText().toString();
                String email = editTextmail.getText().toString();
                String password1 = password.getText().toString();
                textView.setText("Hello man "+name1+" I am glad that you have come here welcome\nYour email adress is "+email);

            }
        });
    }
}