package com.kotlearn.kotlearn.encapsulation

class GettersAndSettersActivity {

    var width = 10
    var length = 10

    var x: Int = 0
        get() = initDefaults()
        set(value) {
            field = value
        }

    fun initDefaults() : Int {
        return 123
    }

    var z = 100
    get() = 100
    set(value) {
        if(value == 100) {
            println("its 100")
        }
        else {
            field = value
        }
    }



}


fun main() {
    val gettersAndSettersActivity = GettersAndSettersActivity()
    gettersAndSettersActivity.z = 100
    println("${gettersAndSettersActivity.x} ")
}