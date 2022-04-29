package com.example.calebandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ComposeMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose_message);
        setTitle("Compose");

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        TextView userView = findViewById(R.id.tvUsername);
        userView.setText(username);
    }
}