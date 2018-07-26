package com.example.anjiuzhen.activitytest

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("BaseActivity", localClassName)
        ActivityCollector.addActivity(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        ActivityCollector.removeActivity(this)
    }

}

object ActivityCollector{

    private var activities: ArrayList<Activity> = arrayListOf()

    fun addActivity(activity: Activity){
        activities.add(activity)
    }

    public fun removeActivity(activity: Activity){
        activities.remove(activity)
    }

    public fun finishAll(){
        for (i in activities){
            if (!i.isFinishing){
                i.finish()
            }
        }
        android.os.Process.killProcess(android.os.Process.myPid()) //kill self process
    }

}


