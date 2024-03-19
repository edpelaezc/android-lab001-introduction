package com.edpelaezc.helloworld

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.edpelaezc.helloworld.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // set text by binding
        binding.txtHelloWorld.text = "papagaio du mar"
        binding.button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        binding.txtHelloWorld.text = binding.editTextTextEmailAddress.text.toString()
    }
}