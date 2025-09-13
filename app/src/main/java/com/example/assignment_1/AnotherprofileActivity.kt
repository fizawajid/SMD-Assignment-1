package com.example.assignment_1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AnotherprofileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.someoneprofile)

        val addpostbtn=findViewById<ImageButton>(R.id.create)
        val likebtn=findViewById<ImageButton>(R.id.liked)

        val homebtn=findViewById<ImageButton>(R.id.home)


        val backbtn=findViewById<ImageButton>(R.id.back_arrow)

        addpostbtn.setOnClickListener {
            val intent = Intent(this, AddpostActivity::class.java)
            startActivity(intent)
        }

        likebtn.setOnClickListener {
            val intent = Intent(this, LikesActivity::class.java)
            startActivity(intent)
        }


        homebtn.setOnClickListener {
            val intent = Intent(this, MainpageActivity::class.java)
            startActivity(intent)
        }

        val profilebtn=findViewById<ImageButton>(R.id.profile)
        profilebtn.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        backbtn.setOnClickListener {
            val intent = Intent(this, SearchareaActivity::class.java)
            startActivity(intent)
        }


    }
}