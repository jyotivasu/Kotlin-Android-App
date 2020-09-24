package com.example.easylearn

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private val title = arrayOf<String>("Avatar", "Joker","Spiderman",
    "Pikachu","Pokemon","Smurf","Titanic","Toystory",

        "Avatar", "Joker","Spiderman",
        "Pikachu","Pokemon","Smurf","Titanic","Toystory"
        )
    private val image = arrayOf<Int>(
        R.drawable.avatar,
        R.drawable.jokerr,
        R.drawable.spiderman,
        R.drawable.pikachu,
        R.drawable.pokemon,
        R.drawable.smurf,
        R.drawable.titanic,
        R.drawable.toystory,

        R.drawable.avatar,
        R.drawable.jokerr,
        R.drawable.spiderman,
        R.drawable.pikachu,
        R.drawable.pokemon,
        R.drawable.smurf,
        R.drawable.titanic,
        R.drawable.toystory
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.decorView.apply {

            systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                    View.SYSTEM_UI_FLAG_FULLSCREEN
        }
        setContentView(R.layout.activity_main)

        list_view.adapter = ListAdapter(this,image,title)
        list_view.setOnItemClickListener { parent, view, position, id ->

            if (position == 0 ){

                Toast.makeText(this,"Start a movie",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
