package com.marzbani.android_hcfrc.authentication.domain

import com.marzbani.android_hcfrc.authentication.data.models.login.LoginRequest
import com.marzbani.android_hcfrc.authentication.data.models.login.LoginResponse
import com.marzbani.android_hcfrc.authentication.data.models.register.RegisterRequest
import com.marzbani.android_hcfrc.authentication.data.models.register.RegisterResponse
import javax.inject.Inject

class AuthUseCase @Inject constructor(private val authRepository: AuthRepository) {

    suspend fun login(loginRequest: LoginRequest):LoginResponse{
        return authRepository.login(loginRequest)
    }

    suspend fun register(registerRequest: RegisterRequest):RegisterResponse{
        return authRepository.register(registerRequest)
    }
}