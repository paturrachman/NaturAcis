package com.example.paturrachman.ngaturacis;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        RelativeLayout masuk1,masuk2,masuk3,masuk4,masuk5,masuk6,masuk7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        masuk1 = (RelativeLayout) findViewById(R.id.money);
        masuk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, PemasukanActivity.class);
                startActivity(i);
            }
        });

        masuk2 = (RelativeLayout) findViewById(R.id.empat);
        masuk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent peng = new Intent(MainActivity.this, pengeluaran.class);
                startActivity(peng);
            }
        });

        masuk3 = (RelativeLayout) findViewById(R.id.satu);
        masuk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lap = new Intent(MainActivity.this, Laporan.class);
                startActivity(lap);
            }
        });

        masuk4 = (RelativeLayout) findViewById(R.id.dua);
        masuk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lap = new Intent(MainActivity.this, profile.class);
                startActivity(lap);
            }
        });

        masuk5 = (RelativeLayout) findViewById(R.id.kontak);
        masuk5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kontak = new Intent(MainActivity.this, ContactUs.class);
                startActivity(kontak);
            }
        });

        masuk6 = (RelativeLayout) findViewById(R.id.about);
        masuk6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abaut = new Intent(MainActivity.this,AboutUs.class);
                startActivity(abaut);
            }
        });

        masuk7 = (RelativeLayout) findViewById(R.id.rumah);
        masuk7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(MainActivity.this, MainActivity.class);
                startActivity(home);
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

