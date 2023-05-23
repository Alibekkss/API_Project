package com.example.apitesting

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apitesting.databinding.AdapterMainItemBinding
import com.example.apitesting.model.Naruto

class MainActivityAdapter(): RecyclerView.Adapter<MainActivityAdapter.ViewHolder>() {
    private lateinit var listApi: List<Naruto.NarutoItem>

    inner class ViewHolder(private val binding: AdapterMainItemBinding ) :
        RecyclerView.ViewHolder(binding.root) {
        fun initContent(item:Naruto.NarutoItem){
            binding.MainTextView.text = item.character
            binding.adapterMainText.text = item.quote
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = AdapterMainItemBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = listApi.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.initContent(listApi[position])
    }

    fun submitList(list : List<Naruto.NarutoItem>){
        listApi = list
    }
}
