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

class PutstoryActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.putstory)


        val captureimg = findViewById<ImageButton>(R.id.capture_button)


        captureimg.setOnClickListener {
            val intent = Intent(this, UploadstoryActivity::class.java)
            startActivity(intent)
        }


    }
}