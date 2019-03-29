package com.example.day2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

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
                Toast.makeText(this,name,Toast.LENGTH_LONG).show();
            }
        }
    }
}
