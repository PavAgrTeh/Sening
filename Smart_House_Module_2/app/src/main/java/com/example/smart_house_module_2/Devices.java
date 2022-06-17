package com.example.smart_house_module_2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.smart_house_module_2.databinding.ActivityDevicesBinding;

public class Devices extends Activity {

    private ImageView mTextView;
    private ActivityDevicesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDevicesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.imageView;
    }
}