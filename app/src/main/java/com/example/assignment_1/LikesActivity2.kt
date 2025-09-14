package com.example.assignment_1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageButton

class LikesActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.like_you) // make sure login_config.xml exists

        val folbtn = findViewById<Button>(R.id.backfol)
        val homebtn=findViewById<ImageButton>(R.id.home)

        folbtn.setOnClickListener {
//            val intent = Intent(this, LikesActivity::class.java)
//            startActivity(intent)
            finish()
        }

        val searchbtn=findViewById< ImageButton>(R.id.search)
        val addpostbtn=findViewById<ImageButton>(R.id.create)
//        val likebtn=findViewById<ImageButton>(R.id.liked)

        searchbtn.setOnClickListener {
            val intent = Intent(this, SearchareaActivity::class.java)
            startActivity(intent)
        }

        addpostbtn.setOnClickListener {
            val intent = Intent(this, AddpostActivity::class.java)
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




    }
}

