package com.example.fooddeliveryapp.ui.meal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager

import com.fcemtopall.patika_yemeksepeti_final.databinding.FragmentMealListBinding
import com.fcemtopall.patika_yemeksepeti_final.models.entity.food.Food
import com.fcemtopall.patika_yemeksepeti_final.models.entity.restaurant.Restaurant
import com.fcemtopall.patika_yemeksepeti_final.ui.meal.IMealOnClick
import com.fcemtopall.patika_yemeksepeti_final.ui.meal.MealsListAdapter
import com.fcemtopall.patika_yemeksepeti_final.ui.restaurantdetail.RestaurantDetailsFragment
import com.fcemtopall.patika_yemeksepeti_final.ui.restaurantlisting.RestaurantListingFragmentDirections
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MealListFragment(
    private val restaurant: Restaurant
) : Fragment(), IMealOnClick {
    private var adapter: MealsListAdapter = MealsListAdapter()
    private lateinit var _binding: FragmentMealListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMealListBinding.inflate(inflater, container, false)
        return _binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding.mealsListRecyclerView.layoutManager = LinearLayoutManager(context)
        adapter.setMealList(restaurant.meals)
        adapter.addListener(this)
        _binding.mealsListRecyclerView.adapter = adapter
    }


    override fun onClick(meal: Food) {
        val action =
            RestaurantListingFragmentDirections.actionHomeFragmentToRestaurantDetailFragment(
                meal.id,

                )
        findNavController().navigate(action)
    }


}