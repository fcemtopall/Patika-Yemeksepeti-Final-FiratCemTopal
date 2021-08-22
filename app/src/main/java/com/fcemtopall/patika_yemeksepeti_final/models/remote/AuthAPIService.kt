package com.fcemtopall.patika_yemeksepeti_final.models.remote

import com.fcemtopall.patika_yemeksepeti_final.models.entity.User
import com.fcemtopall.patika_yemeksepeti_final.models.entity.addFood.FoodAddRequest
import com.fcemtopall.patika_yemeksepeti_final.models.entity.addFood.FoodAddResponse
import com.fcemtopall.patika_yemeksepeti_final.models.entity.addRestaurant.RestaurantAddRequest
import com.fcemtopall.patika_yemeksepeti_final.models.entity.addRestaurant.RestaurantAddResponse
import com.fcemtopall.patika_yemeksepeti_final.models.entity.order.OrderAddRequest
import com.fcemtopall.patika_yemeksepeti_final.models.entity.order.OrderAddResponse
import com.fcemtopall.patika_yemeksepeti_final.models.entity.order.OrderResponse
import com.fcemtopall.patika_yemeksepeti_final.models.entity.profile.UserRequest
import com.fcemtopall.patika_yemeksepeti_final.models.entity.profile.UserResponse
import retrofit2.Response
import retrofit2.http.*

interface AuthAPIService {

    @POST("a/restaurant")
    suspend fun postRestaurant(@Body request: RestaurantAddRequest): Response<RestaurantAddResponse>

    @POST("a/restaurant/{restaurantId}/meal")
    suspend fun postMeal(
        @Path("restaurantId") restaurantId: String,
        @Body request: FoodAddRequest
    ): Response<FoodAddResponse>

    @POST("a/order")
    suspend fun postOrder(@Body request: OrderAddRequest): Response<OrderAddResponse>

    @GET("a/order")
    suspend fun getOrders(): Response<OrderResponse>

    @PUT("auth/updateDetails")
    suspend fun updateUser(@Body request : UserRequest) : Response<User>

    @GET("auth/profile")
    suspend fun getUser() : Response<UserResponse>
}