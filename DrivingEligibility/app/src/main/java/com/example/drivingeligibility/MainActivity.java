package com.example.drivingeligibility;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView3);
        editText = findViewById(R.id.editTextTextPersonName);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ageStr = editText.getText().toString();
                int number = Integer.parseInt(ageStr);
                if (number < 18){
                    textView.setText("It looks like your age is below 18 so you are not eligible to drive");
                }
                else if (number >= 18 && number < 75){
                    textView.setText("You have a valid age to drive and hence you can drive after proper training so just train to perfection and then you can drive easily");
                }
                else{
                    textView.setText("It looks like your age is above some specific age so I will suggest you to keep calm and not to drive as at this age your responses will be bit slow and hence it can lead you to some serious problem");
                }
            }
        });
    }
}