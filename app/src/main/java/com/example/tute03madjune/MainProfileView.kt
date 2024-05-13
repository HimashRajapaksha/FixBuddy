package com.example.tute03madjune

import android.content.Intent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainProfileView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_profile_view)

        // Find the edit button using findViewById
        val editButton: Button = findViewById(R.id.editbutton)

        // Set click listener for the edit button
        editButton.setOnClickListener {
            // Start the EditProfileView activity
            startActivity(Intent(this, EditProfileView::class.java))
        }
    }
}
