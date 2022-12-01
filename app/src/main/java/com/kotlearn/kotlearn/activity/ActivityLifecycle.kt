package com.kotlearn.kotlearn.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.kotlearn.kotlearn.R

class ActivityLifecycle : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)

        Log.i("Acttt 1", "onCreate")
        onClicks()
    }

    override fun onStart() {
        super.onStart()
        Log.i("Acttt 1", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Acttt 1", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Acttt 1", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Acttt 1", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Acttt 1", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Acttt 1", "onRestart")
    }

    fun onClicks() {
        var btnNext = findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener {

            //INTENT - going to the next activity
            val intent = Intent(this, SecondActivity::class.java)

            //passing data to the second activity
            intent.putExtra("USER", "This data is from the first page")
            startActivity(intent)
        }

    }
}