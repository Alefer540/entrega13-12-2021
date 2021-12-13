package com.example.entrega13_12_2021

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.entrega13_12_2021.databinding.ActivityMain2Binding


class MainActivity2: AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    companion object{
        fun launch(context: Context) {
            val intent = Intent(context,MainActivity2::class.java)
            context.startActivity(intent)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}