package com.example.attendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class fetch extends AppCompatActivity {
    EditText editText;
    Button usn,name, fetch,MEM,MEA,CNM,CNA,DBMSM,DBMSA,ATCM,ATCA,AJAVAM,AJAVAA,AIM,AIA;
    Button myButton;
    DatabaseReference rootRef, demoRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch);
        editText = (EditText) findViewById(R.id.etValue);

        name = (Button) findViewById(R.id.btnname);
        usn = (Button) findViewById(R.id.btnusn);
        MEM =(Button) findViewById(R.id.mem);
        MEA = (Button) findViewById(R.id.mea);
        CNM = (Button) findViewById(R.id.cnm);
        CNA =(Button) findViewById(R.id.cna);
        DBMSM = (Button) findViewById(R.id.dbmsm);
        DBMSA = (Button) findViewById(R.id.dbmsa);
        ATCM =(Button) findViewById(R.id.atcm);
        ATCA = (Button) findViewById(R.id.atca);
        AJAVAM = (Button) findViewById(R.id.ajavam);
        AJAVAA =(Button) findViewById(R.id.ajavaa);
        AIM = (Button) findViewById(R.id.aim);
        AIA =(Button) findViewById(R.id.aia);







        //database reference pointing to root of database
        rootRef = FirebaseDatabase.getInstance().getReference();

        //database reference pointing to demo node
        demoRef = rootRef.child("MusicInMyMind");


                Intent intent = getIntent();
                String fetchedUsn = intent.getStringExtra("fetchedusn");
                demoRef.child(fetchedUsn).child("usn").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String value = dataSnapshot.getValue(String.class);
                        usn.setText(value);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }
                });

                demoRef.child(fetchedUsn).child("name").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String value = dataSnapshot.getValue(String.class);
                        name.setText(value);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }
                });



                demoRef.child(fetchedUsn).child("mem").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        long s = dataSnapshot.getValue(long.class);
                        String s1= String.valueOf(s);
                        MEM.setText(s1);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }
                });


                demoRef.child(fetchedUsn).child("mea").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        long s = dataSnapshot.getValue(long.class);
                        String s1= String.valueOf(s);
                        MEA.setText(s1);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }
                });


                demoRef.child(fetchedUsn).child("cnm").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        long s = dataSnapshot.getValue(long.class);
                        String s1= String.valueOf(s);
                        CNM.setText(s1);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }
                });


                demoRef.child(fetchedUsn).child("cna").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        long s = dataSnapshot.getValue(long.class);
                        String s1= String.valueOf(s);
                        CNA.setText(s1);
//                        String d = String.valueOf(s);
//                        Here y is a textView.
//                        y.setText(d);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }
                });

                demoRef.child(fetchedUsn).child("dbmsm").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        long s = dataSnapshot.getValue(long.class);
                        String s1= String.valueOf(s);
                        DBMSM.setText(s1);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }
                });


                demoRef.child(fetchedUsn).child("dbmsa").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        long s = dataSnapshot.getValue(long.class);
                        String s1= String.valueOf(s);
                        DBMSA.setText(s1);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }
                });

                demoRef.child(fetchedUsn).child("atcm").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        long s = dataSnapshot.getValue(long.class);
                        String s1= String.valueOf(s);
                        ATCM.setText(s1);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }
                });


                demoRef.child(fetchedUsn).child("atca").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        long s = dataSnapshot.getValue(long.class);
                        String s1= String.valueOf(s);
                        ATCA.setText(s1);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }
                });

                demoRef.child(fetchedUsn).child("ajavam").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        long s = dataSnapshot.getValue(long.class);
                        String s1= String.valueOf(s);
                        AJAVAM.setText(s1);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }
                });


                demoRef.child(fetchedUsn).child("ajavaa").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        long s = dataSnapshot.getValue(long.class);
                        String s1= String.valueOf(s);
                        AJAVAA.setText(s1);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }
                });

                demoRef.child(fetchedUsn).child("aim").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        long s = dataSnapshot.getValue(long.class);
                        String s1= String.valueOf(s);
                        AIM.setText(s1);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }
                });


                demoRef.child(fetchedUsn).child("aia").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        long s = dataSnapshot.getValue(long.class);
                        String s1= String.valueOf(s);
                        AIA.setText(s1);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }
                });
    }
}