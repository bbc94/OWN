package com.example.bbc.own;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox c1 ;
    CheckBox c2 ;
    CheckBox c3 ;
    CheckBox c4 ;
    CheckBox c5 ;
    CheckBox c6 ;
    CheckBox c7 ;
    CheckBox c8 ;
    CheckBox c9 ;
    CheckBox c10 ;
    CheckBox c11 ;
    CheckBox c12 ;
    CheckBox c13 ;
    CheckBox c14 ;
    CheckBox c15 ;
    Button b;
    int good[] = new int[3];
    int bad[] = new int[3];
    int select[]= new int[6];
    int count=0;

    ArrayList<Integer> in = new ArrayList<>(6);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rd = new Random();

        for(int i=0;i<select.length;i++) {
            select[i]=(int)rd.nextInt(12)+1;

            for(int j=0;j<i;j++) {
                if(select[i]==select[j]) {
                    i--;
                    break;
                }
            }
        }

        for(int i=0;i<select.length;i++) {
            if(i<3) {
                good[i]=select[i];
            }
            if(i>=3) {
                bad[i-3]=select[i];
            }
        }


        c1 = findViewById(R.id.cb1);
        c2 = findViewById(R.id.cb2);
        c3 = findViewById(R.id.cb3);
        c4 = findViewById(R.id.cb4);
        c5 = findViewById(R.id.cb5);
        c6 = findViewById(R.id.cb6);
        c7 = findViewById(R.id.cb7);
        c8 = findViewById(R.id.cb8);
        c9 = findViewById(R.id.cb9);
        c10 = findViewById(R.id.cb10);
        c11 = findViewById(R.id.cb11);
        c12 = findViewById(R.id.cb12);
        c13 = findViewById(R.id.cb13);
        c14 = findViewById(R.id.cb14);
        c15 = findViewById(R.id.cb15);
        b = findViewById(R.id.Submit);
       
        b.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
            in.clear();
            if(c1.isChecked() == true) in.add(1);
            if(c2.isChecked() == true) in.add(2);
            if(c3.isChecked() == true) in.add(3);
            if(c4.isChecked() == true) in.add(4);
            if(c5.isChecked() == true) in.add(5);
            if(c6.isChecked() == true) in.add(6);
            if(c7.isChecked() == true) in.add(7);
            if(c8.isChecked() == true) in.add(8);
            if(c9.isChecked() == true) in.add(9);
            if(c10.isChecked() == true) in.add(10);
            if(c11.isChecked() == true) in.add(11);
            if(c12.isChecked() == true) in.add(12);
            if(c13.isChecked() == true) in.add(13);
            if(c14.isChecked() == true) in.add(14);
            if(c15.isChecked() == true) in.add(15);
            startActivity(new Intent(MainActivity.this, ResultActivity.class));
    }
}