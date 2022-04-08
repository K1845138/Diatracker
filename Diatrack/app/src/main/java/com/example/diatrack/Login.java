package com.example.diatrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class Login extends AppCompatActivity {
    ImageButton homescreenLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        homescreenLogin = findViewById(R.id.loginButton);
        homescreenLogin.setOnClickListener(v -> {
            Intent intentLoadNewActivity = new Intent(Login.this, Homescreen.class);
            startActivity(intentLoadNewActivity);
        });
    }
}