package com.androidtutorials.firebasedatabase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Login : AppCompatActivity() {
    lateinit var databaseReference: DatabaseReference
    companion object{
        const val KEY1 = "com.androidtutorials.firebasedatabase.Login.email"
        const val KEY2 = "com.androidtutorials.firebasedatabase.Login.password"
        const val KEY3 = "com.androidtutorials.firebasedatabase.Login.name"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signInButton = findViewById<Button>(R.id.btnSignIn)
        val userNameDatabase = findViewById<TextInputEditText>(R.id.UserName)

        signInButton.setOnClickListener{

            val userNameString = userNameDatabase.text.toString()

            if(userNameString.isNotEmpty()){
                readData(userNameString)
            }else{
                Toast.makeText(this, "Username can't be empty.", Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun readData(userNameForDatabase : String){
        databaseReference = FirebaseDatabase.getInstance().getReference("Users")
        databaseReference.child(userNameForDatabase).get().addOnSuccessListener {
            if(it.exists()){
                val emails = it.child("email").value
                val names = it.child("name").value
                val passwords = it.child("password").value
                val intentWelcome = Intent(this, Home::class.java)
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