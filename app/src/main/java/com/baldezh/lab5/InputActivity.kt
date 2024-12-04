package com.baldezh.lab5

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.baldezh.lab5.databinding.ActivityInputBinding

class InputActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInputBinding

    companion object {
        var miles: Double = 0.0
        var isSeaMile: Boolean = false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saveButton.setOnClickListener {
            val milesInput = binding.distance.text.toString()
            if (milesInput.isNotEmpty()) {
                miles = milesInput.toDouble()
                isSeaMile = binding.nauticalMile.isChecked
                Toast.makeText(this, "Сохранено", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, "Введите расстояние", Toast.LENGTH_SHORT).show()
            }
        }
    }
}