package com.example.myandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textViewResult;
    private EditText editTextkg;
    private EditText editTextfts;
    private CalendarView cView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submitButton = findViewById(R.id.button);
        textViewResult = findViewById(R.id.textView3);
        editTextfts = findViewById(R.id.editTextNumberDecimal2);
        editTextkg = findViewById(R.id.editTextNumberDecimal);
        cView = findViewById(R.id.calendarView);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendarView();
            }
        });
//        submitButton.setOnClickListener(new View.OnClickListener() {//These is used when onClick attribute is not used.
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "It's Calculated!", Toast.LENGTH_SHORT).show();
//                String s = editTextfts.getText().toString();
//                double fts = Double.parseDouble(s);
//                double meter = fts/3.281;
//                s = editTextkg.getText().toString();
//                double kg = Double.parseDouble(s);
//                double BMI = kg/(meter*meter);
//                textViewResult.setText("The BMI of the measurements: " + BMI);
//            }
//        });
    }
    public void calculateBMI(View view){// use onClick attribute in XML and assign that method to onCLick attribute.
        Toast.makeText(MainActivity.this, "It's Calculated!", Toast.LENGTH_SHORT).show();
        String s = editTextfts.getText().toString();
        double fts = Double.parseDouble(s);
        double meter = fts/3.281;
        s = editTextkg.getText().toString();
        double kg = Double.parseDouble(s);
        double BMI = kg/(meter*meter);
        textViewResult.setText("The BMI of the measurements: " + BMI);
    }
    public void calendarView(){
        cView.setVisibility(View.VISIBLE);
    }

}