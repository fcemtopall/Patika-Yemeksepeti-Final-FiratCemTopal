package com.fcemtopall.patika_yemeksepeti_final.models.entity.addFood

import com.google.gson.annotations.SerializedName

data class FoodAddRequest(
    @SerializedName("name")
    val name: String,
    @SerializedName("imageUrl")
    val imageUrl: String,
    @SerializedName("price")
    val price: String,
    @SerializedName("ingredients")
    val ingredients: List<String>
    )