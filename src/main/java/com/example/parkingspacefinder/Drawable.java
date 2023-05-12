package com.example.parkingspacefinder;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Objects;
public class Drawable extends AppCompatActivity {
    FirebaseAuth mAuth = FirebaseAuth.getInstance();
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawable);
        TextView btnd = findViewById(R.id.button);
        btnd.setOnClickListener(view -> {
           mAuth.signOut();
           finishAffinity();
           startActivity(new Intent(this, Login.class));
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        TextView uname = findViewById(R.id.textView11);
        TextView uemail = findViewById(R.id.textView12);
        String user_email = mAuth.getCurrentUser().getEmail();
//        assert user_email != null;
        db.collection("Parking_Users").document(user_email)
                .get().addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        DocumentSnapshot document = task.getResult();
                        if (document.exists()) {
                            String Name = document.getString("Name");
                            uname.setText(Name);
                            String Email = document.getString("Email");
                            uemail.setText(Email);
                        }
                    }
                });
    }
}


