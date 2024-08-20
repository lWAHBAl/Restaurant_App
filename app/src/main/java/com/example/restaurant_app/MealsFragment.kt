package com.example.restaurant_app
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationapp.City
import com.example.restaurant_app.databinding.MealsFragmentBinding
class MealsFragment :Fragment(),MealsAdapter.MealClickListener {

    lateinit var binding: MealsFragmentBinding
    var meals: MutableList<Meal> = mutableListOf()
    lateinit var mealsAdapter: MealsAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= MealsFragmentBinding.inflate(inflater,container,false)

        meals= mutableListOf(
            Meal("Burger", R.drawable.burger),
            Meal("Steak",R.drawable.filletsteak),
            Meal("Pancakes",R.drawable.pancakes),
            Meal("Pizza",R.drawable.pizza),
            Meal("Shawerma",R.drawable.shawerma),
            Meal("Waffles",R.drawable.waffles)
        )


        mealsAdapter=MealsAdapter(meals,this)

        binding.MealsRv.adapter=mealsAdapter

        return binding.root
    }

    override fun onMealClicked(myMeal: Meal) {
        val action = MealsFragmentDirections.actionMealsFragment2ToMealDetailsFragment(myMeal)
        findNavController().navigate(action)
    }
}