package com.e.practical;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

        public class Practical7 extends AppCompatActivity implements View.OnClickListener
        {
            EditText et1,et2,et3;
            Button b,b2;

            @Override
            protected void onCreate(Bundle savedInstanceState)
            {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.practical7);

                et1 = findViewById(R.id.unet);
                et2 = findViewById(R.id.accnet);
                et3 = findViewById(R.id.pwet);
                b = findViewById(R.id.lbtn);
                b2 = findViewById(R.id.cnbtn);
                b.setOnClickListener(this);
            }

            @Override
            public void onClick(View view) {
                if(et1.getText().toString().equals("abcd") &&et2.getText().toString().equals("1234567890")&& et3.getText().toString().equals("abcd"))
                {
                    Toast.makeText(this, "You have successfully logged in ", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(Practical7.this, Practical10.class);
                    i.putExtra("name",et1.getText().toString());
                    startActivity(i);
                    finish();
                }
        else
        {

            Toast.makeText(this,"Please Enter Correct Details",Toast.LENGTH_LONG).show();
        }
    }

    public void forget(View view)
    {
        Intent i = new Intent(Practical7.this, Practical8.class);
        startActivity(i);
    }
    public void reg(View view)
    {
        Intent i = new Intent(Practical7.this, Practical9.class);
        startActivity(i);
    }
    public void back(Activity activity)
    {
        activity.finish();
    }
}

