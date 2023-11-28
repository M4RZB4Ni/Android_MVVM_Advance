package com.marzbani.android_hcfrc.authentication.data.models.register

data class RegisterRequest(
    val email: String,
    val password: String,
    val username: String
)