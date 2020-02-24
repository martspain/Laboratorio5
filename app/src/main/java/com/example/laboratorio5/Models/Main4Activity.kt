package com.example.laboratorio5.Models

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.laboratorio5.R

class Main4Activity : AppCompatActivity() {

    private lateinit var finishBut: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        finishBut = findViewById(R.id.finish_button)

        finishBut.setOnClickListener{
            launchNextActivity()
        }

    }

    private fun launchNextActivity(){
        val intent = Intent(this, Main5Activity::class.java)
        startActivity(intent)
    }
}
