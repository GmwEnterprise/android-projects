package com.example.activitytest

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_layout.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)

        button2.setOnClickListener {
            Toast.makeText(this, "返回", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}