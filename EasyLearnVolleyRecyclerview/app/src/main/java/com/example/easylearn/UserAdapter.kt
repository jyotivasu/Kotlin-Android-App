package com.example.easylearn

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class UserAdapter(private val userList: ArrayList<User>) : RecyclerView.Adapter<UserAdapter.ViewHolder>(){
    private lateinit var context: Context

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val img = itemView.findViewById<ImageView>(R.id.imageView)
        val name = itemView.findViewById<TextView>(R.id.tvName)
        val email = itemView.findViewById<TextView>(R.id.tvEmail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.user_items, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = userList[position]

        Glide.with(context).load(user.pic).into(holder.img)

        val stringBuilder = StringBuilder()
        stringBuilder.append(user.fName).append(" ").append(user.lName)

        holder.name.text = stringBuilder
        holder.email.text = user.emailId
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}