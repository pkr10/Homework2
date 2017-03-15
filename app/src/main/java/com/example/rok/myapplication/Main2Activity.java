package com.example.rok.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button b1,b2;
        final EditText e1,e2;

        e1 = (EditText)findViewById(R.id.ae1);
        b1 = (Button)findViewById(R.id.ab1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = e1.getText().toString();
                int age = Integer.parseInt(string);
                int result = calculate(age);


                Toast.makeText(Main2Activity.this,"당신의 나이는 "+result, Toast.LENGTH_LONG).show();
            }
        });
        e2 = (EditText)findViewById(R.id.ae2);
        b2 = (Button)findViewById(R.id.ab2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string2 = e2.getText().toString();
                int year = Integer.parseInt(string2);
                int result2 = calculate(year);
                Toast.makeText(Main2Activity.this, "당신이 태어난 해는 "+result2, Toast.LENGTH_LONG).show();
            }
        });



    }
    public int calculate(int n){
        int year = 2017-n+1;
        return year;
    }

}
