package com.kotlearn.kotlearn.retrofit

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kotlearn.kotlearn.databinding.ActivityRetroMainBinding

import com.kotlearn.kotlearn.databinding.RowItemsBinding

class MyAdapter(val context: Context, val userList: List<MyDataItem>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    private lateinit var binding: RowItemsBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = RowItemsBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        binding.tvId.text = userList[position].id.toString()
        binding.tvTitle.text = userList[position].title
        binding.tvBody.text = userList[position].body
    }

    override fun getItemCount(): Int {
         return userList.size
    }

    class ViewHolder(itemView: RowItemsBinding) : RecyclerView.ViewHolder(itemView.root) { }

}