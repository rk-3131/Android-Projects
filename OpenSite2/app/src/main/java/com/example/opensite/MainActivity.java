package com.example.opensite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = findViewById(R.id.button);
        editText = findViewById(R.id.editTextTextPersonName);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String site = editText.getText().toString();

                Uri webpage = Uri.parse(site);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);


            }
        });
    }
}