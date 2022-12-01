package com.kotlearn.kotlearn

class TryInit {
    init {
        print("This is TryInit class ")
    }

    var x: Int = 10
}


fun main() {


    val tryInitDelegate = lazy {
        TryInit()
    }

    val tryInit by tryInitDelegate



    println("Is tryinit initialized? " + tryInitDelegate.isInitialized())
    println(tryInit.x)
    println("Is tryinit initialized? " +tryInitDelegate.isInitialized())

}