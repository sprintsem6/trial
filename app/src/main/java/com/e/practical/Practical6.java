package com.e.practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Practical6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practical6);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}