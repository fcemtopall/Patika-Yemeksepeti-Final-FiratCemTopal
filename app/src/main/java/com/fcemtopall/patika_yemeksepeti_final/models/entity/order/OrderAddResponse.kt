package com.fcemtopall.patika_yemeksepeti_final.models.entity.order

import com.google.gson.annotations.SerializedName

data class OrderAddResponse(

    @SerializedName("success")
    val success: Boolean
)
