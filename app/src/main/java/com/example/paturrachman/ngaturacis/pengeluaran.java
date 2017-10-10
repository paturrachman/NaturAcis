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

public class pengeluaran extends AppCompatActivity {
    private Spinner spinner1;
    private Button btntanggal, btnwaktu,simpan;
    private LinearLayout parent1;
    private EditText txttanggal, txtwaktu,txtpengeluaran,txtketerangan;

    private int mYear, mMonth, mDay, mHour, mMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengeluaran);

        simpan = (Button) findViewById(R.id.simpan);
        txtpengeluaran = (EditText) findViewById(R.id.txtpengeluaran);
        txtketerangan = (EditText) findViewById(R.id.txtketerangan);



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

}

