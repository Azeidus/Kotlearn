package com.kotlearn.kotlearn.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlearn.kotlearn.R
import kotlinx.coroutines.*

class CoroutineSuspendFunction : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutine_suspend_function)



        //suspend function can be only use inside coroutine or suspend function
        val job = GlobalScope.launch /*by default coroutine will use Dispatcher.Default*/  {

            if(isActive){
                //this is use if you have long calculations
                //coroutine is so busy with other calculations that there is not time to check other calculation
                //isActive is use to check manually if the coroutine is still active
            }

            withTimeout(3000){
                //it will execute this body but it will cancel manually depends on the time you put.
            }

            //It will adds up their delay since both function are in the same coroutine (6000 millisecs)
            val networkCallAnswer = doNetworkCall()
            val networkCallAnswer2 = doNetworkCall2()
            println(networkCallAnswer)
            println(networkCallAnswer2)
            addTwoNumber(1,2)

        }

        runBlocking {
            delay(3000)
            job.cancel() //this will cancel the coroutine
            println("This is Main Thread is continuing")

        }

    }

    suspend fun doNetworkCall(): String {
        delay(1000)
        return "This is the answer"
    }

    suspend fun doNetworkCall2(): String {
        delay(1000)
        return "This is the answer"
    }

     fun addTwoNumber(n1: Int, n2: Int) : Int {
        return n1+n2
    }


}