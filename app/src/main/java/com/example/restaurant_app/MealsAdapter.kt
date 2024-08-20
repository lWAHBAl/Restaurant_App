package com.example.restaurant_app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurant_app.databinding.ItemMealBinding

class MealsAdapter(val data :List<Meal>,val mealClickListener:MealClickListener) : ListAdapter<Meal, MealsAdapter.MyViewHolder>(MealItemDiffCallback()){

    class MyViewHolder(val binding: ItemMealBinding) : RecyclerView.ViewHolder(binding.root) {
        companion object{
            fun from(parent: ViewGroup) : MyViewHolder{
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemMealBinding.inflate(layoutInflater,parent,false)
                return MyViewHolder(binding)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder.from(parent)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    interface MealClickListener {
        fun onMealClicked(myMeal:Meal)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.meal=data.get(position)
        holder.binding.mealImage.setImageResource(data.get(position).imageId)
        holder.binding.root.setOnClickListener {
            mealClickListener.onMealClicked(data.get(position))
        }
    }


}
class MealItemDiffCallback: DiffUtil.ItemCallback<Meal>() {
    override fun areItemsTheSame(oldItem: Meal, newItem: Meal): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Meal, newItem: Meal): Boolean {
        return oldItem == newItem
    }

}