package com.example.smart_house_module_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.smart_house_module_2.databinding.ActivityMain2Binding;

public class MainActivity2 extends Activity {

    private TextView mTextView;
    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.button2;
    }

    public void onClick(View viev) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}