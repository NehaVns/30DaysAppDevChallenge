package com.androidtutorials.firebasedatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signupButton = findViewById<Button>(R.id.btnSignup)
        val edU_Name = findViewById<EditText>(R.id.edUserName)
        val edU_email = findViewById<EditText>(R.id.edMail)
        val edU_password = findViewById<EditText>(R.id.edPassword)

        signupButton.setOnClickListener{
            val userName = edU_Name.text
            val user_email = edU_email.text
            val user_password = edU_password.text
        }

    }
}