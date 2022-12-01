package com.kotlearn.kotlearn.oop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlearn.kotlearn.R

class OOPDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oopdemo)

        //Abstraction
        val animals = Animals()
        animals.animalSound()

        //Polymorphism and Inheritance
        val dog = Dog()
        dog.animalSound()

        val cat = Cat()
        cat.animalSound()
    }
}