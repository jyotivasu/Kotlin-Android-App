package com.example.easy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val texts = arrayOf("Special Noodles","Veg Biryani","Veg Sandwich","Pizza Friday","Pancakes","Ice Creams","Veg Burger")
    private val desc = arrayOf("non veg","pure veg","pure veg","customizable","pure veg","pure veg","pure veg")
    private val img = arrayOf(R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e
        ,R.drawable.f,R.drawable.g)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomAdapter(img,texts,desc)
    }
}
