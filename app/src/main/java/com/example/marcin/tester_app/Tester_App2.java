package com.example.marcin.tester_app;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tester_App2 extends AppCompatActivity {

    public void onRequestPermissionResult(int requestCode, String[] permissions, int[] grantResults) {
        if (requestCode == 66) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Now user should be able to use camera
            }
            else {
                // Your app will not have this permission. Turn off all functions
                // that require this permission or it will force close like your
                // original question
            }
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if(Build.VERSION.SDK_INT>22)//Sprawdzanie wersji Androida
        {

//Prośba o nadanie uprawnień do kamery w Androidzie wyższym niż Loli
        if (checkSelfPermission(Manifest.permission.CAMERA)
                != PackageManager.PERMISSION_GRANTED) {

            requestPermissions(new String[]{Manifest.permission.CAMERA},
                    66);
        }
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tester__app2);
        Button red=(Button) findViewById(R.id.red);
        Button blue=(Button) findViewById(R.id.blue);
        final Button green=(Button) findViewById(R.id.green);
        Button vibration=(Button) findViewById(R.id.vibration);
        Button reciver=(Button) findViewById(R.id.reciver);
        Button led=(Button) findViewById(R.id.LED);
        Button megacam=(Button) findViewById(R.id.megacam);
        Button sensor=(Button) findViewById(R.id.sensor);
        Button touch=(Button) findViewById(R.id.touch);

        Button speaker=(Button) findViewById(R.id.speaker);


        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Red.class);
                startActivity(intent);
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Blue.class);
                startActivity(intent);
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Green.class);
                startActivity(intent);
            }
        });
        vibration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Vibration.class);
                startActivity(intent);
            }
        });
        reciver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),receiver.class);
                startActivity(intent);
            }
        });
        led.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplicationContext(),Led.class);
                startActivity(intent);
            }
        });
        megacam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),megacam.class);
                startActivity(intent);
            }
        });
        sensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),sensor.class);
                startActivity(intent);
            }
        });
        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),touch.class);
                startActivity(intent);
            }
        });

        speaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),speaker.class);
                startActivity(intent);
            }
        });


    }
}
