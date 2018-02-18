package com.example.widya.nimadepradnya_1202150236_modul2;


    import android.content.Intent;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.ImageView;
    import android.widget.TextView;
    import android.widget.Toolbar;


public class DetailMenu extends AppCompatActivity {
    private TextView a, b, e;
    private ImageView d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_menu);


    a = (TextView) findViewById(R.id.namamakanan);

        b = (TextView) findViewById(R.id.harga);

        e = (TextView) findViewById(R.id.komposisi);

        d = (ImageView) findViewById(R.id.gambar);


        //melakukan get data dari menu fitur sebelumnya sudah membawa data yang dikirim
        Intent c = getIntent();

        String menu = c.getStringExtra("judul");
        String hrga = c.getStringExtra("harga");
        String kmposisi= c.getStringExtra("komposisi");
        Integer gmbr = c.getIntExtra("gambar",0);

        //melakukan set tex maupun setImageResource untuk data yang sudah di bawa dari layout sbeelumnya
        a.setText(menu);
        b.setText(hrga);
        e.setText(kmposisi);
        d.setImageResource(gmbr);




    }
}
