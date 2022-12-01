package com.kotlearn.kotlearn.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.kotlearn.kotlearn.R
import com.kotlearn.kotlearn.databinding.ActivityRetroMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://jsonplaceholder.typicode.com/"

class RetroMainActivity : AppCompatActivity() {

    lateinit var myAdapter: MyAdapter
    lateinit var linearLayoutManager : LinearLayoutManager

    private lateinit var binding:ActivityRetroMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRetroMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvUsers.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(this)
        binding.rvUsers.layoutManager = linearLayoutManager

        getMyData()


    }

    private fun getMyData() {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(ApiInterface::class.java)

        val retrofitData = retrofitBuilder.getData()

        // ctrl + shift + space to generate all the code needed
        retrofitData.enqueue(object : Callback<List<MyDataItem>?> {
            override fun onResponse(call: Call<List<MyDataItem>?>, response: Response<List<MyDataItem>?>) {
                val responseBody = response.body()!!
                myAdapter = MyAdapter(baseContext,responseBody)
                myAdapter.notifyDataSetChanged()
                binding.rvUsers.adapter = myAdapter
            }

            override fun onFailure(call: Call<List<MyDataItem>?>, t: Throwable) {
                //onFailure : mostly because of the internet connection
            }
        })
    }


}