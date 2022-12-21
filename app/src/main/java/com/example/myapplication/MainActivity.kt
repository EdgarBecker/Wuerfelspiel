package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.imageView)
        val button = findViewById<Button>(R.id.WürfelButton)
        val beleidung = findViewById<TextView>(R.id.schimpfwort)

        image.setImageResource(R.drawable.dice_6)

        button.setOnClickListener{
            println("click")
            val random = (1..6).random()

            when (random) {

                    1 -> {
                        image.setImageResource(R.drawable.dice_1)
                        beleidung.text= "Loser"
                    }
                2 -> {
                    image.setImageResource(R.drawable.dice_2)
                        beleidung.text= "du bist kacke"
                }
                3 -> {
                    image.setImageResource(R.drawable.dice_3)
                       beleidung.text="kann besser sein"
                }
                4 -> {
                    image.setImageResource(R.drawable.dice_4)
                    beleidung.text="du machst dich"
                }
                5 -> {
                    image.setImageResource(R.drawable.dice_5)
                    beleidung.text="not bad"
                }
                6 -> {
                    image.setImageResource(R.drawable.dice_6)
                    beleidung.text="ich wusste du bist ein Gewinnertyp"
                    }
        }
}}}