package com.Areksoft.mychitfundapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {

    private Button buttonsignOut;
//    private ProgressBar progressBar;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        buttonsignOut = findViewById(R.id.signOutHomeActivity);
//        progressBar = findViewById(R.id.progressBarHomeActivity);

        mAuth = FirebaseAuth.getInstance();

        buttonsignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signOut();
                Toast.makeText(HomeActivity.this, "Signed Out successfully", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
}