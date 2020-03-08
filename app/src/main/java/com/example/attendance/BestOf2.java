package com.example.attendance;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BestOf2 extends AppCompatActivity {
    private TextView IA1b,IA2b,IA3b,IA4b;
    private Button Resultb,Clearb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_of2);
        IA1b=findViewById(R.id.ia1b);
        IA2b=findViewById(R.id.ia2b);
        IA3b=findViewById(R.id.ia3b);
        IA4b=findViewById(R.id.ia4b);
        Resultb=findViewById(R.id.resultb);
        Clearb=findViewById(R.id.clearb);

        Resultb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    double num1 = Double.parseDouble((IA1b.getText().toString()));
                    double num2 = Double.parseDouble((IA2b.getText().toString()));
                    double num3 = Double.parseDouble((IA3b.getText().toString()));
                    double p = large1(num1, num2, num3);
                    double q = large2(num1, num2, num3);
                    double r = ((p + q) / 2);
                    IA4b.setText(Double.toString(r));

                }

        });

        Clearb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IA1b.setText("");
                IA2b.setText("");
                IA3b.setText("");
                IA4b.setText("");
            }
        });



    }
    private double large1(double n1,double n2,double n3){
        if( n1>=n2 && n1>=n3 ) {
            return n1;
        }

        else if( n2>=n1 && n2>=n3 ) {
            return n2;
        }
       else if( n3>=n1 && n3>=n2 ) {
            return n3;
        }
        else
            return 0;

    }

    private double large2(double a,double b,double c){
        if(a >= b && a >= c)
        {
            if(b >= c)
            {
           return b;
            }
            else
            {
                return c;
            }
        }
        else if(b >= a && b >= c)
        {
            if(a >= c)
            {
                return a;
            }
            else
            {
              return c;
            }
        }


        else
        {
            if(a >= b)
            {
                return a;
            }
            else
            {
                return b;
            }
        }

        }

    }




