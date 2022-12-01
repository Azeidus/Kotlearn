package com.kotlearn.kotlearn.objects



//we usually use Singleton objects for  one instance of the class like NetworkService, DatabaseService, etc.
//only one instance of the class can create and we can use that instance everywhere.

object SingletonObject {

    var x = 1
    var y = 2
    var z = 3

    fun addNum() {
        var sum = x + y + z
    }

}