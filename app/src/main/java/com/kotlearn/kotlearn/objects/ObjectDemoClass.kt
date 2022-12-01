package com.kotlearn.kotlearn.objects

import android.util.Log

class ObjectDemoClass {

    //companion object is like Object (Singleton), is just that object are created independently.
    companion object {
        val x = 4
        fun displayTheValueOfX() {
            println(x)
        }
    }


    //using the Singleton Object
    fun getSingletonObject() {

        Log.i("SingletonObj", "${SingletonObject.x}")
        println(SingletonObject.y)
        println(SingletonObject.z)

        SingletonObject.addNum()
    }

}


class AnotherClass {

    fun getCompanionObj() {
        ObjectDemoClass.displayTheValueOfX()
    }
}