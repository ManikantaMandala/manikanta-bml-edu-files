package com.Areksoft.mychitfundapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class forgotPassword extends AppCompatActivity {

    private EditText emailIdForgotPasswordActivity;
    private Button resetPasswordButtonForgotPasswordActivity;

    private TextView enterYourRegisteredEmailIdToResetThePassword;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        emailIdForgotPasswordActivity = findViewById(R.id.emailIDForgotPasswordActivity);
        resetPasswordButtonForgotPasswordActivity = findViewById(R.id.resetPasswordButtonForgotPasswordActivity);

        enterYourRegisteredEmailIdToResetThePassword = findViewById(R.id.enter_your_registered_email_id_to_reset_the_password);

        resetPasswordButtonForgotPasswordActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailId = emailIdForgotPasswordActivity.getText().toString().trim();
                mAuth.sendPasswordResetEmail(emailId).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                       if(task.isSuccessful()) {
                           Toast.makeText(forgotPassword.this, "Sent the mail to your emailId successfully", Toast.LENGTH_SHORT).show();
                           finish();
                       }
                       else{
                           Toast.makeText(forgotPassword.this, "Failed to send the mail", Toast.LENGTH_SHORT).show();
                           emailIdForgotPasswordActivity.requestFocus();
                           emailIdForgotPasswordActivity.getText().clear();
                       }
                    }
                });

            }
        });
    }
}