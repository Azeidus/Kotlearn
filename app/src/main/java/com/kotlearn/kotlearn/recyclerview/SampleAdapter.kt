package com.kotlearn.kotlearn.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kotlearn.kotlearn.databinding.ItemRowBinding

class SampleAdapter(val items: MutableList<SampleModel>) :
    RecyclerView.Adapter<SampleAdapter.SampleViewHolder>(){


    private lateinit var binding: ItemRowBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = ItemRowBinding.inflate(inflater,parent,false)
        return SampleViewHolder(binding)


    }

    override fun onBindViewHolder(holder: SampleViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

  inner class SampleViewHolder(itemView: ItemRowBinding) : RecyclerView.ViewHolder(itemView.root){
        fun bind(item : SampleModel){
            binding.apply {
                tvId.text = item.id.toString()
                tvName.text = item.name
            }
        }

    }


}