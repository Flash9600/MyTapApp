package com.example.mytapapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private lateinit var callButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        callButton = findViewById(R.id.image_button)
        callButton.setOnClickListener {
                openTakeImageIntent()
        }

    }

    private fun openTakeImageIntent() {
        val callUri = Uri.parse("https://developer.alexanderklimov.ru/android/theory/intent.php")
        val callIntent = Intent(Intent.ACTION_VIEW, callUri)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(callIntent)
        }
    }

}