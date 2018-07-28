package com.example.anjiuzhen.uicustomviews


import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class TitleLayout(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.title, this)
        val titleBack = findViewById(R.id.title_back) as Button
        val titleEdit = findViewById(R.id.title_edit) as Button

        titleBack.setOnClickListener { (getContext() as Activity).finish() }
        titleEdit.setOnClickListener {
            Toast.makeText(getContext(), "You clicked Edit button", Toast.LENGTH_SHORT).show()
        }
    }

}

