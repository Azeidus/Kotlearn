package com.kotlearn.kotlearn.lazydelegate

class LazyDemo { }

fun main() {

    /*

  - Lazy initialization was designed to prevent unnecessary initialization of objects.
  - Your variables will not be initialized unless you use it in your code.
  - It is initialized only once. Next time when you use it, you get the value from cache memory.
  - It will not allocate memory if the object is not used.

  - It is thread safe
  - It is initialized in the thread where it is used for the first time
  - Other threads use the same value stored in the cache


  */

    val sampleNumber by lazy {
        val sum = 123 + 100

        sum
    }

    println(sampleNumber)

}