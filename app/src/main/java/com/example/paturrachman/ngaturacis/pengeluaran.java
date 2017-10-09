package com.example.paturrachman.ngaturacis;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

public class pengeluaran extends AppCompatActivity implements View.OnClickListener {
    private Spinner spinner1;
    private Button btntanggal, btnwaktu,simpan;
    private LinearLayout parent1;
    private EditText txttanggal, txtwaktu,txtpengeluaran,txtketerangan;

    private int mYear, mMonth, mDay, mHour, mMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengeluaran);

        btntanggal = (Button) findViewById(R.id.btntanggal);
        btnwaktu = (Button) findViewById(R.id.btnwaktu);
        txttanggal = (EditText) findViewById(R.id.txttanggal);
        txtwaktu = (EditText) findViewById(R.id.txtwaktu);
        parent1 = (LinearLayout) findViewById(R.id.parent1);
        simpan = (Button) findViewById(R.id.simpan);
        txtpengeluaran = (EditText) findViewById(R.id.txtpengeluaran);
        txtketerangan = (EditText) findViewById(R.id.txtketerangan);


        btntanggal.setOnClickListener(this);
        btnwaktu.setOnClickListener(this);

        spinner1 = (Spinner) findViewById(R.id.spinner);
        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());

        /*-----------button aksi-------------*/
        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtpengeluaran.getText().toString().length()==0) {
                    //jika form Email belum di isi / masih kosong
                    txtpengeluaran.setError("Isi Pengeluaran Anda!");
                }else if(txtketerangan.getText().toString().length()==0){
                    txtketerangan.setError("Isi Keterangan!");
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
        final EditText empat = (EditText) findViewById(R.id.editText4);

        et_city.setInputType(InputType.TYPE_NULL);
        et_city.setKeyListener(null);

        et.setInputType(InputType.TYPE_NULL);
        et.setKeyListener(null);

        empat.setInputType(InputType.TYPE_NULL);
        empat.setKeyListener(null);
        /*-----------------Sintax_enable_edit_text*------------------*/

    }

    public class CustomOnItemSelectedListener implements AdapterView.OnItemSelectedListener {

        String firstItem = String.valueOf(spinner1.getSelectedItem());

        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
            if (firstItem.equals(String.valueOf(spinner1.getSelectedItem()))) {
                // ToDo when first item is selected
            } else {
                Toast.makeText(parent.getContext(),
                        "Kamu memilih : " + parent.getItemAtPosition(pos).toString(),
                        Toast.LENGTH_LONG).show();
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> arg) {

        }

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

