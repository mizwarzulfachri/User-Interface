package com.example.userinterface;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nama, nim, jurusan;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        nama = findViewById(R.id.editNama);
        nim = findViewById(R.id.editNIM);
        jurusan = findViewById(R.id.editJurusan);

        button.setOnClickListener(view -> {
            nama.setText(getString(R.string.textNama));
            nim.setText(getString(R.string.textNIM));
            jurusan.setText(R.string.textJurusan);

            Intent intent = new Intent(MainActivity.this, SecondFragment.class);
            intent.putExtra("keyname", String.valueOf(nama));
            intent.putExtra("keyname", String.valueOf(nim));
            intent.putExtra("keyname", String.valueOf(jurusan));
            startActivity(intent);
        });
    }
}