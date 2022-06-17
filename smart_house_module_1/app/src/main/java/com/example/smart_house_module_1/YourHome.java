package com.example.smart_house_module_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class YourHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_home);
    }

    public void onClick(View viev) {
        Intent intent = new Intent(this, KitchenLIght.class);
        startActivity(intent);
    }
    public void onClick2(View viev) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}