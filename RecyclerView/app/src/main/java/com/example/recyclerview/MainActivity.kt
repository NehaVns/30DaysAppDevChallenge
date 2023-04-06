package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var myRecyclerView : RecyclerView
    lateinit var newsArrayList : ArrayList<News>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myRecyclerView = findViewById(R.id.recyclerView)
        var newsImageArray= arrayOf(
            R.drawable.news1,
            R.drawable.news2,
            R.drawable.news3,
            R.drawable.news4
        )

        var newsHeadingArray = arrayOf("India rejects China’s renaming of 11 locations in Arunachal Pradesh",
            "Beijing to keep Arunachal Pradesh pot boiling by renaming exercise",
            "MS Dhoni drops bombshell with 'They'll play under new captain if...' remark after CSK's win over LSG",
            "The Obamas’ New Mansion Is Out Of This World)"
        )

        myRecyclerView.layoutManager = LinearLayoutManager(this)
        newsArrayList = arrayListOf<News>()
        for (index in newsImageArray.indices){
            val news = News(newsHeadingArray[index],newsImageArray[index])
            newsArrayList.add(news)

        }
    }
}