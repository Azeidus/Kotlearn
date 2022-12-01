package com.kotlearn.kotlearn.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kotlearn.kotlearn.R
import com.kotlearn.kotlearn.databinding.ActivityRecyclerViewDemoBinding

class RecyclerViewDemo : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerViewDemoBinding

    private var nameList : MutableList<SampleModel> = mutableListOf()
    private lateinit var sampleAdapter: SampleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData()
        initRecyclerView()

    }


//        binding.apply{
//            rvMain.apply{
//                layoutManager = LinearLayoutManager(this@RecyclerViewDemo)
//                adapter = sampleAdapter
//            }
//        }

    fun initRecyclerView() {
        sampleAdapter = SampleAdapter(nameList)
        binding.rvMain.layoutManager = LinearLayoutManager(this)
        binding.rvMain.adapter = sampleAdapter
    }


    fun loadData() {
        nameList.add(SampleModel(1, "Llander"))
        nameList.add(SampleModel(2, "Marc"))
        nameList.add(SampleModel(3, "Dale"))
        nameList.add(SampleModel(4, "John"))
        nameList.add(SampleModel(5, "Doe"))
    }
}


