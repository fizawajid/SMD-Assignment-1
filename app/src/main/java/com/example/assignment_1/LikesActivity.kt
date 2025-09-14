package com.example.assignment_1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageButton

class LikesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.like_following) // make sure login_config.xml exists

        val youubtn = findViewById<Button>(R.id.youbtn)

        youubtn.setOnClickListener {
            val intent = Intent(this, LikesActivity2::class.java)
            startActivity(intent)
        }

        val searchbtn=findViewById< ImageButton>(R.id.search)
        val addpostbtn=findViewById<ImageButton>(R.id.create)
//        val likebtn=findViewById<ImageButton>(R.id.liked)

        val homebtn=findViewById<ImageButton>(R.id.home)

        searchbtn.setOnClickListener {
            val intent = Intent(this, SearchareaActivity::class.java)
            startActivity(intent)
        }

        addpostbtn.setOnClickListener {
            val intent = Intent(this, AddpostActivity::class.java)
            startActivity(intent)
        }


        homebtn.setOnClickListener {
//            val intent = Intent(this, MainpageActivity::class.java)
//            startActivity(intent)
            finish()
        }

        val profilebtn=findViewById<ImageButton>(R.id.profile)
        profilebtn.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

//        likebtn.setOnClickListener {
//            val intent = Intent(this, LikesActivity::class.java)
//            startActivity(intent)
//        }




    }
}

