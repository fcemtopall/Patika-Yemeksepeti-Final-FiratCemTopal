package com.fcemtopall.patika_yemeksepeti_final.models.entity.register

import com.google.gson.annotations.SerializedName

data class RegisterResponse(
    @SerializedName("data")
    val registerData: RegisterData,
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("token")
    val token: String
)
