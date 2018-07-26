package com.example.anjiuzhen.activitytest

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.first_layout.*

class FirstActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
        //button_1.setOnClickListener{
        //    //finish()
        //    //Toast.makeText(this,"哈哈，这是一个Toast",Toast.LENGTH_SHORT).show()
        //}
        button_1.setOnClickListener{
            //startActivity(Intent(this,SecondActivity::class.java ))
            //startActivity(Intent("com.example.anjiuzhen.activitytest.ACTION_START"))
            var intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("http://www.baidu.com"))
            startActivity(intent)
            //SecondActivity.actionStart(this, "data1", "data2") //传递数据
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item!!.itemId) {
            R.id.add_item -> {
                Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.remove_item ->{
                Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return true
    }

}
