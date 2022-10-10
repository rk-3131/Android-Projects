package com.example.profileview;

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
    private EditText id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView3);
        name = findViewById(R.id.editTextTextPersonName);
        id = findViewById(R.id.editTextTextPersonName2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1 = name.getText().toString();
                String id1 = id.getText().toString();
                textView.setText("The name of the user is "+name1+ " and his / her id is "+id1);
            }
        });
    }
}