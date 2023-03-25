package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView = findViewById<ListView>(R.id.lv1)
        val taskList = arrayListOf<String>()
        taskList.add("Attend Exam")
        taskList.add("Complete the App Dev Project")
        taskList.add("Buy Bhindi from market")
        taskList.add("Work on Resume")
        taskList.add("Improve Internet presence")

        val adapterForMyListView = ArrayAdapter(this, android.R.layout.simple_list_item_1,taskList)
        listView.adapter = adapterForMyListView

        listView.setOnItemClickListener { adapterView, view, i, l ->
            val text  =  "Clicked on item : "+ (view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }


    }
}