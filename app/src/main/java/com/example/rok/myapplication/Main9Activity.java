package com.example.rok.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Date;

public class Main9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        final Switch s1;
        final Button b1,b2;
        b1 = (Button)findViewById(R.id.resb1);
        b2 = (Button)findViewById(R.id.resb2);
        s1 = (Switch)findViewById(R.id.ress1);
        final DatePicker d1;
        final TimePicker t1;
        t1 = (TimePicker)findViewById(R.id.restp1);
        d1 = (DatePicker)findViewById(R.id.resd1);
        final LinearLayout l1;
        l1 = (LinearLayout)findViewById(R.id.resl);
        final EditText e1,e2,e3;
        e1 = (EditText)findViewById(R.id.rese1);
        e2 = (EditText)findViewById(R.id.rese2);
        e3 = (EditText)findViewById(R.id.rese3);
        final GridLayout g1;
        g1 = (GridLayout)findViewById(R.id.resg);
        final TextView t2,t3,t4,t5,t6;
        t2 = (TextView)findViewById(R.id.rest1);
        t3 = (TextView)findViewById(R.id.rest2);
        t4 = (TextView)findViewById(R.id.rest3);
        t5 = (TextView)findViewById(R.id.rest4);
        t6 = (TextView)findViewById(R.id.rest5);
        s1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(s1.isChecked()){
                    d1.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    final int year = d1.getYear();
                    final int day = d1.getMonth();
                    final int month = d1.getDayOfMonth();
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            d1.setVisibility(View.INVISIBLE);
                            t1.setVisibility(View.VISIBLE);
                            final int hour = t1.getHour();
                            final int min = t1.getMinute();
                            b2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    l1.setVisibility(View.VISIBLE);
                                    t1.setVisibility(View.INVISIBLE);
                                    final String string1 = e1.getText().toString();
                                    final String string2 = e2.getText().toString();
                                    final String string3 = e3.getText().toString();
                                    b2.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            l1.setVisibility(View.INVISIBLE);
                                            g1.setVisibility(View.VISIBLE);
                                            t2.setText(year+"년"+month+"월"+day+"일");
                                            t3.setText(hour+"시"+min+"분");
                                            t4.setText(string1+"명");
                                            t5.setText(string2+"명");
                                            t6.setText(string3+"명");

                                        }
                                    });
                                }
                            });

                        }
                    });
                }
            }
        });
    }
}
