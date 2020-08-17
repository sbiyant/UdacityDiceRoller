package com.example.udacitydiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.udacitydiceroller.databinding.ActivityMainBinding
import com.example.udacitydiceroller.R.string

import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.rollBtn.text = getString(string.lets_roll)
        binding.rollBtn.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {

        val drawableResource = when(Random.nextInt(6)+1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        binding.diceImg.setImageResource(drawableResource)
    }
}