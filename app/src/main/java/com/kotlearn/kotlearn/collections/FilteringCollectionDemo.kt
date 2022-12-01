package com.kotlearn.kotlearn.collections

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kotlearn.kotlearn.databinding.ActivityFilteringCollectionDemoBinding

class FilteringCollectionDemo : AppCompatActivity() {

    private lateinit var binding:ActivityFilteringCollectionDemoBinding
    val names = listOf<String>("Llander","John","Dale","Marc","Doe", "Minato", "Luffy")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        checkAge()

        binding = ActivityFilteringCollectionDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvText.text = names.toString()
        onClicks()

    }

    private fun onClicks() {
        binding.btnFilter.setOnClickListener {
            val filteredNames = names.filter { it.contains("M") }
            binding.tvShowFilteredText.text = filteredNames.toString()

        }
    }


    //when is like Switch case is Java
    fun checkAge() {
        val age = 18

        when(age) {
            in 0..13 -> Log.i("whenTag", "CHILD")
            in 13..18 -> Log.i("whenTag", "TEENAGER")
            else -> Log.i("whenTag", "ADULT")

        }
    }


}