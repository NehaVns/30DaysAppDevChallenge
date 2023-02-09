package com.androidtutorials.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn1)
        button.setOnClickListener {
            intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}