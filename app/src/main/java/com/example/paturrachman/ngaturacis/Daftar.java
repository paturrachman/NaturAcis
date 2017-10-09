package com.example.paturrachman.ngaturacis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Daftar extends AppCompatActivity {
    Button daftar,masuk1;
    EditText nama, ttl, telpon, email, user, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        masuk1 = (Button) findViewById(R.id.login);
        daftar = (Button) findViewById(R.id.simpan);
        nama = (EditText) findViewById(R.id.nama);
        email = (EditText) findViewById(R.id.email);
        ttl = (EditText) findViewById(R.id.ttl);
        telpon = (EditText) findViewById(R.id.telpon);
        user = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.pass);
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nama.getText().toString().length()==0 ) {
                    //jika form Email belum di isi / masih kosong
                    nama.setError("Tidak Boleh Kosong!");
                }else if(email.getText().toString().length()==0){
                    email.setError("Tidak Boleh Kosong!");
                }else if(ttl.getText().toString().length()==0){
                    ttl.setError("Tidak Boleh Kosong!");
                }else if(telpon.getText().toString().length()==0){
                    telpon.setError("Masukan Nomor Anda!");
                }else if(user.getText().toString().length()==0){
                    user.setError("Tidak Boleh Kosong!");
                }else if(pass.getText().toString().length()==0){
                    pass.setError("Tidak Boleh Koseng!");
                }else {
                    //jika form sudah terisi semua
                    Toast.makeText(getApplicationContext(), "Registrasi Berhasil!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        masuk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent i = new Intent(Daftar.this, Login.class);
                    startActivity(i);
            }
        });
    }
}
