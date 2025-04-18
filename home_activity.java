package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class home_activity extends AppCompatActivity {

    TextView services, packages, shops, orders, help, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        services = findViewById(R.id.textView);
        packages = findViewById(R.id.textView3);
        shops = findViewById(R.id.textView4);
        orders = findViewById(R.id.textView5);
        help = findViewById(R.id.textView6);
        back = findViewById(R.id.textView2);

        services.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(home_activity.this,service_activity.class));
            }
        });
        packages.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(home_activity.this,package_activity.class));
            }
        });
        shops.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(home_activity.this,electronics_activity.class));
            }
        });
        orders.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(home_activity.this, orders_activity.class));
            }
        });
        help.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(home_activity.this,help_activity.class));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(home_activity.this,login_activity.class));
            }
        });


    }
}