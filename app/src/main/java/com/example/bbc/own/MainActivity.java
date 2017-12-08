package com.example.bbc.own;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final CheckBox c1 = (CheckBox) findViewById(R.id.cb1);
        final CheckBox c2 = (CheckBox) findViewById(R.id.cb2);
        final CheckBox c3 = (CheckBox) findViewById(R.id.cb3);
        final CheckBox c4 = (CheckBox) findViewById(R.id.cb4);
        final CheckBox c5 = (CheckBox) findViewById(R.id.cb5);
        final CheckBox c6 = (CheckBox) findViewById(R.id.cb6);
        final CheckBox c7 = (CheckBox) findViewById(R.id.cb7);
        final CheckBox c8 = (CheckBox) findViewById(R.id.cb8);
        final CheckBox c9 = (CheckBox) findViewById(R.id.cb9);
        final CheckBox c10 = (CheckBox) findViewById(R.id.cb10);
        final CheckBox c11 = (CheckBox) findViewById(R.id.cb11);
        final CheckBox c12 = (CheckBox) findViewById(R.id.cb12);
        final CheckBox c13 = (CheckBox) findViewById(R.id.cb13);
        final CheckBox c14 = (CheckBox) findViewById(R.id.cb14);
        final CheckBox c15 = (CheckBox) findViewById(R.id.cb15);

        Button b = (Button) findViewById(R.id.Submit);
        final TextView tv = (TextView) findViewById(R.id.textView);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String result = "";
                if(c1.isChecked() == true) result += c1.getText().toString();
                if(c2.isChecked() == true) result += c2.getText().toString();
                if(c3.isChecked() == true) result += c3.getText().toString();
                if(c4.isChecked() == true) result += c4.getText().toString();
                if(c5.isChecked() == true) result += c4.getText().toString();
                if(c6.isChecked() == true) result += c4.getText().toString();
                if(c7.isChecked() == true) result += c4.getText().toString();
                if(c8.isChecked() == true) result += c4.getText().toString();
                if(c9.isChecked() == true) result += c4.getText().toString();
                if(c10.isChecked() == true) result += c4.getText().toString();
                if(c11.isChecked() == true) result += c4.getText().toString();
                if(c12.isChecked() == true) result += c4.getText().toString();
                if(c13.isChecked() == true) result += c4.getText().toString();
                if(c14.isChecked() == true) result += c4.getText().toString();
                if(c15.isChecked() == true) result += c4.getText().toString();

                tv.setText("선택결과:" + result);
            }
        });


    }
}