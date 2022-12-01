package com.kotlearn.kotlearn.basics

class ModifiersDemo {
    fun main() {
       /* Visibility Modifiers
        private : Only for classes
        public : Everywhere (Outside the modules also)
        protected : Can only use within subclasses
        internal : Everywhere (but not outside the modules) */
    }
}
//use "open" keyword to make it accessible
open class MyDemo {
    public var a = "public"
    private var b = "private" //private can only be access inside the class
    protected var c = "protected"
    internal var d = "internal"
}

class MyClass : MyDemo(){
    fun test() {
//        var myObj = MyDemo() //creating an object
        print(a)
//        print(b) //private can only be access inside the class
//        print(myObj.c) //protected can only use within subclasses
        print(c)
        print(d)
    }

}