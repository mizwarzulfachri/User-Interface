package com.example.userinterface;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondFragment extends AppCompatActivity {

    Button button_second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_second);

        button_second.setOnClickListener(view -> {
            Intent intent = new Intent(SecondFragment.this, MainActivity.class);
            startActivity(intent);
        });
    }
}