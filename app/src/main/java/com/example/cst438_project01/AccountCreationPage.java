package com.example.cst438_project01;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AccountCreationPage extends AppCompatActivity {

    private EditText createUsername;
    private EditText createPassword;
    private Button submitAccountButton;
    private Button backAccountCreateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_creation_page);

        // Initialize UI elements
        createUsername = findViewById(R.id.createusername);
        createPassword = findViewById(R.id.createpassword);
        submitAccountButton = findViewById(R.id.submitaccountbutton);
        backAccountCreateButton = findViewById(R.id.backaccountcreatebutton);

        // Set up submit button click listener
        submitAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = createUsername.getText().toString().trim();
                String password = createPassword.getText().toString().trim();

                if (isValidInput(username, password)) {
                    // TODO: Implement account creation logic here
                    Toast.makeText(AccountCreationPage.this, "Account created successfully!", Toast.LENGTH_SHORT).show();
                    startActivity(LandingPage.intentFactory(AccountCreationPage.this));
                } else {
                    Toast.makeText(AccountCreationPage.this, "Please enter a valid username and password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        backAccountCreateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private boolean isValidInput(String username, String password) {
        // TODO: Implement proper validation logic
        return !username.isEmpty() && !password.isEmpty();
    }

    // Intent factory method for AccountCreationPage
    public static Intent intentFactory(Context context) {
        Intent intent = new Intent(context, AccountCreationPage.class);
        return intent;
    }
}