package com.androidtutorials.firebasedatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val email = intent.getStringExtra(Login.KEY1)
        val password = intent.getStringExtra(Login.KEY2)
        val name = intent.getStringExtra(Login.KEY3)

        val welcomeText = findViewById<TextView>(R.id.tvWelcome)
        val emailButton = findViewById<Button>(R.id.btnEmails)
        val passwordButton = findViewById<Button>(R.id.btnPasswords)

        welcomeText.text = "Welcome $name"
        emailButton.setOnClickListener{
            emailButton.text = email
        }
        passwordButton.setOnClickListener {
            passwordButton.text = password
        }
    }
}