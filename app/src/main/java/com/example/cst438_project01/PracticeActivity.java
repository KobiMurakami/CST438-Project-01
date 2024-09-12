package com.example.cst438_project01;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.cst438_project01.databinding.ActivityPracticeBinding;

public class PracticeActivity extends AppCompatActivity {
    private ActivityPracticeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPracticeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Button btn1 = binding.back;
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PracticeActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
    public static Intent intentFactory(Context context) {
        return new Intent(context, PracticeActivity.class);
    }
}
