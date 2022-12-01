package com.kotlearn.kotlearn.`interface`


interface InterfaceDemo { //interface cannot be instantiated in a class. It should be extended.

    var name:String // properties that are abstract by default and should not contain initialized value

    fun interfaceDemo() {
        println("print interfaceDemo") //default
    }

    fun interfaceFunctionWithoutBody() //you will put the functionalities


}

class getInterface: InterfaceDemo {
    override var name: String
        get() = TODO("Not yet implemented")
        set(value) {} //ALL FUNCTIONS FROM INTERFACE THAT HAS NO BODY MUST BE OVERRIDDEN

    override fun interfaceDemo() {
        super.interfaceDemo()
    }

    override fun interfaceFunctionWithoutBody() {
        // codes
        println("something")
    }

}


fun main(){

    val getInterface = getInterface()
    getInterface.interfaceDemo()

}