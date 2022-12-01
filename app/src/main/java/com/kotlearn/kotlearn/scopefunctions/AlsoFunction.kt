package com.kotlearn.kotlearn.scopefunctions

class AlsoFunction {
    var name: String? = "Llander Lloyd Lim"
    var age: Int? = 22
}

fun main() {

/*also - ALSO PERFORM THE FOLLOWING EXTRA OPERATION
Property 1: Refer to context object by using 'it'
Property 2: The return value is the 'context object'*/

    val nameList: MutableList<String> = mutableListOf("Llander", "Marc", "Dale")

    //Operations on nameList
    //they both pointing on the same object
    val duplicateName = nameList.also {
        println(it)
        it.add("Lloyd")
        println(it)
        it.removeAt(1)
        println(it)
    }

    println("Original nameList : $nameList")
    println("Duplicate nameList : $duplicateName")

    //Other application using the class AlsoFunction()
    val person = AlsoFunction()

    person.also {
        it.name = "Lim Lloyd Llander"
        println("New name : ${it.name}") //Lim Lloyd Llander
    }


}
