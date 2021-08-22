package com.fcemtopall.patika_yemeksepeti_final.ui.loginandregister

import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.fcemtopall.patika_yemeksepeti_final.models.ApiRepository
import com.fcemtopall.patika_yemeksepeti_final.models.entity.login.LoginRequest
import com.fcemtopall.patika_yemeksepeti_final.models.entity.login.LoginResponse
import com.fcemtopall.patika_yemeksepeti_final.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    var savedStateHandle: SavedStateHandle,
    private var apiRepository: ApiRepository
) : ViewModel() {
    fun login(email: String, password: String): LiveData<Resource<LoginResponse>> {
        val request = LoginRequest(email, password)
        return apiRepository.login(request)
    }
}