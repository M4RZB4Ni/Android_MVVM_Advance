package com.marzbani.android_hcfrc.authentication.presentation.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.marzbani.android_hcfrc.authentication.data.models.login.LoginRequest
import com.marzbani.android_hcfrc.authentication.data.models.login.LoginResponse
import com.marzbani.android_hcfrc.authentication.domain.AuthUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(private val useCase: AuthUseCase, application: Application): AndroidViewModel(application) {

    private val _loginResponse=MutableLiveData<LoginResponse>()
    val loginResponse :LiveData<LoginResponse> get() = _loginResponse

    fun login(email:String,password:String)
{
    viewModelScope.launch {
        useCase.login(LoginRequest(email = email, password = password))

    }
}





}