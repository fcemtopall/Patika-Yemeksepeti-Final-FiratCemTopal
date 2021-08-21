package com.fcemtopall.patika_yemeksepeti_final.models.entity.addRestaurant

import com.google.gson.annotations.SerializedName

data class Message(
    @SerializedName("address")
    val address: String,
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("cuisine")
    val cuisine: String,
    @SerializedName("deliveryInfo")
    val deliveryInfo: String,
    @SerializedName("deliveryTime")
    val deliveryTime: String,
    @SerializedName("district")
    val district: String,
    @SerializedName("_id")
    val id: String,
    @SerializedName("imageUrl")
    val imageUrl: String,
    @SerializedName("meals")
    val meals: List<Any>,
    @SerializedName("minDeliveryFee")
    val minDeliveryFee: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("paymentMethods")
    val paymentMethods: String,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("user")
    val user: String,
    @SerializedName("__v")
    val v: Int,

)