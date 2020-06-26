package com.rodan.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button_roll);
        val diceView: TextView = findViewById(R.id.textview_dice);
        rollButton.setOnClickListener {
            val randomNumber = rollTheDice();
            diceView.setText(randomNumber.toString());//Needs to be converted to string to send the variable to setText method
        }
    }

    fun rollTheDice(): Int {
        val randomNumber = (1..6).random();//Returns Random value between 1 to 6
        return (randomNumber);
    }
}