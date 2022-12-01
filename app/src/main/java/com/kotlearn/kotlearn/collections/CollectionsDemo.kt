package com.kotlearn.kotlearn.collections

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kotlearn.kotlearn.R
import com.kotlearn.kotlearn.databinding.ActivityCollectionsDemoBinding

class CollectionsDemo : AppCompatActivity() {
    private lateinit var binding:ActivityCollectionsDemoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCollectionsDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //Arrays
        var myArray = Array<Int>(5) { 0 } //Mutable. Fixed Size.
        myArray[2] = 12

        for(i in myArray) {
            Log.i("myArrayyyyyy", i.toString())
        }

        //List
        var list = listOf<String>("Llander", "Marc", "Dale") //Immutable. Fixed Size, READ ONLY

        var mutableList = mutableListOf<String>("Llander", "Marc", "Dale") //Mutable.
        var list1 = arrayListOf<String>() //Mutable.
        var list2 = ArrayList<String>() //Mutable.

        mutableList[0] = "Lloyd"
        mutableList.add("Lim")
        mutableList.add(1, "Pogi")
        mutableList.remove("Lloyd")
        Log.i("mutableListSize", mutableList.size.toString())
        Log.i("mutableList", mutableList.toString())

        for(item in mutableList) {
            Log.i("mutListItems", item.toString())
        }

        list1.forEach {
            Log.i("forEachDisplayArray", it)
        }

        //Hashmap
        var myMap = mapOf<Int,String>(2 to "Llander", 43 to "Dale", 22 to "Marc") //Immutable, Fixed Size, READ ONLY


        var map = HashMap<Int, String>()
        map.put(1,"Llander")
        map.put(2,"Dale")
        map.put(3,"Marc")

        for(i in map) {
            Log.i("mappp", i.toString())
        }

        for(i in myMap) {
            Log.i("myMap", i.toString())
        }


        //"set" contains unique elements (means no duplication)
        var mySet = setOf<Int>(2 , 52 , 1 ,2 ,3 , 4, 4, 4 , 6 , 8) //Immutable. READ Only

            Log.i("mySettt", mySet.toString())  // 2 , 52 , 1, 3 , 4 , 6 , 8


        var myMutableSet = mutableSetOf<Int>(2,52,1,2,3,4,4,4,6,8) //Mutable. READ and WRITE
        myMutableSet.remove(2)
        myMutableSet.add(120)


        // "HashSet" also contains unique elements but SEQUENCE is not guaranteed in output
        var hashSet = hashSetOf<Int>(2 , 52 , 1 ,2 ,3 , 4, 4, 4 , 6 , 8) //Immutable. READ Only
        Log.i("hashSettt", hashSet.toString())


        //filtering and displaying only the names with letter M
        val names = listOf("Llander" , "Lloyd", "John", "Gian", "Dale", "Marc", "Ivan", "Reynaldo", "Marie", "Minato")
        val filteredNames = names.filter { it.contains("M") } //Minato , Marc, Marie
        Log.i("filteredList", filteredNames.toString())


        //filtering age >= 18
        val age = listOf<Int>(1,22,3,4,5,6,7,8,32,21)
        val adults = age.filter { it >= 18 }
        Log.i("adults", adults.toString())


        val emptyArray: ArrayList<String> = ArrayList()
        val emptyArray1: ArrayList<String> = arrayListOf()

    }

}