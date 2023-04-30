package com.example.exam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {

    private lateinit var recipientEmailEditText: EditText
    private lateinit var okayTextField: EditText
    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        recipientEmailEditText = findViewById(R.id.recipientEmailField)
        okayTextField = findViewById(R.id.OkayField)
        nextButton = findViewById(R.id.nextButton)

        nextButton.setOnClickListener {
            val recipientEmail = recipientEmailEditText.text.toString()
            val message = okayTextField.text.toString()

            if (recipientEmail.isNotEmpty() && message.isNotEmpty() && recipientEmail.contains("@") && message.length <= 250) {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("recipientEmail", recipientEmail)
                intent.putExtra("message", message)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please enter a valid recipient email and message.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}


