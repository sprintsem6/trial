package com.e.practical;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Practical10 extends AppCompatActivity
{
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstancestate)
    {
        super.onCreate(savedInstancestate);
        setContentView(R.layout.practical10);
        t = findViewById(R.id.tv1);
        String name = getIntent().getExtras().getString("name");
        t.setText(" Welcome  "+name);
        Toast.makeText(this," Welcome " + name,Toast.LENGTH_LONG).show();
    }
}
