package com.rodan.diceroller

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Press the ROLL button to start rolling", Toast.LENGTH_SHORT).show()
        val RollButton: Button = findViewById(R.id.button_roll)
        val DiceImage: ImageView = findViewById(R.id.imageview_dice)
        val toggle: ToggleButton = findViewById(R.id.toggleButton)
        val mp: MediaPlayer = MediaPlayer.create(
            this,
            R.raw.dice_roll_sound
        )//Should keep the sound file in raw inorder to access
        RollButton.setOnClickListener {
            val toggleValue = toggle.getText().toString()
            if (toggleValue == "Mute") {
                mp.start()
            }
            val randomNumber = rollTheDice()
            when (randomNumber) {
                1 -> DiceImage.setImageResource(R.drawable.dice1)
                2 -> DiceImage.setImageResource(R.drawable.dice2)
                3 -> DiceImage.setImageResource(R.drawable.dice3)
                4 -> DiceImage.setImageResource(R.drawable.dice4)
                5 -> DiceImage.setImageResource(R.drawable.dice5)
                6 -> DiceImage.setImageResource(R.drawable.dice6)

            }
        }
    }

    fun rollTheDice(): Int {
        return ((1..6).random())
    }
}