package com.example.anjiuzhen.activitytest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.third_layout.*

class ThirdActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_layout)
        button_3.setOnClickListener {
            ActivityCollector.finishAll()
        }
    }
}
