package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<EditText>(R.id.email).text
        val password = findViewById<EditText>(R.id.password).text
        val continuebutton = findViewById<TextView>(R.id.continuebutton)

        continuebutton.setOnClickListener{
            if(email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this,"CAN'T LOAD", Toast.LENGTH_SHORT).show()
            }else{
             startActivity(Intent(this, MainActivity2::class.java))
            }
        }
    }
}