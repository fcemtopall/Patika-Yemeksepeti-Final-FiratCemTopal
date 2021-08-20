package com.fcemtopall.patika_yemeksepeti_final.models.entity.login

import com.google.gson.annotations.SerializedName

data class LoginData(
    @SerializedName("email")
    val email: String,
    @SerializedName("name")
    val name : String,
)