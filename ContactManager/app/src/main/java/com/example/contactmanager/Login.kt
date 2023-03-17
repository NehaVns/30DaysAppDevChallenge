package com.example.contactmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.contactmanager.databinding.ActivityLoginBinding
import com.google.firebase.FirebaseApp
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Login : AppCompatActivity() {
    private lateinit var databaseReference: DatabaseReference
    private lateinit var binding: ActivityLoginBinding

    companion object{
        const val KEY1 = "com.androidtutorials.firebasedatabase.Login.email"
        const val KEY2 = "com.androidtutorials.firebasedatabase.Login.password"
        const val KEY3 = "com.androidtutorials.firebasedatabase.Login.name"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        FirebaseApp.initializeApp(this);
        binding.btnSignIn.setOnClickListener {
            val userName = binding.UserName.text.toString()
            if(userName.isNotEmpty()){
                readData(userName)
            }else{
                Toast.makeText(this, "Username can't be empty.", Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun readData(userNameForDatabase : String) {
        databaseReference = FirebaseDatabase.getInstance().getReference("Contacts")
        databaseReference.child(userNameForDatabase).get().addOnSuccessListener {
            if(it.exists()){
                val emails = it.child("email").value
                val names = it.child("name").value
                val passwords = it.child("password").value
                val intentWelcome = Intent(this, AddContact::class.java)
                intentWelcome.putExtra(KEY1, emails.toString())
                intentWelcome.putExtra(KEY2, passwords.toString())
                intentWelcome.putExtra(KEY3, names.toString())
                startActivity(intentWelcome)
            }else{
                Toast.makeText(this,"Username doesn't exist",Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener {
            Toast.makeText(this, "Connection Failed", Toast.LENGTH_SHORT).show()
        }

    }

}
