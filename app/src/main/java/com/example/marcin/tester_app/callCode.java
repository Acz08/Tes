package com.example.marcin.tester_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Master on 4/21/2017.
 */

public class callCode extends AppCompatActivity{


  public void call(String phoneNumber)

    {
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:0123456789"));
        startActivity(intent);
    }

}

