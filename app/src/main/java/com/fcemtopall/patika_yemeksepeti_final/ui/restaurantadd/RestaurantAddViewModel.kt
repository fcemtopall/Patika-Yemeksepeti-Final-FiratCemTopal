package com.fcemtopall.patika_yemeksepeti_final.ui.restaurantadd

import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.fcemtopall.patika_yemeksepeti_final.models.ApiRepository
import com.fcemtopall.patika_yemeksepeti_final.models.entity.addRestaurant.RestaurantAddRequest
import com.fcemtopall.patika_yemeksepeti_final.models.entity.addRestaurant.RestaurantAddResponse
import com.fcemtopall.patika_yemeksepeti_final.utils.Resource
import javax.inject.Inject

class RestaurantAddViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val apiRepository: ApiRepository
) : ViewModel() {

    fun addRestaurant(
        name: String,
        cuisine: String,
        deliveryInfo: String,
        deliveryTime: String,
        imageUrl: String,
        address: String,
        district: String,
        minDeliveryFee: String,
        paymentMethods: String,
        phone: String,
        website: String,
    ): LiveData<Resource<RestaurantAddResponse>> {

        val request = RestaurantAddRequest(
            name, cuisine, deliveryInfo, deliveryTime,
            imageUrl, address, district, minDeliveryFee, paymentMethods, phone, website
        )

        return apiRepository.postRestaurant(request)

    }




}