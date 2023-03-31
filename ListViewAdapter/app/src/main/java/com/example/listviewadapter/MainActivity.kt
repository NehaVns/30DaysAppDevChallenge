package com.example.listviewadapter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var userArrayList : ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("Neha", "Emma","Muskan","Hermione")
        val lastMessage = arrayOf("All the best", "Hello", "Good Morning","When?")
        val lastMsgTime = arrayOf("2:33 AM", "7:30 PM", "5:00 PM", "1:00 AM")
        val phoneNumber = arrayOf("1234455667","6234455667" ,"5934455667","3412455667")
        val imageId = intArrayOf(R.drawable.pic4,R.drawable.pic3,R.drawable.pic2,R.drawable.pic1)

        userArrayList = ArrayList()
        for (eachIndex in name.indices){
            val user = User(name[eachIndex],
                lastMessage[eachIndex],
                lastMsgTime[eachIndex],
                phoneNumber[eachIndex],
                imageId[eachIndex] )

            userArrayList.add(user)
        }
        val listView = findViewById<ListView>(R.id.listView)
        listView.isClickable = true
        listView.adapter = MyAdapter(this, userArrayList)
        
        listView.setOnItemClickListener { adapterView, view, i, l ->
            //open new activity
            val userName = name[i]
            val userNumber = phoneNumber[i]
            val userImage = imageId[i]
            val intent = Intent(this, UserActivity::class.java)
            intent.putExtra("name", userName)
            intent.putExtra("phone",userNumber)
            intent.putExtra("image",userImage)
            startActivity(intent)
        }
    }
}