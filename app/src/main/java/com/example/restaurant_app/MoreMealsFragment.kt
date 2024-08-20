package com.example.restaurant_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.restaurant_app.databinding.MoreMealsFragmentBinding

class MoreMealsFragment :Fragment() {
  private lateinit var binding: MoreMealsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= MoreMealsFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }
}