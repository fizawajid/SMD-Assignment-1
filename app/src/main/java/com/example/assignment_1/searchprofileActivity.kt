package com.example.assignment_1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class SearchprofileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.searchprofile)


        val clrbtn = findViewById<ImageButton>(R.id.clear_button)
        clrbtn.setOnClickListener {
            val intent = Intent(this, SearchareaActivity::class.java)
            startActivity(intent)
        }

        val kyanaccLayout = findViewById<LinearLayout>(R.id.kyanacc)

        kyanaccLayout.setOnClickListener {
            // Navigate to another activity
            val intent = Intent(this, AnotherprofileActivity::class.java)
            startActivity(intent)
        }

//        kyanacc

    }
}