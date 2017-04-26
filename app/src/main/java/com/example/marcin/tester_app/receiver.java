package com.example.marcin.tester_app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class receiver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);
        ToneGenerator toneGen1 = new ToneGenerator(AudioManager.STREAM_VOICE_CALL, 100);
        toneGen1.startTone(ToneGenerator.TONE_CDMA_PIP,1000);

    }
}
