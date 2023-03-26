package com.example.listviewadapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter (private val context : Activity, private val arrayList: ArrayList<User>) :
    ArrayAdapter<User>(context,R.layout.each_list_item , arrayList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.each_list_item,null)
        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.tvName)
        val lastMsg = view.findViewById<TextView>(R.id.tvLastMessage)
        val lastTime = view.findViewById<TextView>(R.id.tvTime)

        name.text = arrayList[position].name
        lastMsg.text = arrayList[position].lastMessage
        lastTime.text = arrayList[position].lastMsgtime
        image.setImageResource(arrayList[position].imageId)

        return view
    }

}