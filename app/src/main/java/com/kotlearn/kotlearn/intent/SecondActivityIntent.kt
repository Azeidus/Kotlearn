package com.kotlearn.kotlearn.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlearn.kotlearn.databinding.ActivitySecondIntentBinding

class SecondActivityIntent : AppCompatActivity() {

    private lateinit var binding: ActivitySecondIntentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent.getStringExtra("IntentNAME")
        binding.tvString.text = i.toString()



    }
}