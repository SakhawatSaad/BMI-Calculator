package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bmicalculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener( v -> {




            String heightstr=binding.heightEdt.getText().toString();
            String weightstr=binding.WeightEdt.getText().toString();

            double height = Double.parseDouble(heightstr);
            double weight = Double.parseDouble(weightstr);

            double bmiresult = weight/ (height * height);

            binding.resultTv.setText("your bmi is "+bmiresult);




        });


    }
}