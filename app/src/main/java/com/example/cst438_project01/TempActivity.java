package com.example.cst438_project01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cst438_project01.databinding.ActivityTempBinding;

import java.util.Random;

public class TempActivity extends AppCompatActivity {
    private ActivityTempBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTempBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Button btn1 = binding.AddPractice;
        Button btn2 = binding.AddFavorite;
        Button btn3 = binding.Randomize;
        TextView randomWord = findViewById(R.id.RandomWord);
        randomWord.setText(String.valueOf(randomizeNumber()));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Add To Practice Database
                randomWord.setText(String.valueOf(randomizeNumber()));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Add To Favorite Database
                randomWord.setText(String.valueOf(randomizeNumber()));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                randomWord.setText(String.valueOf(randomizeNumber()));
            }
        });
    }
    int randomizeNumber(){
        //Change to use API
        Random random = new Random();
        int randomNumber = random.nextInt(10000);
        return randomNumber;
    }
}
