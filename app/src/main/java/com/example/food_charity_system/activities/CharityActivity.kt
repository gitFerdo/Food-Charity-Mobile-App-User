package com.example.food_charity_system.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.food_charity_system.R
import com.example.food_charity_system.databinding.ActivityCharityBinding

class CharityActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityCharityBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val navController = findNavController(R.id.charityHostFragment)
        binding.bottomNavigation.setupWithNavController(navController)

    }
}