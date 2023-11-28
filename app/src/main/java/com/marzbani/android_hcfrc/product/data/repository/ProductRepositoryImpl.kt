package com.marzbani.android_hcfrc.product.data.repository

import com.marzbani.android_hcfrc.product.data.model.Products
import com.marzbani.android_hcfrc.product.domain.ProductDataSource
import com.marzbani.android_hcfrc.product.domain.ProductRepository

class ProductRepositoryImpl constructor(private val productDataSource: ProductDataSource) :
    ProductRepository {
    override suspend fun getProducts(): Products {
        return productDataSource.getProduct()
    }
}