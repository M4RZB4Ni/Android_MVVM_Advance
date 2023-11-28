package com.marzbani.android_hcfrc.authentication.data.models.register

data class RegisterResponse(
    val email: String,
    val success: Boolean,
    val user_id: String,
    val username: String
)