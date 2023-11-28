package com.marzbani.android_hcfrc.app.network

import com.marzbani.android_hcfrc.app.Constants
import com.marzbani.android_hcfrc.authentication.data.models.login.LoginRequest
import com.marzbani.android_hcfrc.authentication.data.models.login.LoginResponse
import retrofit2.Response
import retrofit2.http.GET

interface AuthApi {

    @GET(Constants.LOGIN_URL)
    suspend fun login(loginRequest: LoginRequest):Response<LoginResponse>
}