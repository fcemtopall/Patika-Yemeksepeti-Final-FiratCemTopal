package com.fcemtopall.patika_yemeksepeti_final.models.entity.restaurant

import com.google.gson.annotations.SerializedName

data class RestaurantListResponse(
    @SerializedName("count")
    val count: Int,
    @SerializedName("data")
    val restaurantList: List<Restaurant>,
    @SerializedName("success")
    val success: Boolean
)