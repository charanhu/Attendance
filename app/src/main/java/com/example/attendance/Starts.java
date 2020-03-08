package com.example.attendance;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Starts extends AppCompatActivity {
    Button Best,Avg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starts);
        Avg=findViewById(R.id.avg3);
        Best=findViewById(R.id.best2);

        Avg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Starts.this,Main2Activity.class));
            }
        });

        Best.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Starts.this,BestOf2.class));
            }
        });
    }
}
