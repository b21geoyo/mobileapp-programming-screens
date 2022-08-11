package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView = findViewById(R.id.textView);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String text = extras.getString("Text");

        TextView.setText(text);
    }
}