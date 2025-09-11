package com.example.assignment_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainpageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page) // <-- create login_config.xml later


        val searchbtn=findViewById< ImageButton>(R.id.search)
        val addpostbtn=findViewById<ImageButton>(R.id.create)
        val likebtn=findViewById<ImageButton>(R.id.liked)
        val profilebtn=findViewById<ImageButton>(R.id.profile)
        val msgbtn=findViewById<ImageButton>(R.id.message)

        searchbtn.setOnClickListener {
            val intent = Intent(this, SearchareaActivity::class.java)
            startActivity(intent)
        }

        addpostbtn.setOnClickListener {
            val intent = Intent(this, AddpostActivity::class.java)
            startActivity(intent)
        }


        likebtn.setOnClickListener {
            val intent = Intent(this, LikesActivity::class.java)
            startActivity(intent)
        }

        profilebtn.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        msgbtn.setOnClickListener {
            val intent = Intent(this, MessagesActivity::class.java)
            startActivity(intent)
        }


    }
}
