package com.example.mytapapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mytapapp.R.layout
import com.example.mytapapp.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity(layout.activity_main) {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener { calculateTip() }
    }


    private fun calculateTip() {
        val stringInTextField = binding.coastOfService.text.toString()
        val cost = stringInTextField.toDoubleOrNull()
        if (cost == null) {
            binding.tipResult.text = ""
            return
        }
        val tipPercentage =
            when (binding.tipOptions.checkedRadioButtonId) {
                binding.optionTwentyPercent.id -> 0.20
                binding.optionEighteenPercent.id -> 0.18
                else -> 0.15
            }


        val formattedTip = {
            var tip = tipPercentage * cost
            if (binding.roundUpSwitch.isChecked) {
                tip = kotlin.math.ceil(tip)
            }

            NumberFormat.getCurrencyInstance().format(tip)
        }
        binding.tipResult.text = getString(R.string.tip_amount, formattedTip())
    }

}
