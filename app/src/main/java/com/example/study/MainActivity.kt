package com.example.study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button1 : Button = findViewById(R.id.button)
        button1.setOnClickListener {
            add_one()
        }

        val button2 : Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            minus_one()
        }

    }



    fun add_one()
    {
        val lable : TextView = findViewById(R.id.textView)
        ++counter
        lable.text = counter.toString()
    }

    fun minus_one()
    {
        val lable : TextView = findViewById(R.id.textView)
        --counter
        lable.text = counter.toString()
    }
}