package com.example.recyclerview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(var newsArrayList : ArrayList<News>, var context: Activity) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    // to create new view instance
    // when layout manager fails to find a suitable view for each item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.each_row_item, parent, false)
        return MyViewHolder(itemView)
    }
    //populate items with data
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var currentItem  = newsArrayList[position]
        holder.hTitle.text = currentItem.newsHeading
        holder.hImage.setImageResource(currentItem.newsImage)

    }
    // how many list items are present in an array
    override fun getItemCount(): Int {
        return newsArrayList.size

    }
    //it holds the views so the views are not created everytime, so memory can be saved
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val hTitle = itemView.findViewById<TextView>(R.id.headingTitle)
        val hImage = itemView.findViewById<ShapeableImageView>(R.id.headingImage)

    }
}