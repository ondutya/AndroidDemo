package com.example.anjiuzhen.activitytest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.second_layout.*
import java.time.Instant

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        button_2.setOnClickListener{
            Toast.makeText(this,"哈哈，这是一个Toast",Toast.LENGTH_SHORT).show()
        }
    }
}
