package com.e.practical;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Practical4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstancestate) {
        super.onCreate(savedInstancestate);
        setContentView(R.layout.practical4);
        Toast.makeText(Practical4.this, "onCreated", Toast.LENGTH_LONG).show();
        Log.e("Msg", "Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(Practical4.this, "onStarted", Toast.LENGTH_LONG).show();
        Log.e("Msg", "Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(Practical4.this, "onResumed", Toast.LENGTH_LONG).show();
        Log.e("Msg", "Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(Practical4.this, "onPaused", Toast.LENGTH_LONG).show();
        Log.e("Msg", "Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(Practical4.this, "onStopped", Toast.LENGTH_LONG).show();
        Log.e("Msg", "Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(Practical4.this, "onRestarted", Toast.LENGTH_LONG).show();
        Log.e("Msg", "Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(Practical4.this, "onDestroy", Toast.LENGTH_LONG).show();
        Log.e("Msg", "Destroy");
    }

    public void back(Activity activity) {
        activity.finish();
    }
}