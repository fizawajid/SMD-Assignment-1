package com.example.assignment_1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageButton

class SearchareaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_area) // make sure login_config.xml exists

        val addpostbtn=findViewById<ImageButton>(R.id.create)
      val likebtn=findViewById<ImageButton>(R.id.liked)

        val homebtn=findViewById<ImageButton>(R.id.home)


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

    }
}

