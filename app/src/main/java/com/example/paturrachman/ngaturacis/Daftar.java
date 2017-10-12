package com.example.paturrachman.ngaturacis;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Daftar extends AppCompatActivity {
    Button daftar;
    EditText nama, ttl, telpon, email, user, pass;
    public static final String KEY_SHARED1 = "Daftar.KEY1";
    public static final String KEY_SHARED2 = "Daftar.KEY2";
    public static final String KEY_SHARED3 = "Daftar.KEY3";
    public static final String KEY_SHARED4 = "Daftar.KEY4";
    public static final String KEY_SHARED5 = "Daftar.KEY5";
    public static final String KEY_SHARED6 = "Daftar.KEY6";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_daftar);
        getSupportActionBar().hide();

        daftar = (Button) findViewById(R.id.daftar1);
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
                    String value1 = nama.getText().toString();
                    SharedPreferences sharedPreferences1 = PreferenceManager.getDefaultSharedPreferences(Daftar.this);
                    SharedPreferences.Editor edit1 = sharedPreferences1.edit();
                    edit1.putString(KEY_SHARED1, value1);
                    edit1.commit();

                    String value2 = email.getText().toString();
                    SharedPreferences sharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(Daftar.this);
                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                    edit2.putString(KEY_SHARED2, value2);
                    edit2.commit();

                    String value3 = ttl.getText().toString();
                    SharedPreferences sharedPreferences3 = PreferenceManager.getDefaultSharedPreferences(Daftar.this);
                    SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                    edit3.putString(KEY_SHARED3, value3);
                    edit3.commit();

                    String value4 = telpon.getText().toString();
                    SharedPreferences sharedPreferences4 = PreferenceManager.getDefaultSharedPreferences(Daftar.this);
                    SharedPreferences.Editor edit4 = sharedPreferences4.edit();
                    edit4.putString(KEY_SHARED4, value4);
                    edit4.commit();

                    String value5 = user.getText().toString();
                    SharedPreferences sharedPreferences5 = PreferenceManager.getDefaultSharedPreferences(Daftar.this);
                    SharedPreferences.Editor edit5 = sharedPreferences5.edit();
                    edit5.putString(KEY_SHARED5, value5);
                    edit5.commit();

                    String value6 = pass.getText().toString();
                    SharedPreferences sharedPreferences6 = PreferenceManager.getDefaultSharedPreferences(Daftar.this);
                    SharedPreferences.Editor edit6 = sharedPreferences6.edit();
                    edit6.putString(KEY_SHARED6, value6);
                    edit6.commit();

                }

                    Toast.makeText(getApplicationContext(), "Registrasi Berhasil!",Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Daftar.this, Login.class);
                        startActivity(i);


                }

        });


    }
}
