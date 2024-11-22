package com.BMLMunjal.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText number1;
    private EditText number2;
    private Button Add_button;
    private Button Subtract_button;
    private Button Multiply_button;
    private Button Divide_button;
    private Button Modulas_button;
    private TextView result;
    int num1;
    int num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (EditText) findViewById(R.id.editText_first_no);
        number2 = (EditText) findViewById(R.id.editText_second_no);
        Add_button = (Button) findViewById(R.id.add_button);
        Subtract_button = (Button)findViewById(R.id.subtract_button);
        Multiply_button = (Button)findViewById(R.id.multiply_button);
        Divide_button = (Button)findViewById(R.id.divide_button);
        Modulas_button = (Button)findViewById(R.id.modulas_button);
        result = (TextView) findViewById(R.id.textView_answer);


        Add_button.setOnClickListener(this);
        Subtract_button.setOnClickListener(this);
        Multiply_button.setOnClickListener(this);
        Divide_button.setOnClickListener(this);
        Modulas_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case (R.id.add_button):
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                result.setText(Integer.toString(num1+num2));
                break;
            case (R.id.subtract_button):
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                result.setText(Integer.toString(num1-num2));
                break;
            case (R.id.multiply_button):
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                result.setText(Integer.toString(num1*num2));
                break;
            case (R.id.divide_button):
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                result.setText(Integer.toString(num1/num2));
                break;
            case (R.id.modulas_button):
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                result.setText(Integer.toString(num1%num2));
                break;
        }
    }
}