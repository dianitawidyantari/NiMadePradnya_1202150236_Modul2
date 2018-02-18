package com.example.widya.nimadepradnya_1202150236_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent ganti = new Intent(splash.this,MainActivity.class);
                startActivity(ganti);
               Toast toast = Toast.makeText(splash.this, "Ni Made Pradnya Dianita W_1202150236", Toast.LENGTH_LONG);
               toast.show();

            }
        }, 2000);
    }


    }

