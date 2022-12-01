package com.kotlearn.kotlearn.extensions

import android.content.Context
import android.util.Log
import android.widget.Toast

/*
*      EXTENSIONS
*      - Extensions is a file contains of functions that you want to reuse anywhere in your project
*      - All functions you add here became global
*      - You also don't need to inherit the extension file to use it
*      - It works like static methods
*      - Also useful for a library you use that you can't modify. Just add new functions on it's extension file
*/

/*
*      CREATING EXTENSIONS
*      - New -> Kotlin Class/File -> File -> Name file to Extensions.kt
*      - Remember to only have one extension file per module or per app
*/


fun showToast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()

}

fun showLog(message: String) {
    Log.i("l0g", message)
}


fun remainder(n1: Int, n2: Int): Int {
    return n1 % n2
}

