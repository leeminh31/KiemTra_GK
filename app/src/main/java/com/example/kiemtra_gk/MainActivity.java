package com.example.kiemtra_gk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    private Button btnchon,btnpause,btnplay;
    private TextView tvso,tvdodai,tvtenbaihat;
    private MediaPlayer mp;
    private double dodai =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        khaibao();
        mp = MediaPlayer.create(this,R.raw.aino);
        btnchon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ChonBai.class);
                startActivity(intent);
            }
        });
        btnpause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
            }
        });
        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                dodai=mp.getDuration();
                tvdodai.setText(String.format("%d min, %d sec",
                        TimeUnit.MILLISECONDS.toMinutes((long) dodai),
                        TimeUnit.MILLISECONDS.toSeconds((long) dodai) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) dodai)))
                );
            }
        });
    }

    private void khaibao(){
        mp = new MediaPlayer();
        btnchon = (Button) findViewById(R.id.btnChon);
        btnpause = (Button) findViewById(R.id.btnPause);
        btnplay = (Button) findViewById(R.id.btnPlay);
        tvso = (TextView) findViewById(R.id.txtSTT);
        tvdodai = (TextView) findViewById(R.id.txtDodai);
        tvtenbaihat =(TextView) findViewById(R.id.txtTenbaihat);
    }
}