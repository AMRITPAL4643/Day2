package com.example.day2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
 private Button BtnADD;
 private Button BtnSUB;
 private Button BtnDIV;
 private Button BtnMUL;
 private TextView lblcalculator;
 private EditText no1;
 private EditText no2;
 private TextView lblOutput;
 private Button BtnClear;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //read the value passed  from previous activity(main activity)
        Bundle mbundle = getIntent().getExtras();
        if(mbundle != null)//verify
        {
            if(mbundle.containsKey("name"))//verify
            {
                String name = mbundle.getString("name");
//                Toast.makeText(this,name,Toast.LENGTH_LONG).show();
            }
        }

        BtnADD = findViewById(R.id.btnADD);
        BtnSUB = findViewById(R.id.btnSUB);
        BtnDIV = findViewById(R.id.btnDIV);
        BtnMUL = findViewById(R.id.btnMUL);
        lblOutput = findViewById(R.id.lbloutput);
        BtnClear = findViewById(R.id.btnclear);
        no1 = findViewById(R.id.EnterNumber1);
        no2 = findViewById(R.id.EnterNumber2);

        BtnADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Double a =Double.parseDouble (no1.getText().toString());
               Double b = Double.parseDouble(no2.getText().toString());
               lblOutput.setText(""+(a+b));

            }
        });

        BtnSUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double c = Double.parseDouble(no1.getText().toString());
                Double d = Double.parseDouble(no2.getText().toString());
                lblOutput.setText(""+(c-d));
            }
        });

        BtnDIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double e = Double.parseDouble(no1.getText().toString());
                Double f = Double.parseDouble(no2.getText().toString());
                lblOutput.setText(""+(e/f));
            }
        });

        BtnMUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double g = Double.parseDouble(no1.getText().toString());
                Double h = Double.parseDouble(no2.getText().toString());
                lblOutput.setText(""+(g*h));
            }
        });
        BtnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1.getText().clear();
                no2.getText().clear();
            }
        });


    }
}
