package com.example.assignment_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup) // linking to signup.xml



        val createacc = findViewById<Button>(R.id.create_account_button)
        createacc.setOnClickListener {
            val intent = Intent(this,  LoginConfigActivity::class.java)
            startActivity(intent)
        }

    }
}
