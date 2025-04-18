package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class register_activity extends AppCompatActivity {

    EditText Username, mail, Contact, Address, pass, confirm;
    Button btn;
    TextView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Username = findViewById(R.id.username);
        mail = findViewById(R.id.email);
        Contact = findViewById(R.id.Contact);
        Address = findViewById(R.id.address);
        pass = findViewById(R.id.password);
        confirm = findViewById(R.id.confirmpass);
        btn = findViewById(R.id.button);
        back = findViewById(R.id.backtohome);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String username = Username.getText().toString();
                String email = mail.getText().toString();
                String contact = Contact.getText().toString();
                String address = Address.getText().toString();
                String password = pass.getText().toString();
                String confirmpass = confirm.getText().toString();

                if(username.length()==0 || email.length()==0 || password.length()==0 || confirmpass.length() ==0)
                {
                    Toast.makeText(getApplicationContext(),"Please fill all the details", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(password.compareTo(confirmpass)==0)
                    {
                        Toast.makeText(getApplicationContext(),"Entered password doesn't match", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Successfully submitted", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(register_activity.this,login_activity.class));
            }
        });
    }
}