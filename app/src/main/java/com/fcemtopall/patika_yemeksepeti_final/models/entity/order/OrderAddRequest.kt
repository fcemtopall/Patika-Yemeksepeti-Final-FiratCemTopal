package com.fcemtopall.patika_yemeksepeti_final.models.entity.order

import com.google.gson.annotations.SerializedName

data class OrderAddRequest(
    @SerializedName("restaurantId")
    val restaurantId: String,
    @SerializedName("mealId")
    val mealId: String,
)