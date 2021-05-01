package com.e.practical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Practical9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practical9);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        getWindow().setStatusBarColor(ContextCompat.getColor(Practical9.this,R.color.blue));
        Button sub = findViewById(R.id.subbtn);
        sub.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Practical9.this, "Account Registered Successfully", Toast.LENGTH_LONG).show();
            }
        });
    }
}