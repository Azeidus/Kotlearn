package com.kotlearn.kotlearn.viewbinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kotlearn.kotlearn.databinding.ActivityViewBindingDemoBinding


class ViewBindingDemo : AppCompatActivity() {

    private lateinit var binding: ActivityViewBindingDemoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityViewBindingDemoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.btnSubmit.setOnClickListener {
            val name = binding.etMsg.text.toString()
            binding.tvMsg.text = name


        }

    }
}