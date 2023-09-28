package com.example.mytapapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            Toast.makeText(this, "Dice rolled!", Toast.LENGTH_SHORT).show()
        }

    }

}
