package com.fcemtopall.patika_yemeksepeti_final.ui.mealadd

import com.fcemtopall.patika_yemeksepeti_final.models.entity.Ingredient

interface IngredientRecyclerViewAdapterListener {
    fun onIngredientClickListener(ingredient: Ingredient, position: Int)

}