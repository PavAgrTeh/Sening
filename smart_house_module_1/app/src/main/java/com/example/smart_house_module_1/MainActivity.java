package com.example.smart_house_module_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View viev) {
        Intent intent = new Intent(this, NewResident.class);
        startActivity(intent);
    }
        public void onClick2(View viev) {
            Intent intent = new Intent(this, YourHome.class);
            startActivity(intent);
        }
}
