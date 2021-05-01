package com.e.practical;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PracticalExam1 extends AppCompatActivity implements View.OnClickListener
{
    EditText et1,et2;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practical_exam1);

        et1 = findViewById(R.id.user);
        et2 = findViewById(R.id.pass);
        b = findViewById(R.id.loginbtn);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(et1.getText().toString().equals("abcd") && et2.getText().toString().equals("abcd"))
        {
            Toast.makeText(this, "You have successfully logged in ", Toast.LENGTH_LONG).show();
            Intent i = new Intent(PracticalExam1.this, WelcomeScreen.class);
            i.putExtra("name",et1.getText().toString());
            startActivity(i);
            finish();
        }
        else
        {

            Toast.makeText(this,"Invalid Username/Passsword, Please try again!!!",Toast.LENGTH_LONG).show();
        }
    }
    public void back(Activity activity)
    {
        activity.finish();
    }
}