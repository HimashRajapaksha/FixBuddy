package com.example.tute03madjune

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.example.tute03madjune.R

class MainLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)

        // Find the login button using findViewById
        val loginButton = findViewById<Button>(R.id.loginbutton)

        // Set click listener for login button
        loginButton.setOnClickListener {
            // Data to pass to MainHomeForCustomer
            val dataToPass = "Data to pass to MainHomeForCustomer"

            // Create an intent to start MainHomeForCustomer activity
            val intent = Intent(this, MainHomeForCustomer::class.java)

            // Add the data to the intent
            intent.putExtra("data", dataToPass)

            // Start MainHomeForCustomer activity
            startActivity(intent)
        }

        val signUpButton = findViewById<Button>(R.id.buttonsignuplogin)
        signUpButton.setOnClickListener {
            val Intent = Intent(this, MainSignUp::class.java)
            startActivity(Intent)
        }
    }
}
