package com.example.cookjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsiraActivity extends AppCompatActivity {

    EditText edit;
    Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insira);

        edit = findViewById(R.id.edit);
        clear = findViewById(R.id.btn_clear);
        clear.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                edit.getText().clear();
                Toast.makeText(InsiraActivity.this, "Salvo", Toast.LENGTH_SHORT).show();
            }
        });
    }
}