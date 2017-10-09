package com.example.paturrachman.ngaturacis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.widget.EditText;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

         /*-----------------Sintax_enable_edit_text*------------------*/
        final EditText satu = (EditText) findViewById(R.id.nama);
        final EditText dua = (EditText) findViewById(R.id.email);
        final EditText tiga = (EditText) findViewById(R.id.ttl);
        final EditText empat = (EditText) findViewById(R.id.telpon);

        satu.setInputType(InputType.TYPE_NULL);
        satu.setKeyListener(null);

        dua.setInputType(InputType.TYPE_NULL);
        dua.setKeyListener(null);

        tiga.setInputType(InputType.TYPE_NULL);
        tiga.setKeyListener(null);

        empat.setInputType(InputType.TYPE_NULL);
        empat.setKeyListener(null);
        /*-----------------Sintax_enable_edit_text*------------------*/
    }
}
