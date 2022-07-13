package com.example.tbcrevision3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tbcrevision3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val recyclerAdapter : RecyclerAdapter by lazy {
        RecyclerAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpRecycler()
    }




    private fun setUpRecycler(){
        binding.recyclerView.adapter = recyclerAdapter

    }
}