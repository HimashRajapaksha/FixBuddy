package com.example.tute03madjune

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.getstarted_activity)

        val startBtn: Button = findViewById(R.id.startBtn)

        // Set click listener on the button
        startBtn.setOnClickListener {
            // Create an intent to navigate to the second activity
            val intent = Intent(this, GetStarted2Activity::class.java)

            // Add data to the intent (if needed)
            intent.putExtra("key", "value") // Replace "key" and "value" with your actual data

            // Start the second activity
            startActivity(intent)
        }
    }
}


