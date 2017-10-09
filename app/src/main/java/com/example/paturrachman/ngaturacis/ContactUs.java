package com.example.paturrachman.ngaturacis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.widget.EditText;

public class ContactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        /*-----------------Sintax_enable_edit_text*------------------*/
        final EditText satu = (EditText) findViewById(R.id.facebook);
        final EditText dua = (EditText) findViewById(R.id.gmail);
        final EditText tiga = (EditText) findViewById(R.id.whatsapp);
        final EditText empat = (EditText) findViewById(R.id.call);

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
