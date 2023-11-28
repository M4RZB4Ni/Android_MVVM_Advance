package com.marzbani.android_hcfrc.product.domain

import com.marzbani.android_hcfrc.product.data.model.Products



interface ProductDataSource {

     suspend fun getProduct(): Products
}