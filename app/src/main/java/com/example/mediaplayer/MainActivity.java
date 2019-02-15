package com.example.mediaplayer;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    MediaPlayer mp2=new MediaPlayer();
    MediaPlayer mp1=new MediaPlayer();
    MediaPlayer mp=new MediaPlayer();
    public void playsong1(View view) {
        String filename = "android.resource://" + this.getPackageName() + "/raw/buscoalexcampos";
        ImageView img=(ImageView) findViewById(R.id.musicimg);

        mp1.stop();
        mp2.stop();
        mp.reset();
        try {
            mp.setDataSource(this,Uri.parse(filename));
        } catch (Exception e) {}
        try {
            mp.prepare();
        } catch (Exception e) {}
        mp.start();
        img.setImageResource(R.drawable.s1);

    }
    public void playsong2(View view) {
        String filename1 = "android.resource://" + this.getPackageName() + "/raw/cautivadoface2face";
        ImageView img=(ImageView) findViewById(R.id.musicimg);

        mp.stop();
        mp2.stop();
        mp1.reset();
        try {
            mp1.setDataSource(this,Uri.parse(filename1));
        } catch (Exception e) {}
        try {
            mp1.prepare();
        } catch (Exception e) {}
        mp1.start();
        img.setImageResource(R.drawable.s2);
    }

    public void playsong3(View view) {
        String filename2 = "android.resource://" + this.getPackageName() + "/raw/miuniversojesusadrianromero";
        ImageView img=(ImageView) findViewById(R.id.musicimg);

        mp.stop();
        mp1.stop();
        mp2.reset();
        try {
            mp2.setDataSource(this,Uri.parse(filename2));
        } catch (Exception e) {}
        try {
            mp2.prepare();
        } catch (Exception e) {}
        mp2.start();
        img.setImageResource(R.drawable.s3);
    }

    public void control(View view) {
        RadioGroup g=(RadioGroup) findViewById(R.id.rgroup);
        int current=g.getCheckedRadioButtonId();
        switch(current){
            case R.id.song1:
                mp.stop();
            case R.id.song2:
                mp1.stop();
            case R.id.song3:
                mp2.stop();
        }

    }
}
