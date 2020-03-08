package com.example.attendance;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {
    private TextView IA1,IA2,IA3,IA4;
    private Button Result,Clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        IA1=findViewById(R.id.ia1);
        IA2=findViewById(R.id.ia2);
        IA3=findViewById(R.id.ia3);
        IA4=findViewById(R.id.ia4);
        Result=findViewById(R.id.result);
        Clear=findViewById(R.id.clear);

        Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double  num1=Double.parseDouble((IA1.getText().toString()));
                double  num2=Double.parseDouble((IA2.getText().toString()));
                double  num3=Double.parseDouble((IA3.getText().toString()));
                double  avg=((num1+num2+num3)/3);
                IA4.setText(Double.toString(avg));
            }
        });

        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IA1.setText("");
                IA2.setText("");
                IA3.setText("");
                IA4.setText("");
            }
        });
    }
}

