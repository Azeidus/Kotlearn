package com.kotlearn.kotlearn.abstract

/*
- Classes can be ABSTRACT in nature.
- The role of ABSTRACT CLASS is to just provide set of methods and properties.
- Abstract Class are partially defined class.
- You cannot create instance/objects of ABSTRACT class.
- You need to override ABSTRACT methods, properties inside Derived class.
*/

abstract

class AbstractDemo { // you cannot create instance of abstract class


    abstract var name: String //abstract variable and function should be empty

    abstract fun eat() //abstract properties are "open" by default
    open fun getHeight() { println("get height") } // A "open" function ready to be overridden
    fun goToSchool() {} //A Normal function: public and final by default (final means you cant override it)
}

class Person : AbstractDemo() {
    override var name: String = "dummy"

    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun getHeight() {
        super.getHeight()
    }





}

