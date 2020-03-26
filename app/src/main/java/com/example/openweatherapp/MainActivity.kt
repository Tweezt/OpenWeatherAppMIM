package com.example.openweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {


    lateinit var btn:Button
    lateinit var editText:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.button)
        editText = findViewById(R.id.textInput1)

        btn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("username",editText.text.toString())
            startActivity(intent)
        }
    }
}
