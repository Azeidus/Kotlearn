package com.kotlearn.kotlearn.logics

class LargestElement {

}
fun main() {
    val num = doubleArrayOf(10.4, 34.2, 55.0, 23.4 )
    var largest = num[0]

    for(i in num) {
        if (largest < i)
            largest = i
    }

    println(largest)
}