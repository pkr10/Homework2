package com.example.rok.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button b1,b2,b3,b4;
        final EditText e1,e2;
        b1 = (Button)findViewById(R.id.cb1);
        e1 =(EditText)findViewById(R.id.ce1);
        e2 = (EditText)findViewById(R.id.ce2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = e1.getText().toString();
                String string2 = e2.getText().toString();
                if(string.matches("")||string2.matches("")) {
                    Toast.makeText(Main5Activity.this,"숫자를 입력하세요",Toast.LENGTH_LONG).show();
                    if(string.matches("")){
                        e1.requestFocus();
                    }
                    else{
                        e2.requestFocus();
                    }


                }

                else {
                    int num1 = Integer.parseInt(string);
                    int num2 = Integer.parseInt(string2);
                    int sum = num1 + num2;
                    Toast.makeText(Main5Activity.this, "정답은 " + sum, Toast.LENGTH_LONG).show();
                }

            }
        });
        b2 =(Button)findViewById(R.id.cb2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string3 = e1.getText().toString();
                String string4 = e2.getText().toString();
                if(string3.matches("")||string4.matches("")){
                    Toast.makeText(Main5Activity.this,"숫자를 입력하세요",Toast.LENGTH_LONG).show();
                    if(string3.matches("")){
                        e1.requestFocus();
                    }
                    else{
                        e2.requestFocus();
                    }

                }
                else{
                    int num3 = Integer.parseInt(string3);
                    int num4 = Integer.parseInt(string4);
                    int sum  = num3-num4;

                    Toast.makeText(Main5Activity.this,"정답은 "+sum,Toast.LENGTH_LONG).show();
                }
            }
        });
        b3 = (Button)findViewById(R.id.cb3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string5 = e1.getText().toString();
                String string6 = e2.getText().toString();
                if(string5.matches("")||string6.matches("")){
                    Toast.makeText(Main5Activity.this,"숫자를 입력하세요",Toast.LENGTH_LONG).show();
                    if(string5.matches("")){
                        e1.requestFocus();
                    }
                    else{
                        e2.requestFocus();
                    }

                }
                else{
                    int num5 = Integer.parseInt(string5);
                    int num6 = Integer.parseInt(string6);
                    int sum = num5*num6;
                    Toast.makeText(Main5Activity.this,"정답은 "+sum,Toast.LENGTH_LONG).show();
                }

            }
        });
        b4 = (Button)findViewById(R.id.cb4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string7 = e1.getText().toString();
                String string8 =e2.getText().toString();
                if(string7.matches("")||string8.matches("")){
                    Toast.makeText(Main5Activity.this,"숫자를 입력하세요",Toast.LENGTH_LONG).show();
                    if(string7.matches("")){
                        e1.requestFocus();
                    }
                    else{
                        e2.requestFocus();
                    }

                }
                else{
                    int num7 = Integer.parseInt(string7);
                    int num8 = Integer.parseInt(string8);
                    double sum  = num7/num8;
                    int sum2 = (int)sum;
                    Toast.makeText(Main5Activity.this,"정답은 "+sum2,Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}
