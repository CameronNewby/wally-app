package com.example.cam.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;


public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final EditText etAge = (EditText) findViewById(R.id.etAge);
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final TextView welcomeMessage = (TextView) findViewById(R.id.tvDisplayMsg);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");
        int age = intent.getIntExtra("age", -1);

        String message = name + " welcome to your profile";
        welcomeMessage.setText(message);
        etUsername.setText(username);
        etAge.setText(age + "");

    }
}
