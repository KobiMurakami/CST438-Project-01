package com.example.cst438_project01;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LandingPage extends AppCompatActivity {

    private TextView tvWelcome;
    private TextView tvLevelSystem;
    private TextView tvRandomWord;
    private Button btnFavorite;
    private Button btnPractice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        // Initialize views
        tvWelcome = findViewById(R.id.tv_welcome);
        tvLevelSystem = findViewById(R.id.tv_level_system);
        tvRandomWord = findViewById(R.id.tv_random_word);
        btnFavorite = findViewById(R.id.btn_favorite);
        btnPractice = findViewById(R.id.btn_practice);

        // Set up any initial text or listeners
        tvWelcome.setText("Welcome User"); // You can customize this with the actual user's name
        tvLevelSystem.setText("Level System Place holder");
        tvRandomWord.setText("Random Word API holder");

        btnFavorite.setOnClickListener(v -> {
            // Handle favorite button click
        });

        btnPractice.setOnClickListener(v -> {
            // Handle practice button click
        });
    }
}