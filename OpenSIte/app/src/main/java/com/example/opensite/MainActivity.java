package com.example.opensite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText URL;
    TextView textView;

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        URL = findViewById(R.id.editTextTextPersonName);
        textView = findViewById(R.id.textView2);

        
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Opening the site", Toast.LENGTH_SHORT).show();
                String link = URL.getText().toString();

                Uri webpage = Uri.parse(link);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                textView.setText(link);
            }
        });
    }
}
