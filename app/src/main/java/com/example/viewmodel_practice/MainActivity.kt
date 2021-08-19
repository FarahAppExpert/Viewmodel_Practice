package com.example.viewmodel_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var button : Button
    lateinit var textview : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var viewmodel = ViewModelProvider(this).get(viewmodel_main :: class.java)

        textview = findViewById<View>(R.id.textView) as TextView

        button = findViewById<View>(R.id.button1) as Button

        button.setOnClickListener(object : View.OnClickListener
        {
            override fun onClick(v: View?) {
                viewmodel.increaseByOne()
                textview.text = viewmodel.number.toString()
            }

        })
    }

}