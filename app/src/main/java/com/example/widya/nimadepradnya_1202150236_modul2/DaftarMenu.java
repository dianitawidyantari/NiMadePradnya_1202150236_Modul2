package com.example.widya.nimadepradnya_1202150236_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> JudulMenu;
    private ArrayList<Integer> GambarMenu;
    private ArrayList<String> HargaMenu;
    //Daftar Judul
    private String[] Menu = {"Nasi Goreng Spesial", "Nasi Goreng Ayam", "Nasi Goreng Cumi", "Nasi Goreng Kambing", "Ayam Goreng", "Ayam Bakar", "Ayam Serundeng"};
    //Daftar Gambar
    private int[] Gambar = {R.mipmap.nasgorspes, R.mipmap.nasgorayam, R.mipmap.nasgorcumi, R.mipmap.nasgorkambing, R.mipmap.ayamgoreng, R.mipmap.ayambakar, R.mipmap.ayamserundeng};
   private String[] Harga = {"Rp. 15.000", "Rp.20.000", "Rp.25.000", "Rp.20.000", "Rp.20.000", "Rp.15.000","Rp.15.000" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        JudulMenu = new ArrayList<>();
        GambarMenu = new ArrayList<>();
        HargaMenu = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler_view);
        DaftarItem();
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerAdapter(JudulMenu, GambarMenu, HargaMenu);
        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);
    }

    //Mengambil data dari Varibale Gambar dan Judul, lalu memasangnya pada list yang terhubung dengan Class Adapter
    private void DaftarItem(){
        for (int w=0; w<Menu.length; w++){
            GambarMenu.add(Gambar[w]);
            JudulMenu.add(Menu[w]);
            HargaMenu.add(Harga[w]);
        }
    }
}
