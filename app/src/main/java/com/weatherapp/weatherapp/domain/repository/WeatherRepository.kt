package com.weatherapp.weatherapp.domain.repository

import com.weatherapp.weatherapp.domain.util.Resource
import com.weatherapp.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}