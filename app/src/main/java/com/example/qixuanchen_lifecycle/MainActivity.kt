package com.example.qixuanchen_lifecycle

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var view: TextView
    private lateinit var sayHello: Button
    private lateinit var edit: EditText

    private val activityName = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(activityName, "onCreate is triggered")

        view = findViewById(R.id.view)
        sayHello = findViewById(R.id.sayHello)
        edit = findViewById(R.id.edit)

        sayHello.setOnClickListener {
            view.text = "Hello"
            edit.setText("Hello")
        }

    }
    override fun onStart() {
        super.onStart()
        Log.d(activityName, "onStart is triggered")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(activityName, "onRestart is triggered")
    }

    override fun onResume() {
        super.onResume()
        Log.d(activityName, "onResume is triggered")
    }

    override fun onPause() {
        super.onPause()
        Log.d(activityName, "onPause is triggered")
    }

    override fun onStop() {
        super.onStop()
        Log.d(activityName, "onStop is triggered")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(activityName, "onDestroy is triggered")
    }
}