package com.kotlearn.kotlearn.logics

class ForLoop {
}

fun main(){
    for(x in 1..100) {
       if (x % 2 == 0) {
           println("this are the even numbers $x")
       } else println("this are the odd numbers $x")
    }


    val x = mutableListOf<String>("Llander", "Marc", "Dale")
    x.forEach {
        println(it)
    }
}