package com.baldezh.lab5

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.baldezh.lab5.databinding.ActivityCalcBinding

class CalcActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalcBinding

    @SuppressLint("SetTextI18n", "DefaultLocale")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalcBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val result = CalcImpl(InputActivity.isSeaMile, InputActivity.miles).Calc()

        binding.resultView.text = "Расстояние: ${String.format("%.2f", result)} km"

        binding.backButton.setOnClickListener {
            finish()
        }
    }
}

