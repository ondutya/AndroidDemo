package com.example.anjiuzhen.activitytest

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.second_layout.*
import java.time.Instant

class SecondActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        button_2.setOnClickListener{
            Toast.makeText(this,"哈哈，这是一个Toast",Toast.LENGTH_SHORT).show()
        }
    }

    companion object {

        fun actionStart(context: Context, data1: String, data2: String){
            var intent = Intent(context, SecondActivity.javaClass)
            intent.putExtra("param1", data1)
            intent.putExtra("param2", data2)
            context.startActivity(intent)
        }
    }
}
