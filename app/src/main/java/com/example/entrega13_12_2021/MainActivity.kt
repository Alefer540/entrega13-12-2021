package com.example.entrega13_12_2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.entrega13_12_2021.databinding.ActivityMainBinding
import kotlin.random.Random
class MainActivity : AppCompatActivity() {
private lateinit var binding : ActivityMainBinding

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.b1.setOnClickListener {
        MainActivity2.launch(this)
    }
    binding.b2.setOnClickListener {
        MainActivity3.launch(this,"El texto tiene ${binding.t1.length()} caracteres")
    }
    binding.b3.setOnClickListener {

        val bol =Random.nextBoolean()
        if(bol){
            MainActivity2.launch(this)
        }
        else{
            MainActivity3.launch(this,"El texto tiene ${binding.t1.length()} caracteres")

        }
    }
}
}
