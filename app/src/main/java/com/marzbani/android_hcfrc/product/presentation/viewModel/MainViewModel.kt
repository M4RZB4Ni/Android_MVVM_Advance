package com.marzbani.android_hcfrc.product.presentation.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.marzbani.android_hcfrc.product.data.model.Products
import com.marzbani.android_hcfrc.product.domain.ProductUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    application: Application,
    private val getProductsUseCase: ProductUseCase
): AndroidViewModel(application) {
    private val _products = MutableStateFlow(Products())
    val products: StateFlow<Products> get() = _products

    init {
        getProducts()

    }


    private fun  getProducts(){
        viewModelScope.launch {
            try {
                _products.value = getProductsUseCase()
            }catch (_:Exception){

            }
        }
    }
}