package com.example.widya.nimadepradnya_1202150236_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class takeaway extends AppCompatActivity {
    Button pesan;
    EditText nama, phone, alamat, catatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takeaway);

        pesan = (Button)findViewById(R.id.btPesan);
        nama = (EditText)findViewById(R.id.nama);
        phone = (EditText)findViewById(R.id.phone);
        alamat = (EditText)findViewById(R.id.almt);
        catatan = (EditText)findViewById(R.id.ctt);

        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nama.getText().toString().length()==0){
                    nama.setError("Masukkan nama");
                }
                else if(phone.getText().toString().length()==0){
                    phone.setError("Masukkan nomor HP");
                }
                else if(alamat.getText().toString().length()==0) {
                    alamat.setError("Masukkan alamat");
                }
                else{
                    Intent intent = new Intent(takeaway.this, DaftarMenu.class);
                    startActivity(intent);
                }

            }

        });
    }
}
