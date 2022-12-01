package com.kotlearn.kotlearn.basics

//Lambda Function is like a function without a name (textbook definition)
class Program {

    val myLambdaFunction : (Int) -> String = { parameter ->
        "Print this number $parameter"
    }

    fun highLevelFunctionExample(num1: Int, num2: Int, function : (Int) -> String ) {
        println(function(2) + "$num1 $num2" )
    }


}
fun main() {

    //Lambda Function with return

    //input type first then return type
    val rectangle: (String) -> String = { returnString ->
        "String $returnString"
    }
    println(rectangle("HEHE"))


    //Lambda Function without return
    val printName: (String) -> Unit = {
        println(it)
    }
    printName("Llander")


    //Function with return type
    fun rectangle(rec: String): String {
        return "String $rec"
    }
    println(rectangle("HEHE"))


    /*HIGH LEVEL FUNCTIONS
       - Can accept FUNCTIONS as PARAMETERS
       - Can return a Function
       - Or can do both
        */

    val program = Program()
    println(program.highLevelFunctionExample(1,2,program.myLambdaFunction))






}