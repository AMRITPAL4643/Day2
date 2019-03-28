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
   String error;

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
                String pass = edtpassword.getText().toString();

                if(email.equals("amrit@.com") && pass.equals("Amrit"))
                {
                    error = "login success";
                }else
                {
                    error = "try again";
                }
                lblmessage.setText(error.toString());
            }
        });

    }
}
