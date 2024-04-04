package com.edpelaezc.sampleapp

import API.LoginAPI
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.edpelaezc.sampleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.loginButton.setOnClickListener {
            val username = binding.usernameEditText.text.toString().trim()
            val password = binding.passwordEditText.text.toString().trim()

            validateLogin(username, password)
        }

    }

    private fun validateLogin(username: String, password: String) {
        val sessionToken = LoginAPI().validateUser(username, password)
        if (sessionToken != null) {
            val intent = Intent(this, WelcomeActivity::class.java).apply {
                putExtra("SESSION_TOKEN", sessionToken)
            }
            startActivity(intent)
        } else {
            showToast("Invalid username or password")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }


}