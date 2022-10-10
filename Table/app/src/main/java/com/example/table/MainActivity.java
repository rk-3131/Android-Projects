package com.example.table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextNumber2);
        textView = findViewById(R.id.textView3);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numStr = editText.getText().toString();
                int Number = Integer.parseInt(numStr);
                int valueTemp = 0;
                String val;
                for (int i = 1; i <11 ; i++) {
                    valueTemp = Number * i;
                    val = Integer.toString(valueTemp);
                    textView.append("\t\t"+val+"\n");

                }
               

            }
        });

    }
}