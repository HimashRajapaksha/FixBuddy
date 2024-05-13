package com.example.tute03madjune

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainSignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_sign_up)

        val signUpButton2 = findViewById<Button>(R.id.signupbutton)
        signUpButton2.setOnClickListener {
            val Intent = Intent(this, MainLogin::class.java)
            startActivity(Intent)
        }
    }
}