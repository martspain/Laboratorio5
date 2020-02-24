package com.example.laboratorio5.Models

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.laboratorio5.R

class Main3Activity : AppCompatActivity() {

    private lateinit var nextBut: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        nextBut = findViewById(R.id.next_button)

        nextBut.setOnClickListener{
            launchNextActivity()
        }

    }

    private fun launchNextActivity(){
        val intent = Intent(this, Main4Activity::class.java)
        startActivity(intent)
    }
}
