package com.example.tute03madjune

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GetStarted2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started2)

        // Find the Be a Tasker button
        val beTaskerButton: Button = findViewById(R.id.button2)

        // Set a click listener on the Be a Tasker button
        beTaskerButton.setOnClickListener {
            // Create an Intent to navigate to MainLogin activity
            val intent = Intent(this, MainLogin::class.java)

            // Add data to the intent
            intent.putExtra("data", "Tasker Login")

            // Start the MainLogin activity with the intent
            startActivity(intent)
        }

        // Find the Be a Customer button
        val beCustomerButton: Button = findViewById(R.id.button4)

        // Set a click listener on the Be a Customer button
        beCustomerButton.setOnClickListener {
            // Create an Intent to navigate to MainLogin activity
            val intent = Intent(this, MainLogin::class.java)

            // Add data to the intent
            intent.putExtra("data", "Customer Login")

            // Start the MainLogin activity with the intent
            startActivity(intent)
        }
    }
}

