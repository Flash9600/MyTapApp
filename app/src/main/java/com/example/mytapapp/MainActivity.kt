package com.example.mytapapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {rollDice()}


    }

    private fun rollDice()  {
        val diceValue =  Dice(6).roll()
        findViewById<TextView>(R.id.textView).text = diceValue.toString()
    }

}
