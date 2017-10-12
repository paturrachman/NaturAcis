package com.example.paturrachman.ngaturacis;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class profile extends AppCompatActivity {
    TextView nama, ttl, telpon, email, user, pass;
    SharedPreferences s1,s2,s3,s4,s5,s6;
    public static final String preference = "pref";
    public static final String saveIt1 = "saveKey1";
    public static final String saveIt2 = "saveKey2";
    public static final String saveIt3 = "saveKey3";
    public static final String saveIt4 = "saveKey4";
    public static final String saveIt5 = "saveKey5";
    public static final String saveIt6 = "saveKey6";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        nama = (TextView) findViewById(R.id.txt_nama);
        email = (TextView) findViewById(R.id.txt_email);
        ttl = (TextView) findViewById(R.id.txt_ttl);
        telpon = (TextView) findViewById(R.id.txt_telpon);
        user = (TextView) findViewById(R.id.txt_user);
        pass = (TextView) findViewById(R.id.txt_pass);
        user.setVisibility(View.INVISIBLE);
        pass.setVisibility(View.INVISIBLE);
        s1 = getSharedPreferences(preference, Context.MODE_PRIVATE);
        s2 = getSharedPreferences(preference, Context.MODE_PRIVATE);
        s3 = getSharedPreferences(preference, Context.MODE_PRIVATE);
        s4 = getSharedPreferences(preference, Context.MODE_PRIVATE);
        s5 = getSharedPreferences(preference, Context.MODE_PRIVATE);
        s6 = getSharedPreferences(preference, Context.MODE_PRIVATE);


        if (s1.contains(saveIt1)) {
            nama.setText(s1.getString(saveIt1, ""));
        }
        if (s2.contains((saveIt2))){
            email.setText(s2.getString(saveIt2, ""));
        }
        if (s3.contains((saveIt3))){
            ttl.setText(s3.getString(saveIt3, ""));
        }
        if (s4.contains((saveIt4))){
            telpon.setText(s4.getString(saveIt4, ""));
        }
        if (s5.contains((saveIt5))){
            user.setText(s5.getString(saveIt5, ""));
        }
        if (s6.contains((saveIt6))){
            pass.setText(s6.getString(saveIt6, ""));
        }



        SharedPreferences sharedPreferences1 = PreferenceManager.getDefaultSharedPreferences(profile.this);
        String value1 = sharedPreferences1.getString(Daftar.KEY_SHARED1, null);
        nama.setText(value1);
        SharedPreferences sharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(profile.this);
        String value2 = sharedPreferences2.getString(Daftar.KEY_SHARED2, null);
        email.setText(value2);
        SharedPreferences sharedPreferences3 = PreferenceManager.getDefaultSharedPreferences(profile.this);
        String value3 = sharedPreferences3.getString(Daftar.KEY_SHARED3, null);
        ttl.setText(value3);
        SharedPreferences sharedPreferences4 = PreferenceManager.getDefaultSharedPreferences(profile.this);
        String value4 = sharedPreferences4.getString(Daftar.KEY_SHARED4, null);
        telpon.setText(value4);
        SharedPreferences sharedPreferences5 = PreferenceManager.getDefaultSharedPreferences(profile.this);
        String value5 = sharedPreferences5.getString(Daftar.KEY_SHARED5, null);
        user.setText(value5);
        SharedPreferences sharedPreferences6 = PreferenceManager.getDefaultSharedPreferences(profile.this);
        String value6 = sharedPreferences6.getString(Daftar.KEY_SHARED6, null);
        pass.setText(value6);


        String store1 = nama.getText().toString();
        SharedPreferences.Editor editor1 = s1.edit();
        editor1.putString(saveIt1, store1);
        editor1.commit();

        String store2 = email.getText().toString();
        SharedPreferences.Editor editor2 = s2.edit();
        editor2.putString(saveIt2, store2);
        editor2.commit();

        String store3 = ttl.getText().toString();
        SharedPreferences.Editor editor3 = s3.edit();
        editor3.putString(saveIt3, store3);
        editor3.commit();

        String store4 = telpon.getText().toString();
        SharedPreferences.Editor editor4 = s4.edit();
        editor4.putString(saveIt4, store4);
        editor4.commit();

        String store5 = user.getText().toString();
        SharedPreferences.Editor editor5 = s5.edit();
        editor5.putString(saveIt5, store5);
        editor5.commit();


        String store6 = pass.getText().toString();
        SharedPreferences.Editor editor6 = s6.edit();
        editor6.putString(saveIt6, store6);
        editor6.commit();

        tampil1();



    }

    public void tampil1(){
        nama = (TextView) findViewById(R.id.txt_nama);
        email = (TextView) findViewById(R.id.txt_email);
        ttl = (TextView) findViewById(R.id.txt_ttl);
        telpon = (TextView) findViewById(R.id.txt_telpon);
        user = (TextView) findViewById(R.id.txt_user);
        pass = (TextView) findViewById(R.id.txt_pass);
        s1 = getSharedPreferences(preference, Context.MODE_PRIVATE);
        s2 = getSharedPreferences(preference, Context.MODE_PRIVATE);
        s3 = getSharedPreferences(preference, Context.MODE_PRIVATE);
        s4 = getSharedPreferences(preference, Context.MODE_PRIVATE);
        s5 = getSharedPreferences(preference, Context.MODE_PRIVATE);
        s6 = getSharedPreferences(preference, Context.MODE_PRIVATE);
        if (s1.contains(saveIt1)) {
            nama.setText(s1.getString(saveIt1, ""));
        }
        if (s2.contains((saveIt2))){
            email.setText(s2.getString(saveIt2, ""));
        }
        if (s3.contains((saveIt3))){
            ttl.setText(s3.getString(saveIt3, ""));
        }
        if (s4.contains((saveIt4))){
            telpon.setText(s4.getString(saveIt4, ""));
        }
        if (s5.contains((saveIt5))){
            user.setText(s5.getString(saveIt5, ""));
        }
        if (s6.contains((saveIt6))){
            pass.setText(s6.getString(saveIt6, ""));
        }
    }
}
