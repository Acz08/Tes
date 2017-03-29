package com.example.marcin.tester_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class System_test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_test);
        Spinner lista=(Spinner) findViewById(R.id.lista);
        final String[] elementy = {"Samsung", "Huawei", "HTC", "Nokia"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, elementy);
        lista.setAdapter(adapter);

        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override

            public void onItemSelected(AdapterView<?>arg0, View arg1, int arg3, long position){
                int x=(int) position;
                switch((int)position)
                {

                    case 0:
                        Toast.makeText(getApplicationContext(),elementy[x],Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(getApplicationContext(),elementy[x],Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(),elementy[x],Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(getApplicationContext(),elementy[x],Toast.LENGTH_SHORT).show();
                        break;

                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // ta metoda wykonuje sie gdy lista zostanie wybrana, ale nie zostanie wybrany żaden element z listy

            }

        });

    }
}
