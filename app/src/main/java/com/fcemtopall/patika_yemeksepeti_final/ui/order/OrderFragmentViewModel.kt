package com.fcemtopall.patika_yemeksepeti_final.ui.order

import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.fcemtopall.patika_yemeksepeti_final.models.ApiRepository
import com.fcemtopall.patika_yemeksepeti_final.models.entity.order.OrderResponse
import com.fcemtopall.patika_yemeksepeti_final.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OrderFragmentViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val apiRepository: ApiRepository
) : ViewModel() {

    fun getOrders(): LiveData<Resource<OrderResponse>> =
        apiRepository.getOrder()

}