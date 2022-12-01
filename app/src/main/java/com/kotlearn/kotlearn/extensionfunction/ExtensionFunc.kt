package com.kotlearn.kotlearn.extensionfunction

class ExtensionFunc { }

//Example of extension function
fun String.getAllWords(): List<String> {
    return this.split(" ")
}

//Another example of extension function
fun Int.plusFive() : Int {
    return this.plus(5)
}

//Extension function - we are creating a function to a class that we can't modify
fun main() {


    val a : String = "Llander Lloyd Lim"
    val words = a.getAllWords()
    val num1 = 20

    println(num1.plusFive())
    print(words)
}