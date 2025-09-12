package com.example.assignment_1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout

class ChatDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inside_message) // make sure login_config.xml exists


        val backbtn = findViewById< ImageButton>(R.id.back_arrow)

        backbtn.setOnClickListener {
            val intent = Intent(this, MessagesActivity::class.java)
            startActivity(intent)
        }

        val callbtn = findViewById<ImageButton>(R.id.video_call)
        callbtn.setOnClickListener {
            val intent = Intent(this, CallActivity::class.java)
            startActivity(intent)
        }


    }
}

