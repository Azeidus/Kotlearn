package com.kotlearn.kotlearn.oop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlearn.kotlearn.R

class AbstractionDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abstraction_demo)

        val animals = Animals()
        animals.animalSound()
    }
}