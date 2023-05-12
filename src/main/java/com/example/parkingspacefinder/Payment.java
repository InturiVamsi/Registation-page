package com.example.parkingspacefinder;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Payment extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);

        TextView btn = findViewById(R.id.Dash_);
        btn.setOnClickListener(view -> {
            finishAffinity();
            change_home();
        });
    }
//Implementing function to navigate to Home screen
    private void change_home() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }}
