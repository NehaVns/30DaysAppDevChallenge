package com.example.photoframe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    var currentImage = 0
    lateinit var image : ImageView
    var nameArray = arrayOf("Emma Watson", "Neha Kumari", "Shah Rukh Khan")
    // 1,2,3 <-- 1,2,3 --> 1,2,3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val prev = findViewById<ImageButton>(R.id.imgPrevious)
        val next = findViewById<ImageButton>(R.id.imgNext)
        val name = findViewById<TextView>(R.id.tvName1)

        prev.setOnClickListener{
            val idCurrentImageString = "imgPic$currentImage"
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f
            currentImage = (3+ currentImage-1)%3

            val idImageToShowString = "imgPic$currentImage"
            val idImageToShowInt = this.resources.getIdentifier(idImageToShowString, "id", packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f

            name.text = nameArray[currentImage]
        }
        next.setOnClickListener {
            val idCurrentImageString = "imgPic$currentImage"
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f
            currentImage = (3+ currentImage+1)%3

            val idImageToShowString = "imgPic$currentImage"
            val idImageToShowInt = this.resources.getIdentifier(idImageToShowString, "id", packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f
            name.text = nameArray[currentImage]
        }

    }
}