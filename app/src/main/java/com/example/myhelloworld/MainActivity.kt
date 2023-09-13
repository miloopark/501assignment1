package com.example.myhelloworld

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myName = "Milo"
        val textView = findViewById<TextView>(R.id.my_text_view)
        textView.setText("Hi, my name is " + myName + ".");
    }
}