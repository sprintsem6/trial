package com.e.practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomeScreen extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstancestate)
    {
        super.onCreate(savedInstancestate);
        setContentView(R.layout.activity_welcome_screen);
        t = findViewById(R.id.text);
        String name = getIntent().getExtras().getString("name");
        t.setText(" Welcome  "+name);
        Toast.makeText(this," Welcome " + name,Toast.LENGTH_LONG).show();
    }
}