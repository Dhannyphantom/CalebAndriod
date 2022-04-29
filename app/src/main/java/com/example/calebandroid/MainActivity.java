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

    public void onSubmit (View v) {
        Button button = findViewById(v.getId());
        EditText username = findViewById(R.id.inputUsername);
        EditText email = findViewById(R.id.inputEmail);
        EditText password = findViewById(R.id.inputPassword);

        TextView usernameText = findViewById(R.id.textViewName);
        TextView emailText = findViewById(R.id.textViewEmail);
        TextView passwordText = findViewById(R.id.textViewPassword);

        usernameText.setText(username.getText().toString());
        emailText.setText(email.getText().toString());
        passwordText.setText(password.getText().toString());

        button.setText("SUBMITTED");
        Toast.makeText(this,"Registered successfully", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, SettingsActivity.class);
        intent.putExtra("username", username.getText().toString());
        startActivity(intent);

        Log.d("myLog", "submit button clicked");
        button.setEnabled(false);


    }
}