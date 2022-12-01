package com.kotlearn.kotlearn.scopefunctions

//Scope functions makes your code concise and readable

class ApplyFunction {
    var name: String? = null
    var age: Int? = null
}

fun main() {

    /*  val person = Person()
      person.name = "Llander Lim"
      person.age = 22 */

    //to avoid repetition of using "person" you can use apply
    /* apply - Return: context object | Context object: this
     Property 1: Refer to context object by using 'this'  - Person
     Property 2: The return value is the 'context object' - Person object
     */

    val person = ApplyFunction().apply {
        name = "Llander"
        age = 22
    }

    println(person.name + person.age)//Llander22

}