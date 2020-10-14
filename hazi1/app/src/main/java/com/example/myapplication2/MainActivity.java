package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText szam4 = findViewById(R.id.szam1);
        final EditText szam5 = findViewById(R.id.szam2);
        final TextView eredmeny = findViewById(R.id.eredmeny);
        Button gombosszead = findViewById(R.id.button1);
        Button gombkivon = findViewById(R.id.button2);
        Button gombszoroz = findViewById(R.id.button3);
        Button gombeloszt = findViewById(R.id.button4);

        gombosszead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double osszeg = Double.parseDouble(szam4.getText().toString()) + Double.parseDouble(szam5.getText().toString());
                eredmeny.setText(Double.toString(osszeg));
            }
        });

        gombkivon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double osszeg = Double.parseDouble(szam4.getText().toString()) - Double.parseDouble(szam5.getText().toString());
                eredmeny.setText(Double.toString(osszeg));
            }
        });

        gombszoroz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double osszeg = Double.parseDouble(szam4.getText().toString()) * Double.parseDouble(szam5.getText().toString());
                eredmeny.setText(Double.toString(osszeg));
            }
        });

        gombeloszt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double osszeg = Double.parseDouble(szam4.getText().toString()) / Double.parseDouble(szam5.getText().toString());
                eredmeny.setText(Double.toString(osszeg));
            }
        });
    }
}
