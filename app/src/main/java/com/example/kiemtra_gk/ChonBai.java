package com.example.kiemtra_gk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChonBai extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btnchon;
    private TextView tvso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick);
        khaibao();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvso.setText("1");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvso.setText("2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvso.setText("3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvso.setText("4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvso.setText("5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvso.setText("6");
            }
        });
        btnchon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChonBai.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
    private void khaibao(){
        btn1 = (Button) findViewById(R.id.btnBai1);
        btn2 = (Button) findViewById(R.id.btnBai2);
        btn3 = (Button) findViewById(R.id.btnBai3);
        btn4 = (Button) findViewById(R.id.btnBai4);
        btn5 = (Button) findViewById(R.id.btnBai5);
        btn6 = (Button) findViewById(R.id.btnBai6);
        btnchon = (Button) findViewById(R.id.btnChange);
        tvso = (TextView) findViewById(R.id.txtSo);
    }
}
