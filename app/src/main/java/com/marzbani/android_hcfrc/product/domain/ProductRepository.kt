package com.marzbani.android_hcfrc.product.domain

import com.marzbani.android_hcfrc.product.data.model.Products



interface ProductRepository {
    suspend fun getProducts():Products
}