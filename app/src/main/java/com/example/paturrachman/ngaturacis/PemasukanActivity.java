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
import android.widget.TimePicker;
import android.widget.Toast;



public class PemasukanActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btntanggal, btnwaktu, btnsimpan;
    private LinearLayout parent1;
    private EditText txttanggal, txtwaktu, txtpemasukan,txtketerangan,txttotal,txtjumlah;

    private int mYear, mMonth, mDay, mHour, mMinute;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemasukan);

        btntanggal = (Button) findViewById(R.id.btntanggal);
        btnwaktu = (Button) findViewById(R.id.btnwaktu);
        txttanggal = (EditText) findViewById(R.id.txttanggal);
        txtwaktu = (EditText) findViewById(R.id.txtwaktu);
        parent1 = (LinearLayout) findViewById(R.id.parent1);

        txtjumlah = (EditText) findViewById(R.id.txtjumlah);
        txttotal = (EditText) findViewById(R.id.txttotal);
        txtketerangan = (EditText) findViewById(R.id.txtketerangan);
        txtpemasukan = (EditText) findViewById(R.id.txtpemasukan);
        btnsimpan = (Button) findViewById(R.id.btnpemasukan);

        btntanggal.setOnClickListener(this);
        btnwaktu.setOnClickListener(this);

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
        final EditText et = (EditText) findViewById(R.id.txtwaktu);
        final EditText et_city = (EditText) findViewById(R.id.txttanggal);
        final EditText tiga = (EditText) findViewById(R.id.txtjumlah);
        final EditText empat = (EditText) findViewById(R.id.txttotal);

        et_city.setInputType(InputType.TYPE_NULL);
        et_city.setKeyListener(null);

        et.setInputType(InputType.TYPE_NULL);
        et.setKeyListener(null);

        tiga.setInputType(InputType.TYPE_NULL);
        tiga.setKeyListener(null);

        empat.setInputType(InputType.TYPE_NULL);
        empat.setKeyListener(null);
        /*-----------------Sintax_enable_edit_text*------------------*/


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btntanggal:

                Calendar c =Calendar.getInstance();
                mYear = c.get(Calendar.YEAR);
                mMonth = c.get(Calendar.MONTH);
                mDay = c.get(Calendar.DAY_OF_MONTH);


                DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                txttanggal.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
                break;
            case R.id.btnwaktu:

                c = Calendar.getInstance();
                mHour = c.get(Calendar.HOUR_OF_DAY);
                mMinute = c.get(Calendar.MINUTE);

                TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                        new TimePickerDialog.OnTimeSetListener() {

                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                                txtwaktu.setText(hourOfDay + ":" + minute);
                            }
                        }, mHour, mMinute, false);
                timePickerDialog.show();
                break;
        }
    }
}
