package com.example.cst438_project01;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.cst438_project01.databinding.ActivityFavoriteBinding;

public class FavoriteActivity extends AppCompatActivity {
    private ActivityFavoriteBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFavoriteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Button btn1 = binding.back;
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FavoriteActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
    // Intent factory method for FavoriteActivity
    public static Intent intentFactory(Context context) {
        return new Intent(context, FavoriteActivity.class);
    }
}
