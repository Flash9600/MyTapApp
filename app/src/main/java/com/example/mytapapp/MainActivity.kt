package com.example.mytapapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }


    }

    private fun rollDice() {
        val diceValue: Int = Dice(6).roll()
        val diceImage: ImageView = findViewById<ImageView>(R.id.dice)
        val drawbleResourse : Int = when (diceValue) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawbleResourse)
        diceImage.contentDescription = diceValue.toString()
    }

}
