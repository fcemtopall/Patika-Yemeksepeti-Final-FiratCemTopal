package com.fcemtopall.patika_yemeksepeti_final.models.entity.restaurant

import com.google.gson.annotations.SerializedName

data class OrderRestaurant(
    @SerializedName("name")
    val name: String)