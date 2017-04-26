package com.example.marcin.tester_app;

import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class receiver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);
        //Generowanie tonu
        ToneGenerator toneGen1 = new ToneGenerator(AudioManager.STREAM_VOICE_CALL, 100);
        toneGen1.startTone(ToneGenerator.TONE_CDMA_PIP,1000);

    }
}
