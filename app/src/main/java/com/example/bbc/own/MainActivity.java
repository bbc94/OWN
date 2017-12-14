package com.example.bbc.own;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity{
    public int cnt = 0;
    @Override
    protected void onStart() {
        super.onStart();
        randFunc();
        initial();
    }
    CheckBox cs[] = new CheckBox[15];
    Button b;
    static int good[] = new int[3];
    static int bad[] = new int[3];
    int select[]= new int[6];
    static ArrayList<Integer> in = new ArrayList<>(6);
    static int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cs[0] = (CheckBox) findViewById(R.id.cb1);
        cs[1] = (CheckBox) findViewById(R.id.cb2);
        cs[2] = (CheckBox) findViewById(R.id.cb3);
        cs[3] = (CheckBox) findViewById(R.id.cb4);
        cs[4] = (CheckBox) findViewById(R.id.cb5);
        cs[5] = (CheckBox) findViewById(R.id.cb6);
        cs[6] = (CheckBox) findViewById(R.id.cb7);
        cs[7] = (CheckBox) findViewById(R.id.cb8);
        cs[8] = (CheckBox) findViewById(R.id.cb9);
        cs[9] = (CheckBox) findViewById(R.id.cb10);
        cs[10] = (CheckBox) findViewById(R.id.cb11);
        cs[11] = (CheckBox) findViewById(R.id.cb12);
        cs[12] = (CheckBox) findViewById(R.id.cb13);
        cs[13] = (CheckBox) findViewById(R.id.cb14);
        cs[14] = (CheckBox) findViewById(R.id.cb15);
        b = findViewById(R.id.Submit);

    }
    public void initial(){
        for(CheckBox x : cs)
            x.setChecked(false);
    }

    public void onClick(View view) {
            if(view.getId()==R.id.Submit&&cnt==6) {
                for(int i =0;i<in.size();i++){
                    for (int j =0;j<3;j++){
                        if(in.get(i)==good[j]){
                            score+=10;
                        }
                        if(in.get(i)==bad[j]){
                            score+=1;
                        }
                    }
                }
                Toast.makeText(this,"6개 미만입니다",Toast.LENGTH_SHORT);
                startActivity(new Intent(MainActivity.this, ResultActivity.class));
            }
            in.clear();

            cnt=0;
            for(int i =0 ;i<cs.length; i++){
                if(cs[i].isChecked()) {
                    in.add(i + 1);
                    cnt++;
                    Log.w("some",String.valueOf(cnt));
                }
            }
            if(cnt>6) {
                CheckBox tmp = (CheckBox)findViewById(view.getId());
                tmp.setChecked(false);
                return;
            }



    }
    public void randFunc(){
        Random rd = new Random();

        for(int i=0;i<select.length;i++) {
            select[i]=(int)rd.nextInt(15)+1;

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
    }
}