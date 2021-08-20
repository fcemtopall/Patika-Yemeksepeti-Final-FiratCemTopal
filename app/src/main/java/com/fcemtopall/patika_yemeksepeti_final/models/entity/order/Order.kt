package com.fcemtopall.patika_yemeksepeti_final.models.entity.order

import com.fcemtopall.patika_yemeksepeti_final.models.entity.food.Food
import com.fcemtopall.patika_yemeksepeti_final.models.entity.restaurant.OrderRestaurant
import com.google.gson.annotations.SerializedName
import java.util.*

data class Order(
    @SerializedName("_id")
    val id: String,
    @SerializedName("createdDate")
    val createdDate: Date,
    @SerializedName("food")
    val food: Food,
    @SerializedName("restaurant")
    val restaurant: OrderRestaurant,
    @SerializedName("price")
    val price: Double
)