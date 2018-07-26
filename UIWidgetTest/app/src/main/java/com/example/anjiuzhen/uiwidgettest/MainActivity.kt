package com.example.anjiuzhen.uiwidgettest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            var inputText = edit_text.text
            Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show()
            image_view.setImageResource(R.drawable.img_2)

            val progressBar: ProgressBar = this.progress_bar
            if (progressBar.visibility == View.GONE){
                progressBar.visibility = View.VISIBLE
            } else {
                progressBar.visibility = View.GONE
            }
            if (progressBar.visibility == View.VISIBLE){
                var progress: Int =  progressBar.progress
                progress += 10
                progressBar.progress = progress
            }

            // Initialize a new instance of
            val builder = AlertDialog.Builder(this@MainActivity)
            // Set the alert dialog title
            builder.setTitle("App background color")

            // Display a message on alert dialog
            builder.setMessage("Are you want to set the app background color to RED?")

            // Set a positive button and its click listener on alert dialog
            builder.setPositiveButton("YES"){dialog, which ->
                // Do something when user press the positive button
                Toast.makeText(applicationContext,"Ok, we change the app background.",Toast.LENGTH_SHORT).show()
            }

            // Display a negative button on alert dialog
            builder.setNegativeButton("No"){dialog,which ->
                Toast.makeText(applicationContext,"You are not agree.",Toast.LENGTH_SHORT).show()
            }

            // Display a neutral button on alert dialog
            builder.setNeutralButton("Cancel"){_,_ ->
                Toast.makeText(applicationContext,"You cancelled the dialog.",Toast.LENGTH_SHORT).show()
            }

            // Finally, make the alert dialog using builder
            val dialog: AlertDialog = builder.create()
            // Display the alert dialog on app interface
            dialog.show()


        }
    }
}
