package com.example.food_charity_system.fragments.loginRegister

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.food_charity_system.R
import com.example.food_charity_system.databinding.FragmentInroductionBinding
import com.example.food_charity_system.databinding.FragmentRegisterBinding

class IntoductionFragment: Fragment(R.layout.fragment_inroduction) {
    private lateinit var binding: FragmentInroductionBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInroductionBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonStart.setOnClickListener {
            findNavController().navigate(R.id.action_intoductionFragment2_to_accountOptionsFragment2)
        }
    }
}