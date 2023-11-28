package com.marzbani.android_hcfrc.authentication.data.repository

import com.marzbani.android_hcfrc.authentication.data.models.login.LoginRequest
import com.marzbani.android_hcfrc.authentication.data.models.login.LoginResponse
import com.marzbani.android_hcfrc.authentication.data.models.register.RegisterRequest
import com.marzbani.android_hcfrc.authentication.data.models.register.RegisterResponse
import com.marzbani.android_hcfrc.authentication.domain.AuthDataSource
import com.marzbani.android_hcfrc.authentication.domain.AuthRepository
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(authDataSource: AuthDataSource): AuthRepository {
    override suspend fun login(loginRequest: LoginRequest): LoginResponse {
        TODO("Not yet implemented")
    }

    override suspend fun register(registerRequest: RegisterRequest): RegisterResponse {
        TODO("Not yet implemented")
    }

}