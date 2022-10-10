package com.example.additionmulti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText name1;
    EditText name2;
    public static final String Naam1 = "com.example.additionmulti.Name1";
    public static final String Naam2 = "com.example.additionmulti.Name2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        name1 = findViewById(R.id.editTextTextPersonName2);
        name2 = findViewById(R.id.editTextTextPersonName3);
        
    }
    public void setTheScene(View view){
        Toast.makeText(this, "Opening in another screen", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        String strNumber1 = name1.getText().toString();
        String strNumber2 = name2.getText().toString();
        intent.putExtra(Naam1, strNumber1);
        intent.putExtra(Naam2, strNumber2);

        startActivity(intent);


    }
}