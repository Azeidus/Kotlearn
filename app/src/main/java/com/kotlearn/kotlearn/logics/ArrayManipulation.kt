package com.kotlearn.kotlearn.logics

class ArrayManipulation {

}
fun main() {
    val num = arrayListOf<Int>(1, 2, 3, 4, 5, 6)
    var largest = num[0]
    var even : Int
    var odd : Int
    var oneNum = 1

    for (i in num) {
        if (largest < i) {
            largest = i
        }
    }

    println(largest)

    for (i in num) {
        if(i % 2 == 0) {
            even = i
            println("Even $even")
        }
        else  {
            odd = i
            println("Odd $odd")
        }
    }

    for(oneNum in 1..6){
        print(" $oneNum")
    }






}
