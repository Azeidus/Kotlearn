package com.kotlearn.kotlearn.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlearn.kotlearn.R
import com.kotlearn.kotlearn.extensions.showLog
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

class CoroutinesAsync : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines_async)


        GlobalScope.launch(Dispatchers.IO) {
            val time = measureTimeMillis {

                //Async is basically performing a task and return a result.
                //Use async only when you need the parallel execution network calls.
                //Async will block the main thread at the entry point of the await() function.
                val answer1 = async { networkCall() }
                val answer2 = async { networkCall2() }
                showLog("Answer 1 is ${answer1.await()}")
                showLog("Answer 2 is ${answer2.await()}")
            }
            showLog("REQUESTS TOOK $time ms.")
        }
    }


    suspend fun networkCall(): String {
        delay(3000)
        return "THIS IS NETWORK 1"
    }

    suspend fun networkCall2(): String {
        delay(3000)
        return "THIS IS NETWORK 2"
    }

}