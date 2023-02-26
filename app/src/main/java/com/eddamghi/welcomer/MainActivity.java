package com.eddamghi.welcomer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText fistName, lastName;
    Button sayHelloButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fistName = findViewById(R.id.firstNameEditText);
        lastName = findViewById(R.id.lastNameEditText);
        sayHelloButton = findViewById(R.id.sayHelloButton);
        sayHelloButton.setOnClickListener(v -> {
            String firstNameString = fistName.getText().toString();
            String lastNameString = lastName.getText().toString();
            String message = "Hello " + firstNameString + " " + lastNameString;
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, WelcomingActivity.class);
            intent.putExtra("message", message);
            startActivity(intent);
        });
    }
}