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
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
public class Signup extends AppCompatActivity {
    private FirebaseAuth mAuth;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
// Implementing onCreate function to connect layout resource file
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        mAuth = FirebaseAuth.getInstance();
        TextView btn3 = findViewById(R.id.button3);
        EditText name = findViewById(R.id.Name);
        EditText email = findViewById(R.id.Email);
        EditText pass = findViewById(R.id.Pass);
        EditText mobnum = findViewById(R.id.edtmobile);
        btn3.setOnClickListener(view -> {
            String User_Name = name.getText().toString();
            String User_Email = email.getText().toString();
            String User_Pass = pass.getText().toString();
            String User_Num = mobnum.getText().toString();
            HashMap<String, Object > data = new HashMap<>();
            data.put("Name", User_Name);
            data.put("Email", User_Email);
            data.put("Mobile Number", User_Num);
            db.collection("Parking_Users").document(User_Email)
                    .set(data).addOnCompleteListener(
                            db_task->{
                                Toast.makeText(this, "Successfully Created!", Toast.LENGTH_SHORT).show();
                                change_home(User_Email, User_Pass);
                            });
        });
        TextView t2 = findViewById(R.id.textView29);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                change_login();
            }
        });
    }
    //Implementing onstart function
    public void onStart(){
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            currentUser.reload();
        }
    }
//Implementing function to navigate to Login screen
    private void change_login() {
        Intent b = new Intent(this,Login.class);
        startActivity(b);
    }
    //Implementing function to navigate to Home screen
    private void change_home(String email,String password) {
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, task -> {
                        Intent intent = new Intent(this, Login.class);
                        startActivity(intent);
                }).addOnFailureListener(
                        a->{
                            Toast.makeText(this, "Failed, Check Internet Connection!    ", Toast.LENGTH_SHORT).show();
                        }
                );

    }

}


