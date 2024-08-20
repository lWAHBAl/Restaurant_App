package com.example.restaurant_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.restaurant_app.databinding.MealDetailsFragmentBinding


class MealDetailsFragment() :Fragment()  {
    lateinit var binding: MealDetailsFragmentBinding
    private val arg : MealDetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val meal = arg.meal
        binding= MealDetailsFragmentBinding.inflate(inflater,container,false)
        binding.mealIV.setImageResource(meal.imageId)
        binding.name=meal.name
        return binding.root
    }

}

