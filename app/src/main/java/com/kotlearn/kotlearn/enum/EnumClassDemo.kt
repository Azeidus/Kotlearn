package com.kotlearn.kotlearn.enum

import com.kotlearn.kotlearn.dependencyinjection.DependencyInjectionDemo

//enum classes holds constant value (a fixed value)
//enum classes use to store same type constant values
//enum class can implement interfaces. But they cannot inherit from abstract classes or open classes


enum class CreditCardType {
    //Each enum object has two properties : ordinal and name
    SILVER,     //ordinal = 0      name ="SILVER"
    GOLD,       //ordinal = 1      name ="GOLD"
    PLATINUM    //ordinal = 2      name ="PLATINUM"
}


enum class RGBColors(val colorShade: String) {
    //RED, BLUE, and GREEN are the enum constants
    //Enum constants are objects of enum class type
    RED("LIGHT RED"),
    BLUE("LIGHT BLUE"),
    GREEN("LIGHT GREEN")
}


fun main() {
    //Each enum object has two methods: values() and valueOf()
    val userCardType:CreditCardType = CreditCardType.GOLD
    val myConstants: Array<CreditCardType> = CreditCardType.values()
    myConstants.forEach { println(it) }

    println(CreditCardType.SILVER.ordinal) //0
    println(CreditCardType.SILVER.name) //SILVER
    println(CreditCardType.SILVER) // OR CreditCardType.SILVER.name

    //use in when statement
    when(userCardType){
        CreditCardType.SILVER -> println("User has silver card")
        CreditCardType.GOLD -> println("User has gold card")
        CreditCardType.PLATINUM -> println("User has platinum card")
    }

}


