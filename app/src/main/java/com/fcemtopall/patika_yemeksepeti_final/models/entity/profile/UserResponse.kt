package com.fcemtopall.patika_yemeksepeti_final.models.entity.profile

import com.fcemtopall.patika_yemeksepeti_final.models.User
import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("data")
    val user: User,
    @SerializedName("success")
    val success: Boolean
)