package com.example.listviewadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var userArrayList : ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("Neha", "Emma","Muskan","Hermione")
        val lastMessage = arrayOf("All the best", "Hello", "Good Morning","When?")
        val lastMsgTime = arrayOf("2:33 AM", "7:30 PM", "5:00 PM", "1:00 AM")
        val phoneNumber = arrayOf("1234455667","6234455667" ,"5934455667","3412455667")
        val imageId = intArrayOf(R.drawable.pic4,R.drawable.pic3,R.drawable.pic2,R.drawable.pic1 )
    }
}