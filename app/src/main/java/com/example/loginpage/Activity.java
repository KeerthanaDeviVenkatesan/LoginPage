package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity extends AppCompatActivity {
    TextView textView;
    TextView email1;
    TextView phone1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);
        textView=findViewById(R.id.textView);
        email1=findViewById(R.id.email1);
        phone1=findViewById(R.id.phone1);
       String emailInput=getIntent().getStringExtra("email");
       String phoneInput=getIntent().getStringExtra("phone");
       email1.setText(emailInput);
       phone1.setText(phoneInput);



    }
}