package com.example.primeornot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText number;
    TextView Result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        number = findViewById(R.id.editTextNumber);
        Result = findViewById(R.id.textView3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = number.getText().toString();
                int NumberAct = Integer.parseInt(number1);
                boolean flag = true;

                for (int i = 2; i <= (NumberAct/2); i++){
                    if (NumberAct % i == 0){
                        flag = false;
                    }
                }


                if (flag == true){
                    Result.setText("Number "+NumberAct+" is prime Number!");
                }
                else{
                    Result.setText("Number "+NumberAct+" is not a prime Number");
                }

            }
        });
    }
}