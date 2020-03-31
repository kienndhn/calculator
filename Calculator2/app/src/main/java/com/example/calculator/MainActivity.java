package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Typeface;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, add, div, mul, sub, equal, clear, bs, c, ce;
    TextView ed, tv;

    int value1, value2;

    boolean mAdd, mDiv, mSub, mMul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = findViewById(R.id.btn_0);
        b1 = findViewById(R.id.btn_1);
        b2 = findViewById(R.id.btn_2);
        b3 = findViewById(R.id.btn_3);
        b4 = findViewById(R.id.btn_4);
        b5 = findViewById(R.id.btn_5);
        b6 = findViewById(R.id.btn_6);
        b7 = findViewById(R.id.btn_7);
        b8 = findViewById(R.id.btn_8);
        b9 = findViewById(R.id.btn_9);
        add = findViewById(R.id.btn_add);
        sub = findViewById(R.id.btn_sub);
        mul = findViewById(R.id.btn_mul);
        div = findViewById(R.id.btn_div);
        equal = findViewById(R.id.btn_equal);
        bs = findViewById(R.id.btn_bs);
        ce = findViewById(R.id.btn_ec);
        c = findViewById(R.id.btn_c);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/ds_digi.TTF");

        tv = findViewById(R.id.text_view1);
        ed = findViewById(R.id.text_view2);

        ed.setTypeface(typeface);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed.setText(ed.getText() + "0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed.setText(ed.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed.setText(ed.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed.setText(ed.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed.setText(ed.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed.setText(ed.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed.setText(ed.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed.setText(ed.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed.setText(ed.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed.setText(ed.getText() + "9");
            }
        });

        add.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(ed == null){
                    ed.setText("");
                }
                else if(mSub == true){
                    mSub = false;
                    mAdd = true;
                    tv.setText(value1 + " + " +"");
                }
                else if(mMul == true){
                    mMul = false;
                    mAdd = true;
                    tv.setText(value1 + " + " +"");
                }
                else if(mDiv == true){
                    mDiv = false;
                    mAdd = true;
                    tv.setText(value1 + " + " +"");
                }
                else if(mAdd == true){}

                else {
                    value1 = Integer.parseInt(ed.getText() + "");
                    mAdd = true;
                    tv.setText(Integer.toString(value1) + " + " + "");
                    ed.setText(null);
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(ed == null){
                    ed.setText("-");
                }
                else if(mAdd == true){
                    mAdd = false;
                    mSub = true;
                    tv.setText(value1 + " - " + "");
                }
                else if(mDiv == true){
                    mDiv = false;
                    mSub = true;
                    tv.setText(value1 + " - " + "");
                }
                else if(mMul == true){
                    mMul = false;
                    mSub = true;
                    tv.setText(value1 + " - " + "");
                }
                else if(mSub == true){}

                else {
                    value1 = Integer.parseInt(ed.getText() + "");
                    mSub = true;
                    tv.setText(Integer.toString(value1) + " - " + "");
                    ed.setText(null);
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(ed == null) value1 = 0;

                else if(mAdd == true){
                    mAdd = false;
                    mMul = true;
                    tv.setText(value1 + " * " + "");
                }
                else if(mSub == true){
                    mSub = false;
                    mMul = true;
                    tv.setText(value1 + " * " + "");
                }
                else if(mDiv == true){
                    mDiv = false;
                    mMul = true;
                    tv.setText(value1 + " * " + "");
                }
                else if(mMul == true){}
                else {
                    value1 = Integer.parseInt(ed.getText() +"");
                    mMul = true;
                    tv.setText(Integer.toString(value1) + " * " + "");
                    ed.setText(null);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if (ed == null) value1 = 0;
                else if(mAdd == true){
                    mAdd = false;
                    mDiv = true;
                    tv.setText(value1 + " / " + "");
                }
                else if(mSub == true){
                    mSub = false;
                    mDiv = true;
                    tv.setText(value1 + " / " + "");
                }
                else if(mMul == true){
                    mMul = false;
                    mDiv = true;
                    tv.setText(value1 + " / " + "");
                }
                else if (mDiv == true) {}
                else {
                    value1 = Integer.parseInt(ed.getText() + "");
                    mDiv = true;
                    tv.setText(Integer.toString(value1) + " / " + "");
                    ed.setText(null);
                }
            }
        });


        equal.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                value2 = Integer.parseInt(ed.getText() +"");

                tv.setText(tv.getText() + Integer.toString(value2) + "=" +"");

                if(mAdd == true){
                    ed.setText(value1 + value2 +"");
                    mAdd = false;
                }
                if(mSub == true){
                    ed.setText(value1 - value2 +"");
                    mSub = false;
                }
                if(mMul == true){
                    ed.setText(value1 * value2 +"");
                    mMul = false;
                }
                if(mDiv == true){
                    if(value2 == 0) {
                        ed.setText("error");
                        value1 = 0;
                        mDiv = false;
                    }
                    else ed.setText(value1 / value2 +"");
                    mDiv = false;
                }
                if(ed.getText().equals("error")){
                    value1 = 0;
                    ed.setText("");
                }
                else
                    value1 = Integer.parseInt(ed.getText() + "");
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText("");
                tv.setText("");
                value1 = 0;
                value2 = 0;
            }
        });

        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int t = Integer.parseInt(ed.getText() + "");
                ed.setText(Integer.toString(t / 10));
            }
        });

        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText("0");
            }
        });
    }
}
