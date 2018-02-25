package com.example.denis.calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMyButtonClickMult(View view)
    {
        TextView reuslt = (TextView) findViewById(R.id.textView2);
        EditText num1 = (EditText) findViewById(R.id.editText2);
        EditText num2 = (EditText) findViewById(R.id.editText3);


        if(num1.getText().toString().trim().length() > 0 && num2.getText().toString().trim().length() > 0 && num1.getText().toString().matches("[-+]?\\d+") && num2.getText().toString().matches("[-+]?\\d+")) {
            reuslt.setText(Integer.toString(Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString())));
        }
        else
        {
            num1.setText("Input a number!");
            num2.setText("Input a number!");
        }


    }

    public void onMyButtonClickAdd(View view)
    {
        TextView reuslt = (TextView) findViewById(R.id.textView2);
        EditText num1 = (EditText) findViewById(R.id.editText2);
        EditText num2 = (EditText) findViewById(R.id.editText3);

        if(num1.getText().toString().trim().length() > 0 && num2.getText().toString().trim().length() > 0 && num1.getText().toString().matches("[-+]?\\d+") && num2.getText().toString().matches("[-+]?\\d+")) {
            reuslt.setText(Integer.toString(Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString())));
        }
        else
        {
            num1.setText("Input a number!");
            num2.setText("Input a number!");
        }

    }
}


