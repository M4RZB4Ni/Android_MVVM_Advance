package com.marzbani.android_hcfrc.authentication.di

import com.marzbani.android_hcfrc.app.Constants
import com.marzbani.android_hcfrc.app.di.BaseUrl
import com.marzbani.android_hcfrc.app.network.AuthApi
import com.marzbani.android_hcfrc.authentication.data.datasource.AuthRemoteDataSource
import com.marzbani.android_hcfrc.authentication.data.repository.AuthRepositoryImpl
import com.marzbani.android_hcfrc.authentication.domain.AuthDataSource
import com.marzbani.android_hcfrc.authentication.domain.AuthRepository
import com.marzbani.android_hcfrc.authentication.domain.AuthUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import retrofit2.Retrofit


@Module
@InstallIn(ViewModelComponent::class)
object AuthModule {

    @Provides
    @ViewModelScoped
    @BaseUrl
    fun provideFeatureBaseUrl(): String {
        return Constants.BASE_URL
    }

    @Provides
    @ViewModelScoped
    fun provideAuthApi(retrofit: Retrofit):AuthApi{
        return retrofit.create(AuthApi::class.java)
    }

    @Provides
    @ViewModelScoped
    fun provideAuthRemoteDataSource(authApi: AuthApi): AuthDataSource{
        return AuthRemoteDataSource(authApi)
    }

    @Provides
    @ViewModelScoped
    fun provideAuthRepository(authDataSource: AuthDataSource):AuthRepository{
        return AuthRepositoryImpl(authDataSource)
    }

    @Provides
    @ViewModelScoped
    fun providesAuthUseCase(authRepository: AuthRepository):AuthUseCase{
        return AuthUseCase(authRepository)
    }
}