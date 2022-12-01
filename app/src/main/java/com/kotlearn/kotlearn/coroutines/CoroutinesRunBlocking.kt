package com.kotlearn.kotlearn.coroutines

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.kotlearn.kotlearn.databinding.ActivityCoroutinesRunBlockingBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class CoroutinesRunBlocking : AppCompatActivity() {

    val TAG = "RunBlocking"
    private lateinit var binding: ActivityCoroutinesRunBlockingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCoroutinesRunBlockingBinding.inflate(layoutInflater)
        setContentView(binding.root)


        Log.i(TAG, "Before runBlocking")

        //runBlocking will block the main thread
        runBlocking {
            //two different coroutine launcher
            launch(Dispatchers.IO) {
                delay(3000)
                Log.i(TAG, "Finished IO Coroutine 1")
            }
            launch(Dispatchers.IO) {
                delay(3000)
                Log.i(TAG, "Finished IO Coroutine 2")
            }
            Log.i(TAG, "Start of runBlocking")
            delay(5000)
            Log.i(TAG, "End of runBlocking")
        }

        Log.i(TAG, "After of runBlocking")
    }




}