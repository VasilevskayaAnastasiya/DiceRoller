package com.example.diceroller

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.diceroller.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnRoll.setOnClickListener { roll(6) }

        roll(6)
    }

    fun roll(num: Int) {

        var i = 0
        var bRollImage = binding.rollImage
        val randRoll = (1..num).random()
        val drawableResource = when (randRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        bRollImage.contentDescription = randRoll.toString()
        bRollImage.setImageResource(drawableResource)
    }
}
