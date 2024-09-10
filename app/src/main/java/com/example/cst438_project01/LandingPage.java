package com.example.cst438_project01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LandingPage extends AppCompatActivity {
    private TextView landingPageTextView;
    private Button practiceFavoriteButton;
    private Button favoritePageButton;
    private TextView levelSystemTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        // Initialize views
        landingPageTextView = findViewById(R.id.LandingPageTextView);
        practiceFavoriteButton = findViewById(R.id.PracticeFavoriteButton);
        favoritePageButton = findViewById(R.id.FavoritePageButton);
        levelSystemTextView = findViewById(R.id.textView2);

        // Set up click listeners
        practiceFavoriteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle practice button click
            }
        });

        favoritePageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle favorites button click
            }
        });

        // Example: Update the landing page text view
        landingPageTextView.setText("Welcome, User!");

        // Example: Update the level system text view
        levelSystemTextView.setText("Current Level: 1");
    }
}