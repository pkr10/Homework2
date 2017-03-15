package com.example.rok.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button b1,b2;
        final EditText e1,e2;
        b1 = (Button)findViewById(R.id.tb1);
        e1 = (EditText)findViewById(R.id.te);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = e1.getText().toString();
                double sub = Double.parseDouble(string);
                double result = calculatesub(sub);
                Toast.makeText(Main3Activity.this,"화씨 온도는 "+result,Toast.LENGTH_LONG).show();


            }
        });
        b2 = (Button)findViewById(R.id.tb2);
        e2 = (EditText)findViewById(R.id.te2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string2 = e2.getText().toString();
                double hwa = Double.parseDouble(string2);
                double result2 = calculatehwa(hwa);
                Toast.makeText(Main3Activity.this,"섭씨 온도는 "+result2,Toast.LENGTH_LONG).show();
            }
        });

    }
    public double calculatesub(double n){
        double result = (double)(n*1.8+32);
        return result;
    }
    public double calculatehwa(double n){
        double result = (double)((n-32)/1.8);
        return result;
    }


}
