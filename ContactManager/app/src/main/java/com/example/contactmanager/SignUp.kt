package com.example.contactmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.contactmanager.databinding.ActivitySignUpBinding
import com.google.firebase.FirebaseApp
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class SignUp : AppCompatActivity() {
    private lateinit var database : DatabaseReference
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        FirebaseApp.initializeApp(this);
        binding.btnSignup.setOnClickListener {
            val userName = binding.edUserName.text.toString()
            val userEmail = binding.edMail.text.toString()
            val userPassword = binding.edPassword.text.toString()

            val contact = Contact(userName,userEmail,userPassword)
            database = FirebaseDatabase.getInstance().getReference("Contacts")
            database.child(userName).setValue(contact).addOnSuccessListener {
                binding.edUserName.text?.clear()
                binding.edMail.text?.clear()
                binding.edPassword.text?.clear()

                Toast.makeText(this, "User Registered", Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this, "Registration Failed", Toast.LENGTH_SHORT).show()
            }
        }
        binding.btnSignIn.setOnClickListener {
            val intentLogin = Intent(this, Login::class.java)
            startActivity(intentLogin)

        }

    }
}