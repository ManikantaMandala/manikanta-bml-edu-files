package com.LearningAndroidStudio.imageuploadapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final int REQUEST_CODE = 69 ;
    private ImageView imageView;
    private Button buttonUpload,buttonDisplay;

    private DatabaseReference databaseReference;
    private StorageReference storageProfilePicture;

    private FirebaseAuth mAuth;

    private Uri imageUri;
    private String myUri = "";
    private StorageTask uploadTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        buttonDisplay = findViewById(R.id.buttonSelect);
        buttonUpload = findViewById(R.id.buttonUpload);


    }

    public void DisplayImage(){

    }

    public void UploadImage(){

    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case (R.id.buttonSelect):
                DisplayImage();
                break;
            case (R.id.buttonUpload):
                UploadImage();
                break;
        }
    }
}