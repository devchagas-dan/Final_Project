package com.example.cookjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = findViewById(R.id.btn_1);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BombocadoActivity.class);
                startActivity(intent);
            }
        });

        btn_2 = findViewById(R.id.btn_2);

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BrigadeiroActivity.class);
                startActivity(intent);
            }
        });

        btn_3 = findViewById(R.id.btn_3);

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BrownieActivity.class);
                startActivity(intent);
            }
        });

        btn_4 = findViewById(R.id.btn_4);

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CookiesActivity.class);
                startActivity(intent);
            }
        });

        btn_5 = findViewById(R.id.btn_5);

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PanquecaActivity.class);
                startActivity(intent);
            }
        });

        btn_6 = findViewById(R.id.btn_6);

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PaoActivity.class);
                startActivity(intent);
            }
        });

        btn_7 = findViewById(R.id.btn_7);

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SobremesaActivity.class);
                startActivity(intent);
            }
        });

        btn_8 = findViewById(R.id.btn_8);

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TortaActivity.class);
                startActivity(intent);
            }
        });

        btn_9 = findViewById(R.id.btn_9);

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InsiraActivity.class);
                startActivity(intent);
            }
        });
    }
}