package com.fcemtopall.patika_yemeksepeti_final.models

import com.google.gson.annotations.SerializedName

data class Ingredient (
    @SerializedName("ingredient")
    var ingredient: String,
    @SerializedName("includes")
    var includes: Boolean
        )