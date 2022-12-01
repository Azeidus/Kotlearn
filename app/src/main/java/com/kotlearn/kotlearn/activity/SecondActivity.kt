package com.kotlearn.kotlearn.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.kotlearn.kotlearn.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i("Acttt 2", "onCreate")
        val tvSecondPage = findViewById<TextView>(R.id.tvSecondPage)

        //getting the data using intent
        tvSecondPage.text = intent.getStringExtra("USER")

        onClicks()

    }

    override fun onStart() {
        super.onStart()
        Log.i("Acttt 2", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Acttt 2", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Acttt 2", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Acttt 2", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Acttt 2", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Acttt 2", "onRestart")
    }


    fun onClicks() {
        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {

            val intent = Intent(this, ActivityLifecycle::class.java)
            startActivity(intent)

        }

    }

}