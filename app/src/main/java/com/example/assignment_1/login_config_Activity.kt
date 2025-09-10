package com.example.assignment_1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class LoginConfigActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_config) // make sure login_config.xml exists

        val loginbutton = findViewById<Button>(R.id.login_button)
        val signupLink = findViewById<Button>(R.id.sign_up_link)


        loginbutton.setOnClickListener {
            val intent = Intent(this, MainpageActivity::class.java)
            startActivity(intent)
        }

        signupLink.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }



    }
}

