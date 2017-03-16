package com.example.rok.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        final EditText e1,e2,e3;
        final TextView t1,t2;
        Button b1,b2;
        t1 = (TextView)findViewById(R.id.st1);
        t2 = (TextView)findViewById(R.id.st2);
        e1 = (EditText)findViewById(R.id.se1);
        e2 = (EditText)findViewById(R.id.se2);
        e3 = (EditText)findViewById(R.id.se3);
        b1 = (Button)findViewById(R.id.sb1);

        final ImageView i;

        i = (ImageView)findViewById(R.id.imageView);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1 = e1.getText().toString();
                String string2 = e2.getText().toString();
                String string3 = e3.getText().toString();
                int kor = Integer.parseInt(string1);
                int math = Integer.parseInt(string2);
                int eng = Integer.parseInt(string3);
                final int sum  = kor+math+eng;
                final double ave = (double)(sum/3);

                t1.setText(sum+"점");
                t2.setText((int) ave+"점");


                if(ave >90){
                    i.setImageResource(R.drawable.a);
                }
                else if(ave>80){
                    i.setImageResource(R.drawable.b);
                }
                else if(ave>70){
                    i.setImageResource(R.drawable.c);

                }
                else if(ave>60){
                    i.setImageResource(R.drawable.d);
                }
                else{
                    i.setImageResource(R.drawable.f);

                }

            }
        });

        b2 = (Button)findViewById(R.id.sb2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("0");
                t2.setText("0");
                Toast.makeText(Main8Activity.this, "초기화되었습니다", Toast.LENGTH_SHORT).show();
                i.setImageResource(0);


            }
        });

    }
}
