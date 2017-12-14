package com.example.bbc.own;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    int num = MainActivity.score;
    ImageView imageView =null;
    TextView txGood;
    TextView txGood1;
    TextView txGood2;
    TextView txGood3;
    TextView txBad;
    TextView txBad1;
    TextView txBad2;
    TextView txBad3;
    int g1 = MainActivity.good[0];
    int g2 = MainActivity.good[1];
    int g3 = MainActivity.good[2];
    int b1 = MainActivity.bad[0];
    int b2 = MainActivity.bad[1];
    int b3 = MainActivity.bad[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        txGood =findViewById(R.id.Good);
        txGood1 =findViewById(R.id.Good1);
        txGood2 =findViewById(R.id.Good2);
        txGood3 =findViewById(R.id.Good3);
        txBad = findViewById(R.id.Bad);
        txBad1 = findViewById(R.id.Bad1);
        txBad2 = findViewById(R.id.Bad2);
        txBad3 = findViewById(R.id.Bad3);
        imageView = (ImageView)findViewById(R.id.unse);

        txGood1.setText(String.valueOf(g1));
        txGood2.setText(String.valueOf(g2));
        txGood3.setText(String.valueOf(g3));
        txBad1.setText(String.valueOf(b1));
        txBad2.setText(String.valueOf(b2));
        txBad3.setText(String.valueOf(b3));

        switch (num){
            case 0 : imageView.setImageResource(R.drawable.i1);break;
            case 1 : imageView.setImageResource(R.drawable.i11);break;
            case 2 : imageView.setImageResource(R.drawable.i14);break;
            case 3 : imageView.setImageResource(R.drawable.i16);break;
            case 10 : imageView.setImageResource(R.drawable.i5);break;
            case 11 : imageView.setImageResource(R.drawable.i2);break;
            case 12 : imageView.setImageResource(R.drawable.i12);break;
            case 13 : imageView.setImageResource(R.drawable.i15);break;
            case 20 : imageView.setImageResource(R.drawable.i8);break;
            case 21 : imageView.setImageResource(R.drawable.i6);break;
            case 22 : imageView.setImageResource(R.drawable.i3);break;
            case 23 : imageView.setImageResource(R.drawable.i13);break;
            case 30 : imageView.setImageResource(R.drawable.i10);break;
            case 31 : imageView.setImageResource(R.drawable.i9);break;
            case 32 : imageView.setImageResource(R.drawable.i7);break;
            case 33 : imageView.setImageResource(R.drawable.i4);break;

        }

        }
}
