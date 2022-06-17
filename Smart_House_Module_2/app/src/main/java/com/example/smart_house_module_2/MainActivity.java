package com.example.smart_house_module_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.smart_house_module_2.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private ImageButton mTextView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.imageButton2;
    }
    public void onClick(View viev) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}