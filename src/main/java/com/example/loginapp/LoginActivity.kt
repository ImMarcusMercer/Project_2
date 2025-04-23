package com.example.loginapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val userButton = findViewById<Button>(R.id.userLoginButton)
        val landlordButton = findViewById<Button>(R.id.landlordLoginButton)
        val settingsButton = findViewById<ImageButton>(R.id.settingsButton)

        userButton.setOnClickListener {
            Toast.makeText(this, "User Login Clicked", Toast.LENGTH_SHORT).show()
            // Navigate to User Login Activity
        }

        landlordButton.setOnClickListener {
            Toast.makeText(this, "Landlord Login Clicked", Toast.LENGTH_SHORT).show()
            // Navigate to Landlord Login Activity
        }

        settingsButton.setOnClickListener {
            Toast.makeText(this, "Settings Clicked", Toast.LENGTH_SHORT).show()
            // Open Settings or Dialog
        }
    }
}
