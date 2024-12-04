package com.baldezh.lab5

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.baldezh.lab5.databinding.ActivityMainBinding
import kotlin.system.exitProcess


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.exitButton.setOnClickListener {
            moveTaskToBack(true);
            exitProcess(-1)
        }

        binding.inputButton.setOnClickListener {
            startActivity(Intent(this, InputActivity::class.java))
        }

        binding.calcButton.setOnClickListener {
            startActivity(Intent(this, CalcActivity::class.java))
        }
    }

}