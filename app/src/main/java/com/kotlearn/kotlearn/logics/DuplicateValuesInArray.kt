package com.kotlearn.kotlearn.logics

import kotlin.properties.Delegates

class DuplicateValuesInArray {}

fun main() {
    val numList: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 7)
    val distincNumList = numList.distinct()


    println(distincNumList)

}
