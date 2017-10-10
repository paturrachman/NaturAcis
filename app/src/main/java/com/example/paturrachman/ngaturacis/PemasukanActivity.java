package com.example.paturrachman.ngaturacis;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;



public class PemasukanActivity extends AppCompatActivity {
    private Button btntanggal, btnwaktu, btnsimpan;
    private LinearLayout parent1;
    private EditText txttanggal, txtwaktu, txtpemasukan,txtketerangan,txttotal,txtjumlah;

    private int mYear, mMonth, mDay, mHour, mMinute;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemasukan);


        txtketerangan = (EditText) findViewById(R.id.txtketerangan);
        txtpemasukan = (EditText) findViewById(R.id.txtpemasukan);
        btnsimpan = (Button) findViewById(R.id.btnpemasukan);


        btnsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtpemasukan.getText().toString().length()==0) {
                    //jika form Email belum di isi / masih kosong
                    txtpemasukan.setError("Isi Pemasukan Anda!");
                }else if(txtketerangan.getText().toString().length()==0){
                    txtketerangan.setError("Isi Keterangan Pemasukan!");
                } else if (txttanggal.getText().toString().length()==0){
                    txttanggal.setError("Atur Tanggal Terlebih Dahulu!");
                }else if (txtwaktu.getText().toString().length() ==0){
                    txtwaktu.setError("Atur Waktu Terlebih Dahulu!");
                }else {
                    //jika form sudah terisi semua
                    Toast.makeText(getApplicationContext(), "Registrasi Berhasil!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        /*-----------------Sintax_enable_edit_text*------------------*/
        final TextView et = (TextView) findViewById(R.id.txtjumlah);
        final TextView et_city = (TextView) findViewById(R.id.txttotal);

        et_city.setInputType(InputType.TYPE_NULL);
        et_city.setKeyListener(null);

        et.setInputType(InputType.TYPE_NULL);
        et.setKeyListener(null);

        /*-----------------Sintax_enable_edit_text*------------------*/


    }

}
