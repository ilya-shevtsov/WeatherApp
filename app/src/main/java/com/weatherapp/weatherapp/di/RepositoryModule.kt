package com.weatherapp.weatherapp.di

import com.weatherapp.weatherapp.data.repository.WeatherRepositoryImpl
import com.weatherapp.weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}