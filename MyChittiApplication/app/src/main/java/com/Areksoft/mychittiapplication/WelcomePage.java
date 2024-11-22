package com.Areksoft.mychittiapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class WelcomePage extends AppCompatActivity implements View.OnClickListener{
    private Button signInButton, RegisterButton;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        signInButton = findViewById(R.id.buttonSignInWelcomeActivity);
        RegisterButton = findViewById(R.id.buttonRegisterWelcomeActivity);

        mAuth = FirebaseAuth.getInstance();

        signInButton.setOnClickListener(this);
        RegisterButton.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user=mAuth.getCurrentUser();
        if(user != null && user.isEmailVerified()){
            startActivity(new Intent(this,HomeActivity.class));
            finish();
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case (R.id.buttonSignInWelcomeActivity):
                startActivity(new Intent(this, MainActivity.class));
                break;
            case (R.id.buttonRegisterWelcomeActivity):
                startActivity(new Intent(this, SignUpPage.class));
        }
    }
}