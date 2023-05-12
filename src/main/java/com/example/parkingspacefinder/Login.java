package com.example.parkingspacefinder;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
public class Login extends AppCompatActivity{
    private FirebaseAuth mAuth;
   // Connecting layout resource file 'login' to Login java class
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    //Initializing firebase authentication foe email and password
        mAuth = FirebaseAuth.getInstance();
         TextView btn1 =  findViewById(R.id.button2);
        EditText input1 = findViewById(R.id.edttxt1);
        EditText input2 = findViewById(R.id.edttxt2);
             btn1.setOnClickListener(view -> change_home(input1.getText().toString(),input2.getText().toString()));
        TextView t1 = findViewById(R.id.textView28);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                change_sign();
            }
        });
    }
    //implementing onStart function to start Mainactivity
    public void onStart(){
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
//  Implementing function to start activity Signup
    private void change_sign() {
        Intent b = new Intent(this,Signup.class);
        startActivity(b);
    }
//    Implementing function to start activity Home
    private void change_home( String email,  String password) {
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        finish();
                        Intent intent = new Intent(this, MainActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "Authentication failed.",
                                Toast.LENGTH_SHORT).show();
                    }
                }); }}