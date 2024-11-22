package com.bmlmunjal.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Spinner spinner1,spinner2;
    private TextView textViewResult;
    private EditText editTextValue;
    private Button convert;
    private String unit1,unit2,value,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);

        convert = findViewById(R.id.buttonConvert);

        editTextValue = findViewById(R.id.editTextEnterTheValue);
        textViewResult = findViewById(R.id.textViewResult);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.units, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.units, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);



        convert.setOnClickListener(this);
    }

    public void conversion(){
        unit1= spinner1.getSelectedItem().toString();
        unit2= spinner2.getSelectedItem().toString();
        if(unit1.equals(unit2)){
            value= editTextValue.getText().toString();
            textViewResult.setText("Result: "+value);
        }
        else if(unit1.equals("Celsius")){
            value = editTextValue.getText().toString();
            double doubleValue= Double.parseDouble(value);
            doubleValue = (doubleValue*9/5)+32;
            textViewResult.setText("Result: "+ doubleValue);
            Toast.makeText(this, "else if condition", Toast.LENGTH_SHORT).show();
        }
        else if(unit1.equals("Fahrenheit")){
            value = editTextValue.getText().toString();
            double doubleValue= Double.parseDouble(value);
            doubleValue = (doubleValue-32)*5/9;
            textViewResult.setText("Result: "+doubleValue);
            Toast.makeText(this, "else condition", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View view) {
       switch (view.getId()){
           case (R.id.buttonConvert):
               conversion();
               break;
       }
    }
}