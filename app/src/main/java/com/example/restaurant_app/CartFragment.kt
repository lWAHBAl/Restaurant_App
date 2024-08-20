package com.example.restaurant_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.restaurant_app.databinding.CartFragmentBinding

class CartFragment :Fragment() {
    lateinit var binding: CartFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= CartFragmentBinding.inflate(inflater,container,false)

        return binding.root
    }
}