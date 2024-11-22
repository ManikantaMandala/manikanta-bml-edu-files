package com.Areksoft.mychitfundapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomePage extends AppCompatActivity implements View.OnClickListener{
    private Button signInButton, RegisterButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        signInButton = findViewById(R.id.buttonSignInWelcomeActivity);
        RegisterButton = findViewById(R.id.buttonRegisterWelcomeActivity);

        signInButton.setOnClickListener(this);
        RegisterButton.setOnClickListener(this);
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