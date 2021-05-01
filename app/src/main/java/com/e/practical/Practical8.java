package com.e.practical;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Practical8 extends AppCompatActivity implements View.OnClickListener, DialogInterface.OnClickListener
{
    AlertDialog.Builder alertDialogBuilder;
    Button b1;
    EditText t1,t2,t3;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstancestate)
    {
        super.onCreate(savedInstancestate);
        setContentView(R.layout.practical8);
        b1 = findViewById(R.id.btnsub);
        b1.setOnClickListener( this);
        t1 = findViewById(R.id.unet);
        t2 = findViewById(R.id.conet);
        t3 = findViewById(R.id.accnet);
        alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("New Password");
        alertDialogBuilder.setMessage("Which way use to Get New Password?");
        alertDialogBuilder.setPositiveButton("TEXT MESSAGE",this);
        alertDialogBuilder.setNegativeButton("CALL",this);
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i)
    {
        if (i == DialogInterface.BUTTON_POSITIVE)
        {

            Toast.makeText(this,"Your Password has been sent via Text Message" ,Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this,"Your Password has been sent via Call", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onClick(View view)
    {
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    public void back(Activity activity)
    {
        activity.finish();
    }
    public void submit(View view)
    {
        if (TextUtils.isEmpty(t1.getText().toString()))
        {
            Toast.makeText(this,"Please Enter User Name",Toast.LENGTH_LONG).show();
        }
        else if (TextUtils.isEmpty(t2.getText().toString()))
        {
            Toast.makeText(this,"Please Enter Your Contact No.",Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(t3.getText().toString()))
        {
            Toast.makeText(this,"Please Enter Account No.",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this,"Your Password has been Successfully sent",  Toast.LENGTH_LONG). show();
        }
    }
}
