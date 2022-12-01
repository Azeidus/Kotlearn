package com.kotlearn.kotlearn.logics

class Palindrome {}

val str = "Racecar"

fun isPalindrome() : Boolean{
    return str.lowercase().equals(str.reversed().lowercase())
}

fun main(){
    if(isPalindrome()){
        println("The word $str is a Palindrome")
    }
    else println("The word $str is not a Palindrome")

}