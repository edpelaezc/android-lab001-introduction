package com.edpelaezc.sampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.edpelaezc.sampleapp.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_main)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val sessionToken = intent.getStringExtra("SESSION_TOKEN")

        binding.sessionTokenTextView.text =  sessionToken
        binding.imageViewPerfil.setImageResource(R.drawable.ic_launcher_foreground)
    }
}