package com.example.exam

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private lateinit var CounterNumberText: EditText
    private lateinit var clickTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        CounterNumberText = findViewById(R.id.counterNumber)
        clickTextView = findViewById(R.id.clickButton)


        var counter = 0
        clickTextView.setOnClickListener(object : counterNumber() {
            fun onClick(v: View?) {
                counter++
            }
        })



        }
    }
}
