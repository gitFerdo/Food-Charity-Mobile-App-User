package com.example.food_charity_system.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.food_charity_system.databinding.LayoutCharityItemBinding
import com.example.food_charity_system.viewmodel.AddCharityModel

class CharityAdapter(val context: Context, val list: ArrayList<AddCharityModel>)
    : RecyclerView.Adapter<CharityAdapter.CharityViewHolder>(){

    inner  class CharityViewHolder(val binding: LayoutCharityItemBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharityViewHolder {
        val binding = LayoutCharityItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return CharityViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: CharityViewHolder, position: Int) {
        val data = list[position]

        Glide.with(context).load(data.charityCoverImg).into(holder.binding.imageView2)
        holder.binding.textView4.text = data.charityName
        holder.binding.textView3.text = data.charityDes
        holder.binding.textView2.text = data.charityPrice


    }
}