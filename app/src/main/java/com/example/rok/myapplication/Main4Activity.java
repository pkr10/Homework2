package com.example.rok.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        final Button b1;
        final EditText e1,e2,e3;
        final TextView t1,t2;
        final CheckBox c1;
        b1 = (Button)findViewById(R.id.rb1);
        e1 = (EditText)findViewById(R.id.re1);
        e2 = (EditText)findViewById(R.id.re2);
        e3 = (EditText)findViewById(R.id.re3);
        c1 = (CheckBox)findViewById(R.id.rc1);
        t1 = (TextView)findViewById(R.id.rt6);
        t2 = (TextView)findViewById(R.id.rt7);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = e1.getText().toString();
                String string2 = e2.getText().toString();
                String string3 = e3.getText().toString();
                int pizza =  Integer.parseInt(string);
                int spa = Integer.parseInt(string2);
                int salad = Integer.parseInt(string3);
                int result = pizza*15000+spa*13000+salad*9000;
                int discount = result - result/10;
                int sum = pizza + spa + salad;
                final String string5 = String.valueOf(result);
                final String string7 = String.valueOf(discount);
                final String string6 = String.valueOf(sum);
                if(((CheckBox)v).isChecked()){
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            t1.setText(string7+"개");
                            t2.setText(string6+"원");
                        }
                    });
                }
                else{
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            t1.setText(string5+"개");
                            t2.setText(string6+"원");
                        }
                    });
                }

            }
        });

    }
}
