package com.example.entrega13_12_2021

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.entrega13_12_2021.databinding.ActivityMain3Binding

class MainActivity3 :AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding

    companion object {

        const val TAG_TEXT="TAG_TEXT"

        fun launch(context: Context, text:String) {
            val intent = Intent(context,MainActivity3::class.java)
            intent.putExtra(TAG_TEXT,text)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val initialData = intent.getStringExtra(TAG_TEXT)

        binding.t1.text = initialData
    }
}
