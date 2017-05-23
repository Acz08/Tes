package com.example.marcin.tester_app;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class sensor extends AppCompatActivity {
    TextView sensory_text;
    SensorManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor);
        sensory_text=(TextView)findViewById(R.id.sensor_text);

        manager=(SensorManager)getSystemService(SENSOR_SERVICE);
        List<Sensor> sensory =manager.getSensorList(Sensor.TYPE_ALL);

        for(int x=0;x<sensory.size();x++){
            sensory_text.setText(sensory_text.getText()+"\n"+sensory.get(x).getName());
        }


    }
}
