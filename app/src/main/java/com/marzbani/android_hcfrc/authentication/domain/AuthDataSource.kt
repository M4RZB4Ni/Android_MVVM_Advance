package com.marzbani.android_hcfrc.authentication.domain

import com.marzbani.android_hcfrc.authentication.data.models.login.LoginRequest
import com.marzbani.android_hcfrc.authentication.data.models.login.LoginResponse
import com.marzbani.android_hcfrc.authentication.data.models.register.RegisterRequest
import com.marzbani.android_hcfrc.authentication.data.models.register.RegisterResponse

interface AuthDataSource {
    suspend fun login(loginRequest: LoginRequest):LoginResponse
    suspend fun register(registerRequest: RegisterRequest) : RegisterResponse
}