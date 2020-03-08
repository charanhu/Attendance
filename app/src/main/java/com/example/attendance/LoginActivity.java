package com.example.attendance;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LoginActivity extends AppCompatActivity {

    EditText email, password;
    Button login;
    TextView txt_signup;
    DatabaseReference ref;
    FirebaseAuth auth;
    String str_usn, str_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);


        auth = FirebaseAuth.getInstance();


        ref = FirebaseDatabase.getInstance().getReference().child("UserData");

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ProgressDialog pd = new ProgressDialog(LoginActivity.this);
                pd.setMessage("Please wait...");
                pd.show();

                str_usn = email.getText().toString();
                str_password = password.getText().toString();

                if (TextUtils.isEmpty(str_usn) || TextUtils.isEmpty(str_password)) {
                    Toast.makeText(LoginActivity.this, "USN and Password cannot be empty!", Toast.LENGTH_SHORT).show();
                }
                else{
                    ref.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            String user_usn = dataSnapshot.child(str_usn).child("usn").getValue(String.class);
                            String password = dataSnapshot.child(str_usn).child("password").getValue(String.class);

                            if (user_usn.equalsIgnoreCase(str_usn)) {
                                if (password.equalsIgnoreCase(str_password)) {
                                    Intent intent = new Intent(LoginActivity.this, Home.class);
                                    intent.putExtra("fetchedusn",user_usn);
                                    startActivity(intent);
                                    finishAffinity();
                                }
                            }
                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {
                            Toast.makeText(LoginActivity.this, databaseError+"", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
    }
});
}
}
