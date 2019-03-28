package com.example.day2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

   private EditText edtEmail;
   private EditText edtpassword;
   private Button btnsignin;
   private Button btnclear;
   private TextView lblmessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtEmail = findViewById(R.id.edtEmail);
        edtpassword = findViewById(R.id.edtpassword);
        lblmessage = findViewById(R.id.lblmessage);
        btnsignin = findViewById(R.id.btnsignin);
        btnclear = findViewById(R.id.btnclear);

        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String email = edtEmail.getText().toString();
                Toast.makeText(MainActivity.this,email,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
