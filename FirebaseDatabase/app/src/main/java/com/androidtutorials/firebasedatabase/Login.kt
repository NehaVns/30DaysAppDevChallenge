package com.androidtutorials.firebasedatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference

class Login : AppCompatActivity() {
    lateinit var databaseReference: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val signInButton = findViewById<Button>(R.id.btnSignIn)
        val userNameDatabase = findViewById<TextInputEditText>(R.id.UserName)

        signInButton.setOnClickListener{
            //take reference till node "Users".
            val userNameString = userNameDatabase.text.toString()
            if(userNameString.isNotEmpty()){
                readData(userNameString)
            }else{
                Toast.makeText(this, "Username can't be empty.", Toast.LENGTH_SHORT).show()
            }

        }

    }
    private fun readData(userNameForDatabase : String){

    }

}