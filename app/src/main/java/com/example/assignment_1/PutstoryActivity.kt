package com.example.assignment_1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import de.hdodenhof.circleimageview.CircleImageView
import android.widget.ImageView

class PutstoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.putstory)


        val captureimg = findViewById<ImageButton>(R.id.capture_button)

        val arrbtn = findViewById<ImageView>(R.id.arrowright)

        captureimg.setOnClickListener {
            val intent = Intent(this, UploadstoryActivity::class.java)
            startActivity(intent)
        }

        arrbtn .setOnClickListener {
            val intent = Intent(this, MainpageActivity::class.java)
            startActivity(intent)
        }


    }
}