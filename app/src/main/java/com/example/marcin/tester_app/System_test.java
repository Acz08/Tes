package com.example.marcin.tester_app;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class System_test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_test);
        final Button play=(Button) findViewById(R.id.play);
        final Spinner lista=(Spinner) findViewById(R.id.lista);
        final String[] elementy = {"", "IMEI","HTC","Samsung", "Huawei", "Motorola", "LG", "Sony", "Xiaomi"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, elementy);
        lista.setAdapter(adapter);

        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override

            public void onItemSelected(AdapterView<?>arg0, View arg1, int arg3, long position){
                int x=(int) position;
                switch((int)position)
                {

                    case 1:
                        //Toast po wybraniu elementu
                        Toast.makeText(getApplicationContext(),elementy[x],Toast.LENGTH_SHORT).show();
                        play.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {
                        //Obsługa schowka
                                if(android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.HONEYCOMB) {
                                    android.text.ClipboardManager clipboard = (android.text.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                                    clipboard.setText("*#06#");
                                } else {
                                    android.content.ClipboardManager clipboard = (android.content.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                                    android.content.ClipData clip = android.content.ClipData.newPlainText("Copied Text", "*#06#");
                                    clipboard.setPrimaryClip(clip);
                                }
                                Intent intent = new Intent(Intent.ACTION_DIAL);
                                Toast.makeText(getApplicationContext(),"Skopiowano kod do schowka",Toast.LENGTH_SHORT).show();
                                startActivity(intent);


                            }
                        });
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(),elementy[x],Toast.LENGTH_SHORT).show();
                        play.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {
                                if(android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.HONEYCOMB) {
                                    android.text.ClipboardManager clipboard = (android.text.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                                    clipboard.setText("*#*#3424#*#*");
                                } else {
                                    android.content.ClipboardManager clipboard = (android.content.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                                    android.content.ClipData clip = android.content.ClipData.newPlainText("Copied Text", "*#*#3424#*#*");
                                    clipboard.setPrimaryClip(clip);
                                }
                                Intent intent = new Intent(Intent.ACTION_DIAL);
                                Toast.makeText(getApplicationContext(),"Skopiowano kod do schowka",Toast.LENGTH_SHORT).show();
                                startActivity(intent);

                            }
                        });
                        break;
                    case 3:
                        Toast.makeText(getApplicationContext(),elementy[x],Toast.LENGTH_SHORT).show();
                        play.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {
                                if(android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.HONEYCOMB) {
                                    android.text.ClipboardManager clipboard = (android.text.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                                    clipboard.setText("*#0*#");
                                } else {
                                    android.content.ClipboardManager clipboard = (android.content.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                                    android.content.ClipData clip = android.content.ClipData.newPlainText("Copied Text", "*#0*#");
                                    clipboard.setPrimaryClip(clip);
                                }
                                Intent intent = new Intent(Intent.ACTION_DIAL);
                                Toast.makeText(getApplicationContext(),"Skopiowano kod do schowka",Toast.LENGTH_SHORT).show();
                                startActivity(intent);

                            }
                        });
                        break;

                    case 4:
                        Toast.makeText(getApplicationContext(),elementy[x],Toast.LENGTH_SHORT).show();
                        play.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {
                                if(android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.HONEYCOMB) {
                                    android.text.ClipboardManager clipboard = (android.text.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                                    clipboard.setText("*#*#2846579#*#*");
                                } else {
                                    android.content.ClipboardManager clipboard = (android.content.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                                    android.content.ClipData clip = android.content.ClipData.newPlainText("Copied Text", "*#*#2846579#*#*");
                                    clipboard.setPrimaryClip(clip);
                                }
                                Intent intent = new Intent(Intent.ACTION_DIAL);
                                Toast.makeText(getApplicationContext(),"Skopiowano kod do schowka",Toast.LENGTH_SHORT).show();
                                startActivity(intent);

                            }
                        });
                        break;
                    case 5:
                        Toast.makeText(getApplicationContext(),elementy[x],Toast.LENGTH_SHORT).show();
                        play.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {
                                if(android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.HONEYCOMB) {
                                    android.text.ClipboardManager clipboard = (android.text.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                                    clipboard.setText("*#*#4636#*#*");
                                } else {
                                    android.content.ClipboardManager clipboard = (android.content.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                                    android.content.ClipData clip = android.content.ClipData.newPlainText("Copied Text", "*#*#4636#*#*");
                                    clipboard.setPrimaryClip(clip);
                                }
                                Intent intent = new Intent(Intent.ACTION_DIAL);
                                Toast.makeText(getApplicationContext(),"Skopiowano kod do schowka",Toast.LENGTH_SHORT).show();
                                startActivity(intent);

                            }
                        });
                        break;
                    case 6:
                        Toast.makeText(getApplicationContext(),elementy[x],Toast.LENGTH_SHORT).show();
                        play.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {
                                if(android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.HONEYCOMB) {
                                    android.text.ClipboardManager clipboard = (android.text.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                                    clipboard.setText("*#546468#*");
                                } else {
                                    android.content.ClipboardManager clipboard = (android.content.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                                    android.content.ClipData clip = android.content.ClipData.newPlainText("Copied Text", "*#546468#*");
                                    clipboard.setPrimaryClip(clip);
                                }
                                Intent intent = new Intent(Intent.ACTION_DIAL);
                                Toast.makeText(getApplicationContext(),"Skopiowano kod do schowka",Toast.LENGTH_SHORT).show();
                                startActivity(intent);

                            }
                        });
                        break;
                    case 7:
                        Toast.makeText(getApplicationContext(),elementy[x],Toast.LENGTH_SHORT).show();
                        play.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {
                                if(android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.HONEYCOMB) {
                                    android.text.ClipboardManager clipboard = (android.text.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                                    clipboard.setText("*#*#7378423#*#*");
                                } else {
                                    android.content.ClipboardManager clipboard = (android.content.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                                    android.content.ClipData clip = android.content.ClipData.newPlainText("Copied Text", "*#*#7378423#*#*");
                                    clipboard.setPrimaryClip(clip);
                                }
                                Intent intent = new Intent(Intent.ACTION_DIAL);
                                Toast.makeText(getApplicationContext(),"Skopiowano kod do schowka",Toast.LENGTH_SHORT).show();
                                startActivity(intent);

                            }
                        });
                        break;
                    case 8:
                        Toast.makeText(getApplicationContext(),elementy[x],Toast.LENGTH_SHORT).show();
                        play.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {
                                if(android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.HONEYCOMB) {
                                    android.text.ClipboardManager clipboard = (android.text.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                                    clipboard.setText("*#*#546368#*#*");
                                } else {
                                    android.content.ClipboardManager clipboard = (android.content.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                                    android.content.ClipData clip = android.content.ClipData.newPlainText("Copied Text", "*#*#546368#*#*");
                                    clipboard.setPrimaryClip(clip);
                                }
                                Intent intent = new Intent(Intent.ACTION_DIAL);
                                Toast.makeText(getApplicationContext(),"Skopiowano kod do schowka",Toast.LENGTH_SHORT).show();
                                startActivity(intent);

                            }
                        });
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
