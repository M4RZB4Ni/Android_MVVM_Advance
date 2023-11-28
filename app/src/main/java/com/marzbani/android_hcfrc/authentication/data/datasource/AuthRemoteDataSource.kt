package com.marzbani.android_hcfrc.authentication.data.datasource

import com.marzbani.android_hcfrc.app.network.AuthApi
import com.marzbani.android_hcfrc.authentication.data.models.login.LoginRequest
import com.marzbani.android_hcfrc.authentication.data.models.login.LoginResponse
import com.marzbani.android_hcfrc.authentication.data.models.register.RegisterRequest
import com.marzbani.android_hcfrc.authentication.data.models.register.RegisterResponse
import com.marzbani.android_hcfrc.authentication.domain.AuthDataSource
import javax.inject.Inject

class AuthRemoteDataSource @Inject constructor(authApi: AuthApi) : AuthDataSource {
    override suspend fun login(loginRequest: LoginRequest): LoginResponse {
        TODO("Not yet implemented")
    }

    override suspend fun register(registerRequest: RegisterRequest): RegisterResponse {
        TODO("Not yet implemented")
    }

}