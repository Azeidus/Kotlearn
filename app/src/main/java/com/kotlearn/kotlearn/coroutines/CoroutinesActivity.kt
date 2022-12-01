package com.kotlearn.kotlearn.coroutines

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.kotlearn.kotlearn.databinding.ActivityCoroutinesBinding
import com.kotlearn.kotlearn.extensions.showToast
import kotlinx.coroutines.*


/*

A function is a sequence of instructions that takes inputs and gives us outputs.

A thread describes in which context this sequence of instructions should be executed.

Multithreading
-Network Calls
-Complex Calculations
-Database Operations

What distinguishes Coroutines form Threads?
1. Executed within a thread
2. Coroutines are suspendable
3. They can switch their context


Steps in applying Coroutines
1. import dependencies in your app gradle

1.3.5 is the current version
implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.5'
implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.5'


Note: coroutines can be canceled when the main thread finishes



*/



class CoroutinesActivity : AppCompatActivity() {

    val TAG = "Coroutinesss"
    private lateinit var binding: ActivityCoroutinesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCoroutinesBinding.inflate(layoutInflater)
        setContentView(binding.root)


        /*
        GlobalScope
        used to launch top-level coroutines which are operating on the whole application lifetime and are not cancelled prematurely
        -----------------------------------------------------------------------------------------
        Different dispatchers of coroutines
        Main: It will start in the main thread. It is mainly use for interacting with UI.

        IO: It is use for all kinds of data operation such as reading and writing files, network calls and etc.

        Default: It is the default dispatcher. It is designed to run CPU-intensive operations.It has a pool of
        threads with a size equal to the number of cores on the machine your code is running on (but not less than two).

        */

        GlobalScope.launch(Dispatchers.IO) {
            Log.d(TAG, "Starting coroutine in thread ${Thread.currentThread().name}")
            val answer = doNetworkCall()

            //using withContext to change dispatcher
             withContext(Dispatchers.Main){
                Log.d(TAG, "Setting text in thread ${Thread.currentThread().name}")
                binding.tvDummy.text = answer
            }
        }


    }

    suspend fun doNetworkCall(): String {
        delay(5000) //it will only pause the coroutine and will not block the whole thread
        return "This is the return of doNetworkCall"
    }




}

