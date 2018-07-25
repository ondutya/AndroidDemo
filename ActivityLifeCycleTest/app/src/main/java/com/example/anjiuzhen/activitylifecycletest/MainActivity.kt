package com.example.anjiuzhen.activitylifecycletest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        start_normal_activity.setOnClickListener {
            startActivity(Intent(this,NoramlActivity::class.java))
        }

        start_dialog_activity.setOnClickListener{
            startActivity(Intent(this, DialogActivity::class.java))
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d(localClassName,"onStart");
    }

    override fun onResume() {
        super.onResume()
        Log.d(localClassName, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(localClassName, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(localClassName, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(localClassName, "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(localClassName, "onRestart")
    }
}


