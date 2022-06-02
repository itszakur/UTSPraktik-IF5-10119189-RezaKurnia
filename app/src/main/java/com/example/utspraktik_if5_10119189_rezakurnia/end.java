package com.example.utspraktik_if5_10119189_rezakurnia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class end extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
    }
    public void pindahhalaman (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}