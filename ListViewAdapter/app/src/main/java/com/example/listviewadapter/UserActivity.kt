package com.example.listviewadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val names = intent.getStringExtra("name")
        val phoneNumbers = intent.getStringExtra("phone")
        val imageIds = intent.getIntExtra("image", R.drawable.pic1)

        val imageBox = findViewById<CircleImageView>(R.id.imageProfile)
        val phoneBox = findViewById<TextView>(R.id.tvPhones)
        val nameBox = findViewById<TextView>(R.id.tvNames)

        nameBox.text = names
        phoneBox.text = phoneNumbers
        imageBox.setImageResource(imageIds)

    }
}