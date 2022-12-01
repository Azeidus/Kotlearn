package com.kotlearn.kotlearn.scopefunctions

class LetFunction {
}

class Person {

}

fun main() {

    /*let - Return: lambda result | Context Object: it
    Property 1: Refer to the context object using 'it'
    Property 2: The return value is the 'lambda result'
    */

    //Use let function to avoid NullPointerException

    val name:String? = "Llander"

    val stringLength = name?.let {
        println(it!!.reversed())
        println(it.capitalize())
        println(it.length)
        it.length //return value
    }

    println(stringLength)



}