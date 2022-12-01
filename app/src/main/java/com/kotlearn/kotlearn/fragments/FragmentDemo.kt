package com.kotlearn.kotlearn.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.kotlearn.kotlearn.R
import com.kotlearn.kotlearn.databinding.ActivityFragmentDemoBinding

class FragmentDemo : AppCompatActivity() {

    private lateinit var binding:ActivityFragmentDemoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFragmentDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer,firstFragment)
            commit()
        }

        binding.btnFrag1.setOnClickListener {
            replaceFragment(firstFragment)
        }
        binding.btnFrag2.setOnClickListener {
            replaceFragment(secondFragment)
        }
    }

    fun replaceFragment(fragment : Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, fragment)
            commit()
        }
    }

    fun passingDataFragmentToFragment(){


    }
}
