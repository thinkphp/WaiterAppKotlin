package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    var id = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val tvGreeting = findViewById<TextView>(R.id.tv_greeting)

        val btnClickMe = findViewById<Button>(R.id.btn_click_me)

        val plusBtn = findViewById<Button>(R.id.plusBtn)
        
        val minusBtn = findViewById<Button>(R.id.minusBtn)
        
        val value = findViewById<TextView>(R.id.value)

        plusBtn.setOnClickListener {
        
            value.setText("" + ++id)
        }

        minusBtn.setOnClickListener {
            value.setText("" + --id)
        }

        btnClickMe.setOnClickListener {

            if (TextUtils.isEmpty(tvGreeting.text)) {

                tvGreeting.text = "Welcome to Redis Restaurant! Menu: MeatBall Soup "

            } else {

                Toast.makeText(

                    this, "What else do you want?",

                    Toast.LENGTH_LONG

                ).show()
            }
        }
    }
}
