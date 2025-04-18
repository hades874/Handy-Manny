package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login_activity extends AppCompatActivity {

    EditText Username, Password;
    Button btn;
    TextView reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Username = findViewById(R.id.username);
        Password = findViewById(R.id.password);
        btn = findViewById(R.id.button);
        reg = findViewById(R.id.reg);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String username = Username.getText().toString();
                String password = Password.getText().toString();
                if(username.length()==0 || password.length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please fill All details", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Login successfull", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(login_activity.this,home_activity.class));

                }
            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(login_activity.this,register_activity.class));
            }
        });

    }
}