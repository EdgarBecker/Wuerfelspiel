package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Deckscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deckscreen)

        var tapscreen = findViewById<ImageView>(R.id.imageView2)

        tapscreen.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
    }
}}