package com.example.kotlini

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("UnsafeIntentLaunch")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtemail: EditText = findViewById(R.id.txtemail)
        val okay_button: Button = findViewById(R.id.okay_button)
        val NextButton: Button = findViewById(R.id.NextButton)


        okay_button.setOnClickListener {
            val email = txtemail.text.toString()
        }

        NextButton.setOnClickListener {
            val email = txtemail.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }

    }
}