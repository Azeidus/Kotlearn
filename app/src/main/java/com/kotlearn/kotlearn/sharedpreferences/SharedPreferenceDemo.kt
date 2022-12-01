package com.kotlearn.kotlearn.sharedpreferences

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlearn.kotlearn.databinding.ActivitySharedPreferenceDemoBinding
import com.kotlearn.kotlearn.extensions.showToast


/*
SharedPreferences is use to store and caches the data. It is use to store information that
will usually display whenever you open the application. It is a key-value pairs and provides simple
methods to read and write them.
*/

class SharedPreferenceDemo : AppCompatActivity() {

    private lateinit var binding: ActivitySharedPreferenceDemoBinding
    private lateinit var sharedPreferences: SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySharedPreferenceDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClicks()
    }

    private fun onClicks() {
        binding.btnSave.setOnClickListener { saveData() }
        binding.btnLoad.setOnClickListener { loadData() }
    }

    private fun saveData() {
        sharedPreferences = getSharedPreferences("myPref", MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        val et1 = binding.etText.text.toString()
        val et2 = binding.etText2.text.toString()


        if(et1.isEmpty() && et2.isEmpty()){
            showToast(this, "Please fill up all the fields")
        } else {
            editor.putString("edit_text1", et1)
            editor.putString("edit_text2", et2)
            editor.apply()
            binding.etText.text.clear()
            binding.etText2.text.clear()
            showToast(this, "Information Saved!")
        }
    }

    private fun loadData() {
        sharedPreferences = getSharedPreferences("myPref", MODE_PRIVATE)
        val edit1 = sharedPreferences.getString("edit_text1", null)
        val edit2 = sharedPreferences.getString("edit_text2", null)

        if(edit1.isNullOrEmpty() && edit2.isNullOrEmpty()) {
            showToast(this, "Empty")
        } else {
            binding.etText.setText(edit1)
            binding.etText2.setText(edit2)
            Toast.makeText(this, edit1, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, edit2, Toast.LENGTH_SHORT).show()
        }

        }
}