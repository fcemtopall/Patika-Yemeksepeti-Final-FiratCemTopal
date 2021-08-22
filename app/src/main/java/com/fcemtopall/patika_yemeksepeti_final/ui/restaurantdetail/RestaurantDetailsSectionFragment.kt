package com.fcemtopall.patika_yemeksepeti_final.ui.restaurantdetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fcemtopall.patika_yemeksepeti_final.R
import com.fcemtopall.patika_yemeksepeti_final.databinding.FragmentRestaurantDetailsSectionBinding
import com.fcemtopall.patika_yemeksepeti_final.models.entity.restaurant.Restaurant

class RestaurantDetailsSectionFragment(var restaurant: Restaurant) : Fragment() {
    private lateinit var _binding: FragmentRestaurantDetailsSectionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRestaurantDetailsSectionBinding.inflate(inflater, container, false)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setData()
    }

    fun setData() {
        _binding.deliveryInfoTextView.text = restaurant.deliveryInfo
        _binding.deliveryTimeTextView.text = restaurant.deliveryTime
        _binding.minimumDeliveryFeeTextView.text = restaurant.minimumDeliveryFee
        _binding.paymentTextView.text = restaurant.paymentMethods
    }

}