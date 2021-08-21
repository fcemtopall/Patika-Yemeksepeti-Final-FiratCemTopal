package com.fcemtopall.patika_yemeksepeti_final.models.remote

import com.fcemtopall.patika_yemeksepeti_final.models.entity.food.FoodResponse
import com.fcemtopall.patika_yemeksepeti_final.models.entity.login.LoginRequest
import com.fcemtopall.patika_yemeksepeti_final.models.entity.login.LoginResponse
import com.fcemtopall.patika_yemeksepeti_final.models.entity.register.RegisterRequest
import com.fcemtopall.patika_yemeksepeti_final.models.entity.register.RegisterResponse
import com.fcemtopall.patika_yemeksepeti_final.models.entity.restaurant.RestaurantListResponse
import com.fcemtopall.patika_yemeksepeti_final.models.entity.restaurant.RestaurantResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface APIService {

    @GET("a/restaurant")
    suspend fun getRestaurants(): Response<RestaurantListResponse>

    @GET("a/restaurant/cuisine/{cuisineName}")
    suspend fun getRestaurantsByCuisine(@Path("cuisineName") cuisine: String): Response<RestaurantListResponse>

    @GET("a/restaurant/{id}")
    suspend fun getRestaurantById(@Path("id") id: String): Response<RestaurantResponse>

    @GET("a/food/{id}")
    suspend fun getMealById(@Path("id") id: String): Response<FoodResponse>

    @POST("auth/login")
    suspend fun login(@Body request: LoginRequest): Response<LoginResponse>

    @POST("auth/register")
    suspend fun register(@Body request: RegisterRequest): Response<RegisterResponse>

}