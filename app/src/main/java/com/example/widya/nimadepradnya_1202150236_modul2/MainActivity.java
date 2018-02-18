package com.example.widya.nimadepradnya_1202150236_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton DI,TA;
    RadioGroup rg;
    Button P;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = findViewById(R.id.rg);
        DI = findViewById(R.id.DI);
        TA = findViewById(R.id.TA);
        P = findViewById(R.id.buttonP);
    }

    public void proses(View view) {
        int selectitem = rg.getCheckedRadioButtonId();

        if(selectitem == DI.getId()){
            Intent dinein1 = new Intent(MainActivity.this, dinein.class);
            startActivity(dinein1);
            Toast toast = Toast.makeText(this,"Dine In", Toast.LENGTH_LONG);
            toast.show();
        }else if (selectitem == TA.getId()){
            Intent takeaway1 = new Intent(MainActivity.this,takeaway.class);
            startActivity(takeaway1);
        Toast toast = Toast.makeText(this,"Take Away", Toast.LENGTH_LONG);
            toast.show();
        }

    }
}
