package com.example.calebandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        setTitle("Settings");

        Intent intent = getIntent();
        String username =  intent.getStringExtra("username");

        TextView message = findViewById(R.id.textViewMessage);
        message.setText("Hello "+ username);

    }
}