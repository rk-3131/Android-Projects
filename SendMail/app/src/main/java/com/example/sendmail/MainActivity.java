package com.example.sendmail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText mail;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        button = findViewById(R.id.button);
        String [] addresses = {"radhakrushna.mahadik122020@gcoeara.ac.in"};
        mail = findViewById(R.id.editTextTextPersonName);

        
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String subject = mail.getText().toString();
                Toast.makeText(MainActivity.this, "Opening the mail app", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("*/*");
                intent.putExtra(Intent.EXTRA_EMAIL, addresses);
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}