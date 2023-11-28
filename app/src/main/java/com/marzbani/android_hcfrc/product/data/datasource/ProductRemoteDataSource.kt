package com.marzbani.android_hcfrc.product.data.datasource

import com.marzbani.android_hcfrc.app.network.ProductApi
import com.marzbani.android_hcfrc.product.data.model.Products
import com.marzbani.android_hcfrc.product.domain.ProductDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ProductRemoteDataSource @Inject constructor(private val productApi: ProductApi) :
    ProductDataSource {
    override suspend fun getProduct() : Products {
        return  withContext(Dispatchers.IO){
            val products = productApi.getProducts()
            products.body() ?: Products()
        }
    }

}