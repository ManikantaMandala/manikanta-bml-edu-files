package com.Areksoft.mychitfundapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText editTextEmailId;
    private EditText editTextPassword;
    private TextView textViewForgotPassword;
    private TextView textViewSignUp;
    private Button buttonSignIn;

    private ProgressBar progressBar;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmailId=(EditText) findViewById(R.id.editTextTextEmailAddress);
        editTextPassword=(EditText) findViewById(R.id.editTextTextPassword);
        textViewForgotPassword=(TextView) findViewById(R.id.textViewForgotPassword);
        textViewSignUp= (TextView) findViewById(R.id.textViewSignUp);
        buttonSignIn= (Button) findViewById(R.id.buttonSignIn);

        progressBar= (ProgressBar) findViewById(R.id.progressBarMainActivity);

        mAuth = FirebaseAuth.getInstance();

        textViewSignUp.setOnClickListener(this);
        textViewForgotPassword.setOnClickListener(this);
        buttonSignIn.setOnClickListener(this);
    }

    public void signUpFunction(){
        String emailId=editTextEmailId.getText().toString().trim();
        String password=editTextPassword.getText().toString().trim();

        if(TextUtils.isEmpty(emailId)){
            editTextEmailId.setError("Enter Email Id");
            editTextEmailId.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(emailId).matches()){
            editTextEmailId.setError("Enter valid Email Id");
            editTextEmailId.requestFocus();
            return;
        }
        if(TextUtils.isEmpty(password)){
            editTextPassword.setError("Enter password");
            editTextPassword.requestFocus();
            return;
        }
        if(password.length()<6){
            editTextPassword.setError("Minimum length of the password should be 6");
            editTextPassword.requestFocus();
            return;
        }
        progressBar.setVisibility(View.VISIBLE);
        mAuth.signInWithEmailAndPassword(emailId,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    progressBar.setVisibility(View.GONE);
                    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                    if (user.isEmailVerified()){
                        startActivity(new Intent(MainActivity.this, HomeActivity.class));
                        Toast.makeText(MainActivity.this, "Logged in successfully", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        user.sendEmailVerification();
                        Toast.makeText(MainActivity.this, "Check your email to verify your account!", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Failed to Login! Please check your credentials.", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    @Override
    public void onClick(View view) {
       switch (view.getId()){
           case (R.id.textViewForgotPassword):
               startActivity(new Intent(this, forgotPassword.class));
               break;
           case (R.id.textViewSignUp):
               startActivity(new Intent(this,SignUpPage.class));
               break;
           case (R.id.buttonSignIn):
               signUpFunction();
               break;
       }
    }
}