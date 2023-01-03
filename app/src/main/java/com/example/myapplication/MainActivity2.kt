package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val continueButton = findViewById<TextView>(R.id.continueButton)

        continueButton.setOnClickListener{
        startActivity(Intent(this, MainActivity3::class.java))
        }
    }
}