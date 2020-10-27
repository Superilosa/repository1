package com.example.homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init(){
        val centerText = findViewById<TextView>(R.id.centerText)
        val randomNumberButton = findViewById<Button>(R.id.randomNumberButton)
        randomNumberButton.setOnClickListener {
            val number = randomNumberGenerator()
            d("randomNumber", "Random Number: $number")

            if(dividable5(number)){
                centerText.text = "Yes"
            }else{
                centerText.text = "No"
            }
        }

    }

    private fun randomNumberGenerator():Int = (-100..100).random()

    private fun dividable5(number:Int):Boolean{
        return number%5 == 0 && number>0
    }
}