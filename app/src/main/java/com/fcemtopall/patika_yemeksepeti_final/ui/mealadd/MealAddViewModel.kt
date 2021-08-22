package com.fcemtopall.patika_yemeksepeti_final.ui.mealadd

import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.fcemtopall.patika_yemeksepeti_final.models.ApiRepository
import com.fcemtopall.patika_yemeksepeti_final.models.entity.addFood.FoodAddRequest
import com.fcemtopall.patika_yemeksepeti_final.models.entity.addFood.FoodAddResponse
import com.fcemtopall.patika_yemeksepeti_final.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MealAddViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val apiRepository: ApiRepository
) : ViewModel() {

    fun addMeal(
        restaurantId: String,
        name: String,
        imageUrl: String,
        price: String,
        ingredients: List<String>
    ): LiveData<Resource<FoodAddResponse>> {
        val request = FoodAddRequest(name, imageUrl, price, ingredients)
        return apiRepository.postMeal(restaurantId, request)
    }

}