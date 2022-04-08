package com.example.diatrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageButton registerBttn;
    ImageButton loginBttn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerBttn = findViewById(R.id.RegisterButton);
        registerBttn.setOnClickListener(v -> {
            Intent intentLoadNewActivity = new Intent(MainActivity.this, Register.class);
            startActivity(intentLoadNewActivity);
        });

        loginBttn = findViewById(R.id.LoginButton);
        loginBttn.setOnClickListener(v -> {
            Intent intentLoadNewActivity = new Intent(MainActivity.this, Login.class);
            startActivity(intentLoadNewActivity);
        });
    }
}