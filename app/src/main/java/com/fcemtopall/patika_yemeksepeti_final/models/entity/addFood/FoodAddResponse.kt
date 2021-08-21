package com.fcemtopall.patika_yemeksepeti_final.models.entity.addFood

import com.google.gson.annotations.SerializedName

data class FoodAddResponse(
    @SerializedName("message")
    val message: Message,
    @SerializedName("success")
    val success: Boolean
)