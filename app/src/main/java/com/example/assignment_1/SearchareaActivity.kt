package com.example.assignment_1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.util.Log

class SearchareaActivity : AppCompatActivity() {
    private var hasNavigated = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_area)

        val addpostbtn = findViewById<ImageButton>(R.id.create)
        val likebtn = findViewById<ImageButton>(R.id.liked)
        val homebtn = findViewById<ImageButton>(R.id.home)
        val profilebtn = findViewById<ImageButton>(R.id.profile)

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

        profilebtn.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val searchEditText = findViewById<EditText>(R.id.searchid)

        // Method 1: TextWatcher approach (automatically navigate when 2 words are typed)
        searchEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                if (hasNavigated) return

                val text = s.toString().trim()
                Log.d("SearchDebug", "Current text: '$text'")

                if (text.isEmpty()) return

                val words = text.split("\\s+".toRegex()).filter { it.isNotEmpty() }
                Log.d("SearchDebug", "Words found: $words, Count: ${words.size}")

                if (words.size >= 2) {
                    Log.d("SearchDebug", "Navigating to SearchprofileActivity")
                    hasNavigated = true

                    val intent = Intent(this@SearchareaActivity, SearchprofileActivity::class.java)
                    startActivity(intent)

                    // Hide keyboard
                    val imm = getSystemService(InputMethodManager::class.java)
                    imm?.hideSoftInputFromWindow(searchEditText.windowToken, 0)
                }
            }
        })

        // Method 2: Enter key press (as backup)
        searchEditText.setOnEditorActionListener { _, actionId, keyEvent ->
            Log.d("SearchDebug", "Editor action triggered: $actionId")

            val text = searchEditText.text.toString().trim()
            Log.d("SearchDebug", "Text on enter: '$text'")

            if (text.isNotEmpty()) {
                val words = text.split("\\s+".toRegex()).filter { it.isNotEmpty() }
                Log.d("SearchDebug", "Words on enter: $words, Count: ${words.size}")

                if (words.size >= 1) { // Navigate even with 1 word when pressing enter
                    Log.d("SearchDebug", "Navigating via enter key")
                    val intent = Intent(this@SearchareaActivity, SearchprofileActivity::class.java)
                    startActivity(intent)

                    val imm = getSystemService(InputMethodManager::class.java)
                    imm?.hideSoftInputFromWindow(searchEditText.windowToken, 0)
                }
            }
            true
        }
    }

    override fun onResume() {
        super.onResume()
        hasNavigated = false
        Log.d("SearchDebug", "Activity resumed, hasNavigated reset to false")
    }
}