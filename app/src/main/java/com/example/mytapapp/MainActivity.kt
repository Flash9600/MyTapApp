package com.example.mytapapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.mytapapp.R.layout
import com.example.mytapapp.adapter.ItemAdapter
import com.example.mytapapp.data.Datasourse
import com.example.mytapapp.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity(layout.activity_main) {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset = Datasourse().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.adapter = ItemAdapter(this, myDataset)
    }


}
