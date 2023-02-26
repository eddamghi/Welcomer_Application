package com.eddamghi.welcomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class WelcomingActivity extends AppCompatActivity {

    TextView helloTextView;
    Button homeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcoming);
        helloTextView = findViewById(R.id.helloTextView);
        String message = getIntent().getStringExtra("message");
        helloTextView.setText(message);
        homeButton = findViewById(R.id.homeButton);
        homeButton.setOnClickListener(v -> {
            finish();
        });
    }
}