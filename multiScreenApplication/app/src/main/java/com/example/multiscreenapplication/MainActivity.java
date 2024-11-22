package com.example.multiscreenapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Name;
    public static final String EXTRA_NAME = "com.example.multiscreenapplication.extra.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity2(View v){
//        Toast.makeText(this, "This is a toast", Toast.LENGTH_SHORT).show();
        Name = findViewById(R.id.Name);
        String nameText = Name.getText().toString();
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra(EXTRA_NAME,nameText);
        startActivity(intent);

    }
}