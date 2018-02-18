package com.example.widya.nimadepradnya_1202150236_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class dinein extends AppCompatActivity {
    Spinner spinner;
    Button btPesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinein);
        btPesan = (Button)findViewById(R.id.buttonpsn);
        spinner = (Spinner)findViewById(R.id.no_meja);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.no_meja, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        btPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(dinein.this, spinner.getSelectedItem().toString()+" dipilih", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(dinein.this, DaftarMenu.class);
                startActivity(intent);
            }
        });



            }
        }


