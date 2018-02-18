package com.example.widya.nimadepradnya_1202150236_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

//Class Adapter ini Digunakan Untuk Mengatur Bagaimana Data akan Ditampilkan
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private ArrayList<String> arrayList; //Digunakan untuk Judul
    private ArrayList<Integer> menuList; //Digunakan untuk gambar
    private ArrayList<String> harga;//Digunakan untuk harga

    //Membuat Konstruktor pada Class RecyclerViewAdapter
    RecyclerAdapter(ArrayList<String> arrayList, ArrayList<Integer> menuList, ArrayList<String> harga){
        this.arrayList = arrayList;
        this.menuList = menuList;
        this.harga = harga;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView JudulMenu, SubMenu;
        private ImageView Menu;
        private RelativeLayout ItemList;
        private Context context;

        ViewHolder(View itemView) {
            super(itemView);
            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            context = itemView.getContext();
            JudulMenu = itemView.findViewById(R.id.menutitle);
            SubMenu = itemView.findViewById(R.id.sub_menu);
            Menu = itemView.findViewById(R.id.menu);
            ItemList = itemView.findViewById(R.id.item_list);
            ItemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, DetailMenu.class);
                    String ingredient = "";
                    switch (getAdapterPosition()) {
                        case 0:
                            intent.putExtra("judul", arrayList.get(getAdapterPosition()));
                            intent.putExtra("harga", harga.get(getAdapterPosition()));
                            intent.putExtra("gambar", menuList.get(getAdapterPosition()));
                            ingredient = "nasi,garam,merica,telur,sayur,cabai";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 1:
                            intent.putExtra("judul", arrayList.get(getAdapterPosition()));
                            intent.putExtra("harga", harga.get(getAdapterPosition()));
                            intent.putExtra("gambar", menuList.get(getAdapterPosition()));
                            ingredient = "nasi,garam, ayam, sayur, cabe";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 2:
                            intent.putExtra("judul", arrayList.get(getAdapterPosition()));
                            intent.putExtra("harga", harga.get(getAdapterPosition()));
                            intent.putExtra("gambar", menuList.get(getAdapterPosition()));
                            ingredient = "nasi,cumi,sayur, garam, cabe";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 3:
                            intent.putExtra("judul", arrayList.get(getAdapterPosition()));
                            intent.putExtra("harga", harga.get(getAdapterPosition()));
                            intent.putExtra("gambar", menuList.get(getAdapterPosition()));
                            ingredient = "nasi,kambing,sayur, garam, cabe";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 4:
                            intent.putExtra("judul", arrayList.get(getAdapterPosition()));
                            intent.putExtra("harga", harga.get(getAdapterPosition()));
                            intent.putExtra("gambar", menuList.get(getAdapterPosition()));
                            ingredient = "ayam,nasi,sayur, cabai";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 5:
                            intent.putExtra("judul", arrayList.get(getAdapterPosition()));
                            intent.putExtra("harga", harga.get(getAdapterPosition()));
                            intent.putExtra("gambar", menuList.get(getAdapterPosition()));
                            ingredient = "ayam,nasi,sayur, cabai";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                        case 6:
                            intent.putExtra("judul", arrayList.get(getAdapterPosition()));
                            intent.putExtra("harga", harga.get(getAdapterPosition()));
                            intent.putExtra("gambar", menuList.get(getAdapterPosition()));
                            ingredient = "ayam,nasi,sayur, cabai";
                            intent.putExtra("komposisi", ingredient);
                            context.startActivity(intent);
                            break;
                    }
                    }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Membuat View untuk Menyiapkan dan Memasang Layout yang Akan digunakan pada RecyclerView
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        final String Nama = arrayList.get(position);
        final String dtharga = harga.get(position);
        final Integer gbr = menuList.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        holder.JudulMenu.setText(Nama);
        holder.SubMenu.setText(dtharga);
        holder.Menu.setImageResource(menuList.get(position)); // Mengambil gambar sesuai posisi yang telah ditentukan
        //Membuat Aksi Saat Judul Pada List ditekan
            }


    @Override
    public int getItemCount() {
        //Menghitung Ukuran/Jumlah Data Yang Akan Ditampilkan Pada RecyclerView
        return arrayList.size();
    }

}