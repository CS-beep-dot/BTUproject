package com.example.kotlini

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //mails abrunebs
        val txtemail: TextView = findViewById(R.id.txtemail)
        val email = intent.getStringExtra("user_email")
        txtemail.text = email
        val welcomeBackTxt: TextView = findViewById(R.id.welcomeBackTxt)
        welcomeBackTxt.text = "Welcome back \n$email"
        //itvlis
        val idnumber: TextView = findViewById(R.id.idnumber)
        val clickbutton : Button = findViewById(R.id.clickbutton)

        var counter = 1
        idnumber.text = counter.toString()

        clickbutton.setOnClickListener{
            counter *= 2
            idnumber.text = counter.toString()
        }


    }

}