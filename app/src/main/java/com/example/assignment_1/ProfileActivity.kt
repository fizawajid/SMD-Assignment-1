package com.example.assignment_1

import com.example.assignment_1.R

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import de.hdodenhof.circleimageview.CircleImageView


class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile) // <-- create login_config.xml later


        val searchbtn=findViewById< ImageButton>(R.id.search)
        val addpostbtn=findViewById<ImageButton>(R.id.create)
        val likebtn=findViewById<ImageButton>(R.id.liked)

        val homebtn=findViewById<ImageButton>(R.id.home)

        val edittbtn=findViewById<Button>(R.id.editbtn)

        searchbtn.setOnClickListener {
            val intent = Intent(this, SearchareaActivity::class.java)
            startActivity(intent)
        }

        edittbtn.setOnClickListener {
            val intent = Intent(this, EditProfile::class.java)
            startActivity(intent)
        }

        addpostbtn.setOnClickListener {
            val intent = Intent(this, AddpostActivity::class.java)
            startActivity(intent)
        }

        homebtn.setOnClickListener {
            val intent = Intent(this, MainpageActivity::class.java)
            startActivity(intent)
//            finish()
        }

        likebtn.setOnClickListener {
            val intent = Intent(this, LikesActivity::class.java)
            startActivity(intent)
        }


        val profileImage = findViewById<CircleImageView>(R.id.profile_image)

        profileImage.setOnClickListener {
            val intent = Intent(this, HighlightActivity::class.java)
            startActivity(intent)
        }



    }
}
