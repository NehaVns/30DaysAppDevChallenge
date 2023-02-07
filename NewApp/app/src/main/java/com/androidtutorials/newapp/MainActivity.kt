package com.androidtutorials.newapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark = findViewById<Button>(R.id.btnDark)
        val buttonLight = findViewById<Button>(R.id.btnLight)
        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)

        buttonLight.setOnClickListener {
            linearLayout.setBackgroundResource(R.color.yellow)
        }
        buttonDark.setOnClickListener {
            linearLayout.setBackgroundResource(R.color.black)
        }

    }
}