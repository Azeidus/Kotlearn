package com.kotlearn.kotlearn.sealed

sealed class SealedClassDemo {
    data class Success(val data: String) : SealedClassDemo()
    data class Error(val error: String) : SealedClassDemo()
    object Loading : SealedClassDemo()

}

fun getData() : SealedClassDemo {
    return SealedClassDemo.Success((100..1000).random().toString())
}

fun main() {
val data = getData()
    when(data){
        is SealedClassDemo.Success -> {
            print(data)
        }
        is SealedClassDemo.Error -> {
            print(data)
        }
        is SealedClassDemo.Loading -> {
            print(data)
        }
    }
}