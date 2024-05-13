package com.example.tute03madjune

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView // Ensure this import is present

class MainHomeForCustomer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_home_for_customer)

        // Set click listener for imageView12
        val imageView12 = findViewById<ImageView>(R.id.imageView12)
        imageView12.setOnClickListener {
            // Data to pass to MainProfileView
            val dataToPass = "Data to pass to MainProfileView"

            // Create an intent to start MainProfileView activity
            val intent = Intent(this, MainProfileView::class.java)

            // Add the data to the intent
            intent.putExtra("data", dataToPass)

            // Start MainProfileView activity
            startActivity(intent)
        }
    }
}
