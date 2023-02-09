package com.androidtutorials.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webButton = findViewById<Button>(R.id.btnWeb)
        val cameraButton = findViewById<Button>(R.id.btnCamera)
        webButton.setOnClickListener {
            val intent =  Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://git-scm.com/downloads")
            startActivity(intent)
        }
        cameraButton.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)

        }

    }
}