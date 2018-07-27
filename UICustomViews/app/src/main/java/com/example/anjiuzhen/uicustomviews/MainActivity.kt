package com.example.anjiuzhen.uicustomviews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar
        if (actionBar != null){
            actionBar.hide() // 隐藏系统自带的标题栏
        }

    }
}
