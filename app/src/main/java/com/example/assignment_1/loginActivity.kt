package com.example.assignment_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val loginButton = findViewById<Button>(R.id.login_button)
        val signupLink = findViewById<Button>(R.id.sign_up_link)
        val switchacc=findViewById<Button>(R.id.switch_accounts)

        loginButton.setOnClickListener {
            val intent = Intent(this, MainpageActivity::class.java)
            startActivity(intent)
            finish()
        }

        signupLink.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        switchacc.setOnClickListener {
            val intent = Intent(this,  LoginConfigActivity::class.java)
            startActivity(intent)
        }
    }
}
