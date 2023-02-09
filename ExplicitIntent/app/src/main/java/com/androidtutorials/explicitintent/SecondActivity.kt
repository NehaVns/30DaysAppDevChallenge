package com.androidtutorials.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val buttonBack = findViewById<Button>(R.id.button2)
        buttonBack.setOnClickListener {
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)

        }
    }
}