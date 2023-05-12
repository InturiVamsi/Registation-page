package com.example.parkingspacefinder;

import static android.content.ContentValues.TAG;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.auth.User;

import java.util.HashMap;
import java.util.Map;

public class Reserve extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reserve);

//Initialising firestore authentication to store the input values
        FirebaseFirestore db = FirebaseFirestore.getInstance();

        EditText et1 = findViewById(R.id.edtText1);
        EditText et2 = findViewById(R.id.edtText2);
        EditText et3 = findViewById(R.id.editTextDate);
        EditText et4 = findViewById(R.id.editTextTime);



        TextView btn2 = findViewById(R.id.button4);
        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view){
                String Name = et1.getText().toString();
                String email = et2.getText().toString();
                String date = et3.getText().toString();
                String time = et4.getText().toString();

                if(email.contains("@") && !Name.isEmpty() && !time.isEmpty() && !date.isEmpty())
                {  // Create a new Map object with the data you want to add
                    Map<String, Object> data = new HashMap<>();
                    data.put("Name", Name);
                    data.put("Email", email);
                    data.put("Date", date);
                    data.put("Time", time);
                    data.put("Space Number", MainActivity.getValue());
                    data.put("Payment", "Done");
// Add the data to a new document in the "users" collection
                    db.collection(
                                    "Parking_Space"
                            )
                            .document(email)
                            .set(data)
                            .addOnSuccessListener(aVoid -> {
                                Log.d(
                                        "TAG"
                                        ,
                                        "DocumentSnapshot successfully written!"
                                );
                                change_pay();
                            })
                            .addOnFailureListener(e -> {
                                Log.w(
                                        "TAG"
                                        ,
                                        "Error writing document"
                                        , e);
                            });
                }
                else {
                    Toast.makeText(Reserve.this, "Please Input Valid Details", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ImageView back = findViewById(R.id.imageView2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
// Implementing function to start activity payment
    private void change_pay() {
        View inflatedView = getLayoutInflater().inflate(R.layout.home, null);
        TextView text = (TextView) inflatedView.findViewById(MainActivity.getId());
        text.setBackground(ContextCompat.getDrawable(this, R.drawable.unavail));
     Intent c = new Intent(this, Payment.class);
     startActivity(c);
    }
}
