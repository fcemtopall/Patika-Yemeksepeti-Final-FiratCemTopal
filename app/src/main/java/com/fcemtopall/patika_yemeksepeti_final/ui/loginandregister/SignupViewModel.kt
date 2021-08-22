package com.fcemtopall.patika_yemeksepeti_final.ui.loginandregister

import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.fcemtopall.patika_yemeksepeti_final.models.ApiRepository
import com.fcemtopall.patika_yemeksepeti_final.models.entity.register.RegisterRequest
import com.fcemtopall.patika_yemeksepeti_final.models.entity.register.RegisterResponse
import com.fcemtopall.patika_yemeksepeti_final.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SignupViewModel @Inject constructor(
    var savedStateHandle: SavedStateHandle,
    private var apiRepository: ApiRepository
) : ViewModel() {

    fun register(
        name: String,
        email: String,
        password: String
    ): LiveData<Resource<RegisterResponse>> {
        val request = RegisterRequest(name, email, password)
        return apiRepository.register(request)
    }
}