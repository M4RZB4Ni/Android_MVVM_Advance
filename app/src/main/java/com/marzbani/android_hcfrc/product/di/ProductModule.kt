package com.marzbani.android_hcfrc.product.di

import com.marzbani.android_hcfrc.app.Constants
import com.marzbani.android_hcfrc.app.di.BaseUrl
import com.marzbani.android_hcfrc.app.network.ProductApi
import com.marzbani.android_hcfrc.product.data.datasource.ProductRemoteDataSource
import com.marzbani.android_hcfrc.product.data.repository.ProductRepositoryImpl
import com.marzbani.android_hcfrc.product.domain.ProductDataSource
import com.marzbani.android_hcfrc.product.domain.ProductRepository
import com.marzbani.android_hcfrc.product.domain.ProductUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import retrofit2.Retrofit

@Module
@InstallIn(ViewModelComponent::class)
object ProductModule {

    @Provides
    @ViewModelScoped
    @BaseUrl
    fun provideFeatureBaseUrl(): String {
        return Constants.BASE_URL
    }

    @Provides
    @ViewModelScoped
    fun provideProductRepository(productDataSource: ProductDataSource):ProductRepository{
        return ProductRepositoryImpl(productDataSource)
    }


    @Provides
    @ViewModelScoped
    fun provideProductRemoteDataSource(productApi: ProductApi):ProductDataSource{
        return ProductRemoteDataSource(productApi)
    }

    @Provides
    @ViewModelScoped
    fun provideProductApi(retrofit: Retrofit): ProductApi {
        return retrofit.create(ProductApi::class.java)
    }

    @Provides
    @ViewModelScoped
    fun provideProductUseCase(productRepository: ProductRepository): ProductUseCase{
        return ProductUseCase(productRepository)
    }
}