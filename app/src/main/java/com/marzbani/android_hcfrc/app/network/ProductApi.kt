package com.marzbani.android_hcfrc.app.network

import com.marzbani.android_hcfrc.app.Constants
import com.marzbani.android_hcfrc.product.data.model.Products
import retrofit2.Response
import retrofit2.http.GET

interface ProductApi {

    @GET(Constants.PRODUCTS_ENDPOINT)
    suspend fun getProducts(): Response<Products>
}