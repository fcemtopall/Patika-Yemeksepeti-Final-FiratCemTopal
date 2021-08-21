package com.fcemtopall.patika_yemeksepeti_final.models.remote

import com.fcemtopall.patika_yemeksepeti_final.models.entity.addFood.FoodAddRequest
import com.fcemtopall.patika_yemeksepeti_final.models.entity.addRestaurant.RestaurantAddRequest
import com.fcemtopall.patika_yemeksepeti_final.models.entity.order.OrderAddRequest
import com.fcemtopall.patika_yemeksepeti_final.models.entity.profile.UserRequest
import com.fcemtopall.patika_yemeksepeti_final.utils.BaseDataSource
import javax.inject.Inject

class AuthRemoteDataSource @Inject constructor(private val authAPIService: AuthAPIService) :
    BaseDataSource() {
    suspend fun postRestaurant(request: RestaurantAddRequest) = getResult {
        authAPIService.postRestaurant(request)
    }

    suspend fun postMeal(restaurantId: String, request: FoodAddRequest) = getResult {
        authAPIService.postMeal(restaurantId, request)
    }

    suspend fun getOrders() = getResult { authAPIService.getOrders() }

    suspend fun updateUser(request : UserRequest) = getResult { authAPIService.updateUser(request) }

    suspend fun getUser() = getResult { authAPIService.getUser() }

    suspend fun postOrder(orderAddRequest: OrderAddRequest) = getResult {
        authAPIService.postOrder(orderAddRequest)
    }

}