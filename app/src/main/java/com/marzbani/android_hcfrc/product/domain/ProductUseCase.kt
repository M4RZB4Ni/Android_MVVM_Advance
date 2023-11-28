package com.marzbani.android_hcfrc.product.domain

import com.marzbani.android_hcfrc.product.data.model.Products
import javax.inject.Inject

class ProductUseCase @Inject constructor(
    private val productRepository: ProductRepository
) {
    suspend operator fun invoke(): Products{
        return productRepository.getProducts()
    }
}