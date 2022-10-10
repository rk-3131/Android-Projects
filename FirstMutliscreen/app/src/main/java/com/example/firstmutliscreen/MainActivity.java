package com.example.firstmutliscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    public static final String Extra_String = "com.example.firstmutliscreen.ExtraName";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.editTextTextPersonName);

    }
    public void openActivity(View view){
        Toast.makeText(this, "Opening second activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        String editName = name.getText().toString();
        intent.putExtra(Extra_String, editName);
        startActivity(intent);
    }
}