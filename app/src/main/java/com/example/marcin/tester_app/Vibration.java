package com.example.marcin.tester_app;

import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class Vibration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibration);
        Vibrator vibrator = (Vibrator)getSystemService(getApplicationContext().VIBRATOR_SERVICE);
        vibrator.vibrate(1500);
    }
}
