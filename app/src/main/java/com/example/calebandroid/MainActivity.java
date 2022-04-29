package com.example.calebandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");
    }

    public void handleReply (View view) {
        Button button = findViewById(view.getId());
        Intent intent = new Intent(this, ComposeMessageActivity.class);
        intent.putExtra("username", button.getText().toString().substring(5));
        startActivity(intent);
    }


}