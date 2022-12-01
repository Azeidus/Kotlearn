package com.kotlearn.kotlearn.basics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kotlearn.kotlearn.R

class VariablesAndFunctions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_variables_and_functions)


        var wholeNumber : Int = 10
        var myByte: Byte = 100
        var myShort: Short = 5000
        var myLong: Long = 15000000000L
        var decimalNumber : Float = 10.1234567F
        var doubleNumber : Double = 10.1234567891
        val charSequence : String = "Llander"
        val oneChar : Char = 'L'
        var bool : Boolean = true


        diffOfTwoNum()
        Log.i("varrr", "$wholeNumber, $myByte, $myShort, $myLong, $decimalNumber, $doubleNumber, $charSequence, $oneChar, $bool")
        Log.i("summm", getSumOfTwoNum(2,3).toString())
        Log.i("proddd", prodOfTwoNum(2,5).toString())


    }
    //function with a return type of Int
    fun getSumOfTwoNum(num1 : Int, num2 : Int): Int {
        return num1 + num2
    }

    //functions with parameters
    fun prodOfTwoNum(num1 : Int, num2 : Int) {
        var prod : Int
        prod = num1 * num2

        Log.i("prod", "The product is $prod")
    }

    //functions with a default arguments
    fun diffOfTwoNum(num1 : Int = 2, num2: Int = 1) {
        var diff = num1 - num2
        Log.i("diff", "The difference of 2 numbers is $diff")
    }




}