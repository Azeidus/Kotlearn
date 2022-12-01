package com.kotlearn.kotlearn.scopefunctions

class RunFunction {
    val name:String? = "Llander"

    fun demoFunc() {
        println("demoFunc : $name")
    }

}

fun main() {
    //run - Return value : lambda result | Context object : this
    /* 'run' is a combination of 'let' and 'with'
        If you want to operate on a Nullable object and avoid NullPointerException then use 'run'
    */

    val runFunc: RunFunction? = RunFunction()

    val runF = runFunc?.run {
        println(runFunc.name)
        this.demoFunc()
        this.name + " lambda result"
    }

    println(runF) //Llander lambda result

}

