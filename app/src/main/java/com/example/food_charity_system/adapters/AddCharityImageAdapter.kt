package com.example.food_charity_system.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.food_charity_system.databinding.LayoutCharityItemBinding
import com.example.food_charity_system.viewmodel.AddCharityModel

class AddCharityImageAdapter(val list: ArrayList<AddCharityModel>)
    : RecyclerView.Adapter<AddCharityImageAdapter.AddCharityImageViewHolder>() {
    inner class AddCharityImageViewHolder(val binding : LayoutCharityItemBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddCharityImageViewHolder {
        val binding = LayoutCharityItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AddCharityImageViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: AddCharityImageViewHolder, position: Int) {
        holder.binding.imageView2.setImageURI(list[position])
    }
}

private fun ImageView.setImageURI(addCharityModel: AddCharityModel) {
    TODO("Not yet implemented")
}
