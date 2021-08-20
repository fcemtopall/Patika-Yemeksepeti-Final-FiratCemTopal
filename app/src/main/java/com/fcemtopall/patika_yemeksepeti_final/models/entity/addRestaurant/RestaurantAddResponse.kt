package com.fcemtopall.patika_yemeksepeti_final.models.entity.addRestaurant

import com.google.gson.annotations.SerializedName

data class RestaurantAddResponse(
    @SerializedName("message")
    val message: Message,
    @SerializedName("success")
    val success: Boolean
)