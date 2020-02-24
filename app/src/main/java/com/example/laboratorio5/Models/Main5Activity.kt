package com.example.laboratorio5.Models

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.laboratorio5.R

class Main5Activity : AppCompatActivity() {

    private lateinit var showBut: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        showBut = findViewById(R.id.get_answers)

        showBut.setOnClickListener{
            Toast.makeText(this, R.string.show_res, Toast.LENGTH_LONG).show()
        }
    }
}
