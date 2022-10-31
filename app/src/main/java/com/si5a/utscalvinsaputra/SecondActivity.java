package com.si5a.utscalvinsaputra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    //Declaring the variables from activity_second
    TextView tvNama, tvNoDaftar, tvJalurs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Catching the name, etc
        tvNama = findViewById(R.id.tv_nama);
        tvNoDaftar = findViewById(R.id.tv_nomor_pendaftaran);
        tvJalurs = findViewById(R.id.tv_jalur);

        //GetString
        Intent terima = getIntent();
        String yNama = terima.getStringExtra("xNama");
        String yNoDaftar = terima.getStringExtra("xNoDaftar");
        String ySpJalur = terima.getStringExtra("xJalur");

        //SetText
        tvNama.setText(yNama);
        tvNoDaftar.setText(yNoDaftar);
        tvJalurs.setText(ySpJalur);
    }
}