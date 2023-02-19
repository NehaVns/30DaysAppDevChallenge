package com.androidtutorials.firebasedatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class SignUp : AppCompatActivity() {

    lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signupButton = findViewById<Button>(R.id.btnSignup)
        val edUName = findViewById<TextInputEditText>(R.id.edUserName)
        val edUEmail = findViewById<TextInputEditText>(R.id.edMail)
        val edUPassword = findViewById<TextInputEditText>(R.id.edPassword)

        signupButton.setOnClickListener {
            val userName = edUName.text.toString()
            val userEmail = edUEmail.text.toString()
            val userPassword = edUPassword.text.toString()

            val user = User(userName, userEmail, userPassword)
            database = FirebaseDatabase.getInstance().getReference("Users")
            database.child(userName).setValue(user).addOnSuccessListener {
                edUName.text?.clear()
                edUEmail.text?.clear()
                edUPassword.text?.clear()

                Toast.makeText(this, "User Registered", Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this, "Registration Failed", Toast.LENGTH_SHORT).show()
            }

        }

    }
}