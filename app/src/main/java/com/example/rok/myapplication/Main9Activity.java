package com.example.rok.myapplication;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.FrameLayout;
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
        b1 = (Button)findViewById(R.id.resb2);
        b2 = (Button)findViewById(R.id.resb1);
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
        final TextView t2,t3,t4,t5,t6,t7;
        t2 = (TextView)findViewById(R.id.rest1);
        t3 = (TextView)findViewById(R.id.rest2);
        t4 = (TextView)findViewById(R.id.rest3);
        t5 = (TextView)findViewById(R.id.rest4);
        t6 = (TextView)findViewById(R.id.rest5);
        final FrameLayout f1;
        t7 = (TextView)findViewById(R.id.rest6);
        final int[] count = {0};
        final Chronometer c112;
        c112 = (Chronometer)findViewById(R.id.resc1);
        f1 = (FrameLayout)findViewById(R.id.resf);
        s1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(s1.isChecked()){
                    c112.setVisibility(View.VISIBLE);
                    t7.setVisibility(View.VISIBLE);
                    f1.setVisibility(View.VISIBLE);
                    g1.setVisibility(View.INVISIBLE);
                    d1.setVisibility(View.VISIBLE);
                    d1.
                    t1.setVisibility(View.INVISIBLE);
                    l1.setVisibility(View.INVISIBLE);

                    c112.start();
                    b1.setVisibility(View.VISIBLE);
                    b1.setEnabled(false);
                    b2.setVisibility(View.VISIBLE);
                    final int year = d1.getYear();
                    final int month = d1.getMonth();
                    final int day = d1.getDayOfMonth();
                    final int hour = t1.getCurrentHour();
                    final int min = t1.getCurrentMinute();

                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            count[0]++;
                            if(count[0]==1){
                                b1.setEnabled(true);
                                b1.setVisibility(View.VISIBLE);
                                d1.setVisibility(View.INVISIBLE);
                                t1.setVisibility(View.VISIBLE);
                                l1.setVisibility(View.INVISIBLE);
                                g1.setVisibility(View.INVISIBLE);
                                b2.setEnabled(true);


                            }
                            else if(count[0]==2){
                                b2.setEnabled(true);

                                b1.setEnabled(true);
                                d1.setVisibility(View.INVISIBLE);
                                g1.setVisibility(View.INVISIBLE);
                                t1.setVisibility(View.INVISIBLE);
                                l1.setVisibility(View.VISIBLE);
                            }
                            else if(count[0]==3){
                                b1.setEnabled(true);
                                d1.setVisibility(View.INVISIBLE);
                                t1.setVisibility(View.INVISIBLE);
                                l1.setVisibility(View.INVISIBLE);
                                g1.setVisibility(View.VISIBLE);
                                b2.setEnabled(false);
                                t2.setText(year+"년"+month+"월"+day+"일");
                                t3.setText(hour+"시"+min+"분");
                                if(e1.getText().toString().matches("")){
                                    t4.setText("");
                                }
                                else if(e2.getText().toString().matches("")){
                                    t5.setText("");
                                }
                                else if(e3.getText().toString().matches("")){
                                    t6.setText("");
                                }
                                else {


                                    t4.setText(e1.getText() + "명");
                                    t5.setText(e2.getText() + "명");
                                    t6.setText(e3.getText() + "명");
                                }
                            }
                            b1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    count[0]--;
                                    if(count[0]==1){
                                        b1.setEnabled(true);
                                        b1.setVisibility(View.VISIBLE);
                                        d1.setVisibility(View.INVISIBLE);
                                        t1.setVisibility(View.VISIBLE);
                                        l1.setVisibility(View.INVISIBLE);
                                        g1.setVisibility(View.INVISIBLE);
                                        b2.setEnabled(true);

                                    }
                                    else if(count[0]==2){
                                        b2.setEnabled(true);

                                        b1.setEnabled(true);
                                        d1.setVisibility(View.INVISIBLE);
                                        g1.setVisibility(View.INVISIBLE);
                                        t1.setVisibility(View.INVISIBLE);
                                        l1.setVisibility(View.VISIBLE);

                                    }
                                    else if(count[0]==3){
                                        b1.setEnabled(true);
                                        d1.setVisibility(View.INVISIBLE);
                                        t1.setVisibility(View.INVISIBLE);
                                        l1.setVisibility(View.INVISIBLE);
                                        g1.setVisibility(View.VISIBLE);
                                        b2.setEnabled(false);
                                        t2.setText(year+"년"+month+"월"+day+"일");
                                        t3.setText(hour+"시"+min+"분");
                                        if(e1.getText().toString().matches("")){
                                            t4.setText("");
                                        }
                                        else if(e2.getText().toString().matches("")){
                                            t5.setText("");
                                        }
                                        else if(e3.getText().toString().matches("")){
                                            t6.setText("");
                                        }
                                        else {


                                            t4.setText(e1.getText() + "명");
                                            t5.setText(e2.getText() + "명");
                                            t6.setText(e3.getText() + "명");
                                        }
                                    }
                                    else if(count[0]==0){
                                        d1.setVisibility(View.VISIBLE);
                                        t1.setVisibility(View.INVISIBLE);
                                        l1.setVisibility(View.INVISIBLE);
                                        g1.setVisibility(View.INVISIBLE);
                                        b1.setEnabled(false);
                                        b2.setVisibility(View.VISIBLE);
                                    }
                                }
                            });



                }
            });


                }
                else{
                    c112.setBase(SystemClock.elapsedRealtime());
                    count[0]=0;
                    c112.setVisibility(View.INVISIBLE);
                    t7.setVisibility(View.INVISIBLE);
                    f1.setVisibility(View.INVISIBLE);
                    b1.setVisibility(View.INVISIBLE);
                    b2.setVisibility(View.INVISIBLE);
                    e1.setText(null);
                    e2.setText(null);
                    e3.setText(null);
                }
            }
        });
    }
}
