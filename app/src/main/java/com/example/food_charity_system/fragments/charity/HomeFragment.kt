package com.example.food_charity_system.fragments.charity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.food_charity_system.adapters.CategoryAdapter
import com.example.food_charity_system.adapters.CharityAdapter
import com.example.food_charity_system.databinding.FragmentHomeBinding
import com.example.food_charity_system.viewmodel.AddCharityModel
import com.example.food_charity_system.viewmodel.CategoryModel
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class HomeFragment: Fragment() {
    private  lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        getCategory()
        getSliderImage()
        getCharities()
        return binding.root
    }

    private fun getSliderImage() {
        Firebase.firestore.collection("slider").document("it")
            .get().addOnSuccessListener {
                Glide.with(requireContext()).load(it.get("img")).into(binding.sliderImage)
            }
    }

    private fun getCharities() {
        var list = ArrayList<AddCharityModel>()
        Firebase.firestore.collection("charities")
            .get().addOnSuccessListener {
                list.clear()
                for (doc in it.documents) {
                    val data = doc.toObject(AddCharityModel::class.java)
                    list.add(data!!)
                }
               binding.charityRecycler.adapter = CharityAdapter(requireContext(), list)
            }
    }

    private fun getCategory() {
        var list = ArrayList<CategoryModel>()
        Firebase.firestore.collection("categ")
            .get().addOnSuccessListener {
                list.clear()
                for (doc in it.documents) {
                    val data = doc.toObject(CategoryModel::class.java)
                    list.add(data!!)
                }
                binding.categoryRecycler.adapter = CategoryAdapter(requireContext(), list)
            }
    }
}