package com.Areksoft.mychittiapplication;

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

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.database.FirebaseDatabase;

public class SignUpPage extends AppCompatActivity implements View.OnClickListener {
    private EditText editTextFirstName;
    private EditText editTextLastName;
    private EditText editTextPhoneNumber;
    private EditText editTextEmailID;
    private EditText editTextPassword;
    private EditText editTextRePassword;
    private TextView textViewsignIn;
    private Button btnSignUp;
    private ProgressBar PBar;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
        textViewsignIn=(TextView) findViewById(R.id.textViewSignIn);
        btnSignUp=(Button) findViewById(R.id.btnSignUp);

        editTextFirstName =(EditText) findViewById(R.id.editTextFirstName);
        editTextLastName =(EditText) findViewById(R.id.editTextLastName);
        editTextPhoneNumber =(EditText) findViewById(R.id.editTextPhoneNumber);
        editTextEmailID =(EditText) findViewById(R.id.editTextEmailIDSignUp);
        editTextPassword =(EditText) findViewById(R.id.editTextPasswordSignUp);
        editTextRePassword =(EditText) findViewById(R.id.editTextRePasswordSignUp);
        PBar=(ProgressBar) findViewById(R.id.progressBar);
        PBar.setVisibility(View.GONE);

        mAuth = FirebaseAuth.getInstance();

        textViewsignIn.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);

    }
    public void signUpRegistration(){
        String firstName=editTextFirstName.getText().toString().trim();
        String lastName=editTextLastName.getText().toString().trim();
        String phoneNumber= editTextPhoneNumber.getText().toString().trim();
        String emailId= editTextEmailID.getText().toString().trim();
        String password= editTextPassword.getText().toString().trim();
        String repassword= editTextRePassword.getText().toString().trim();
        if(TextUtils.isEmpty(firstName)){
            editTextFirstName.setError("Enter First Name");
            editTextFirstName.requestFocus();
            return;
        }
        if(TextUtils.isEmpty(lastName)){
            editTextLastName.setError("Enter Last Name");
            editTextLastName.requestFocus();
            return;
        }
        if(TextUtils.isEmpty(phoneNumber)){
            editTextPhoneNumber.setError("Enter Phone Number");
            editTextPhoneNumber.requestFocus();
            return;
        }
        if(TextUtils.isEmpty(emailId)){
            editTextEmailID.setError("Enter Email Id");
            editTextEmailID.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(emailId).matches()){
            editTextEmailID.setError("Enter valid Email Id");
            editTextEmailID.requestFocus();
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
        if(TextUtils.isEmpty(repassword)){
            editTextRePassword.setError("Enter password again");
            editTextRePassword.requestFocus();
            return;
        }
        if(!password.equals(repassword)){
            editTextRePassword.setError("Enter same password again");
            editTextRePassword.requestFocus();
            return;
        }
        PBar.setVisibility(View.VISIBLE);
        mAuth.createUserWithEmailAndPassword(emailId,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    User user = new User(firstName,lastName,phoneNumber,emailId);
                    FirebaseDatabase.getInstance().getReference("Users").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(SignUpPage.this, "User is registered successfully", Toast.LENGTH_SHORT).show();
                                PBar.setVisibility(View.GONE);
                                finish();
                            }
                            else{
                                Toast.makeText(SignUpPage.this, "User is not register,Try again!", Toast.LENGTH_SHORT).show();
                                PBar.setVisibility(View.GONE);
                            }
                        }
                    });
                }
                    else {

                        String errorCode = ((FirebaseAuthException) task.getException()).getErrorCode();
                        PBar.setVisibility(View.GONE);

                        switch (errorCode) {

                            case "ERROR_INVALID_CUSTOM_TOKEN":
                                Toast.makeText(SignUpPage.this, "The custom token format is incorrect. Please check the documentation.", Toast.LENGTH_LONG).show();
                                break;

                            case "ERROR_CUSTOM_TOKEN_MISMATCH":
                                Toast.makeText(SignUpPage.this, "The custom token corresponds to a different audience.", Toast.LENGTH_LONG).show();
                                break;

                            case "ERROR_INVALID_CREDENTIAL":
                                Toast.makeText(SignUpPage.this, "The supplied auth credential is malformed or has expired.", Toast.LENGTH_LONG).show();
                                break;

                            case "ERROR_INVALID_EMAIL":
                                Toast.makeText(SignUpPage.this, "The email address is badly formatted.", Toast.LENGTH_LONG).show();
                                editTextEmailID.setError("The email address is badly formatted.");
                                editTextEmailID.requestFocus();
                                break;

                            case "ERROR_USER_MISMATCH":
                                Toast.makeText(SignUpPage.this, "The supplied credentials do not correspond to the previously signed in user.", Toast.LENGTH_LONG).show();
                                break;

                            case "ERROR_REQUIRES_RECENT_LOGIN":
                                Toast.makeText(SignUpPage.this, "This operation is sensitive and requires recent authentication. Log in again before retrying this request.", Toast.LENGTH_LONG).show();
                                break;

                            case "ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL":
                                Toast.makeText(SignUpPage.this, "An account already exists with the same email address but different sign-in credentials. Sign in using a provider associated with this email address.", Toast.LENGTH_LONG).show();
                                break;

                            case "ERROR_EMAIL_ALREADY_IN_USE":
                                Toast.makeText(SignUpPage.this, "The email address is already in use by another account.   ", Toast.LENGTH_LONG).show();
                                editTextEmailID.setError("The email address is already in use by another account.");
                                editTextEmailID.requestFocus();
                                break;

                            case "ERROR_CREDENTIAL_ALREADY_IN_USE":
                                Toast.makeText(SignUpPage.this, "This credential is already associated with a different user account.", Toast.LENGTH_LONG).show();
                                break;

                            case "ERROR_USER_DISABLED":
                                Toast.makeText(SignUpPage.this, "The user account has been disabled by an administrator.", Toast.LENGTH_LONG).show();
                                break;

                            case "ERROR_USER_TOKEN_EXPIRED":
                                Toast.makeText(SignUpPage.this, "The user\\'s credential is no longer valid. The user must sign in again.", Toast.LENGTH_LONG).show();
                                break;

                            case "ERROR_USER_NOT_FOUND":
                                Toast.makeText(SignUpPage.this, "There is no user record corresponding to this identifier. The user may have been deleted.", Toast.LENGTH_LONG).show();
                                break;

                            case "ERROR_INVALID_USER_TOKEN":
                                Toast.makeText(SignUpPage.this, "The user\\'s credential is no longer valid. The user must sign in again.", Toast.LENGTH_LONG).show();
                                break;

                            case "ERROR_OPERATION_NOT_ALLOWED":
                                Toast.makeText(SignUpPage.this, "This operation is not allowed. You must enable this service in the console.", Toast.LENGTH_LONG).show();
                                break;

                            default:
                                Toast.makeText(SignUpPage.this, errorCode, Toast.LENGTH_SHORT).show();


                    }
                }
            }
        });


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case (R.id.textViewSignIn):
                startActivity(new Intent(this,MainActivity.class));
                break;
            case (R.id.btnSignUp):
                signUpRegistration();
                break;
        }
    }
}