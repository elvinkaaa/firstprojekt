package com.example.proekt

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proekt.components.ButtonsActivity
import com.example.proekt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnButtons.setOnClickListener {
            startActivity(Intent(applicationContext, ButtonsActivity::class.java))
        }

    }
}