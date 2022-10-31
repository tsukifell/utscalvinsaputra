package com.si5a.utscalvinsaputra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declaring the variables
    private EditText etNama, etNomorDaftar;
    private Spinner spJalur;
    private CheckBox cbKonfirmasi;
    private Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Connecting the variables
        etNama = findViewById(R.id.et_nama);
        etNomorDaftar = findViewById(R.id.et_nomor_daftar);
        spJalur = findViewById(R.id.sp_jalur);
        cbKonfirmasi = findViewById(R.id.cb_konfirmasi);
        btnDaftar = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = etNama.getText().toString();
                String noDaftar = etNomorDaftar.getText().toString();
                String spJalurs = spJalur.getSelectedItem().toString();

                if(nama.trim().equals("")){
                    etNama.setError("Nama wajib diketik!");

                }

                else if(noDaftar.trim().equals("")){
                    etNomorDaftar.setError("Nomor pendaftaran wajib diketik!");
                }

                else if(spJalurs.trim().equals("Jalur Pendaftaran")){
                    Toast.makeText(MainActivity.this, "Harap pilih Jalur Pendaftaran terlebih dahulu!", Toast.LENGTH_SHORT).show();
                }

                else if(!(cbKonfirmasi.isChecked())){
                    Toast.makeText(MainActivity.this, "Harap konfirmasi terlebih dahulu!", Toast.LENGTH_SHORT).show();
                }


                else{
                    Intent pindah = new Intent(MainActivity.this, SecondActivity.class);
                    pindah.putExtra("xNama", nama);
                    pindah.putExtra("xNoDaftar", noDaftar);
                    pindah.putExtra("xJalur", spJalurs);
                    startActivity(pindah);}
            }
        });
    }
}