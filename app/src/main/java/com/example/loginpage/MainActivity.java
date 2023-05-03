package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email;
    EditText phone;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateAddress(email,phone);
//                validateMobileNumber(phone);

            }
        });
    }

    public boolean validateAddress(EditText email,EditText phone){
        String emailInput=email.getText().toString();
        String phoneInput=phone.getText().toString();
        if(!emailInput.isEmpty()&&Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()&&!phoneInput.isEmpty()&&Patterns.PHONE.matcher(phoneInput).matches()&&phoneInput.length()==10){
            Toast.makeText(this, "Correct email id", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Correct phone number", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(MainActivity.this,Activity.class);
            intent.putExtra("email",emailInput);
            intent.putExtra("phone",phoneInput);
            startActivity(intent);
        }else
            Toast.makeText(this, "Give correct address", Toast.LENGTH_SHORT).show();
        return false;
    }

}