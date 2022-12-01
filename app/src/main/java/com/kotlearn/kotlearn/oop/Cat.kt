package com.kotlearn.kotlearn.oop

import android.util.Log

//Inheritance - Dog class inherits the Animals class
class Cat : Animals() {

    override fun animalSound() {
        Log.i("animalSound", "MEOW MEOW!")
    }

}