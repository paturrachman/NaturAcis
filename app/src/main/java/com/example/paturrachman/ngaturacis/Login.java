package com.example.paturrachman.ngaturacis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button masuk1;
    TextView masuk2;
    EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        masuk1 = (Button) findViewById(R.id.masuk);
        masuk2 = (TextView) findViewById(R.id.daftar);
        user = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.pass);


        masuk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(user.getText().toString().length()==0) {
                    //jika form Email belum di isi / masih kosong
                    user.setError("Username diperlukan!");
                }else if(pass.getText().toString().length()==0){
                    pass.setError("Password diperlukan!");
                }else {
                    //jika form sudah terisi semua
                    Toast.makeText(getApplicationContext(), "Registrasi Berhasil!",
                            Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Login.this, MainActivity.class);
                    startActivity(i);
                }
            }
        });


        masuk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this, Daftar.class);
                startActivity(i);
            }
        });

        getSupportActionBar().hide();
    }
}
