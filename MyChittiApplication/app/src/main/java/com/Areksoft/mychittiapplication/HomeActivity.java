package com.Areksoft.mychittiapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    private Button buttonsignOut;
//    private ProgressBar progressBar;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        buttonsignOut = findViewById(R.id.signOutHomeActivity);
//        progressBar = findViewById(R.id.progressBarHomeActivity);

        mAuth = FirebaseAuth.getInstance();

        buttonsignOut.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
//            case (R.id.signOutHomeActivity):
//                mAuth.signOut();
//                startActivity(new Intent(HomeActivity.this, WelcomePage.class));
//                finish();
        }
    }
}