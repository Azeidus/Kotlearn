package com.kotlearn.kotlearn.scopefunctions

class WithFunction {
    var name:String = "Llander"
    var age:Int = 22
}

fun main() {

/*with - Return: lambda result | Context object : this
 Property 1: Refer to context object by using 'this'  - WithFunction
 Property 2: The return value is the 'lambda result'  - This is the lambda result
*/
    val withFunc = WithFunction()

    val withFunction = with(withFunc) {
        this.name = "Lloyd"
        this.age = 25
        "This is the lambda result"
    }

    println(withFunction + withFunc.name + withFunc.age) //This is the lambda result Lloyd 25


}


