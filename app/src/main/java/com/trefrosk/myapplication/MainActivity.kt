package com.trefrosk.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter = 0
        val btnCounter = findViewById<Button>(R.id.btnCounter)
        val txtCounter = findViewById<TextView>(R.id.txtCounter)
        val btnReset =  findViewById<Button>(R.id.buttonReset)
            btnCounter.setOnClickListener {
                counter += 1
                txtCounter.text = counter.toString()
            }
            btnReset.setOnClickListener {
                counter = 0
                txtCounter.text = counter.toString()
            }
    }
}