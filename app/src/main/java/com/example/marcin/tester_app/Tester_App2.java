package com.example.marcin.tester_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tester_App2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tester__app2);
        Button red=(Button) findViewById(R.id.red);
        Button blue=(Button) findViewById(R.id.blue);
        final Button green=(Button) findViewById(R.id.green);
        Button vibration=(Button) findViewById(R.id.vibration);
        Button reciver=(Button) findViewById(R.id.reciver);
        Button dimming=(Button) findViewById(R.id.dimming);
        Button megacam=(Button) findViewById(R.id.megacam);
        Button sensor=(Button) findViewById(R.id.sensor);
        Button touch=(Button) findViewById(R.id.touch);
        Button sleepmode=(Button) findViewById(R.id.sleepmode);
        Button speaker=(Button) findViewById(R.id.speaker);
        Button subkey=(Button) findViewById(R.id.subkey);
        Button frontcam=(Button) findViewById(R.id.frontcam) ;
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
        dimming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),dimming.class);
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
        sleepmode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),sleepmode.class);
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
        subkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),subkey.class);
                startActivity(intent);
            }
        });
        frontcam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),frontcam.class);
                startActivity(intent);
            }
        });
    }
}
