package com.gauravbora.weatherapp.UTILITIES

import android.telecom.Call
import com.gauravbora.weatherapp.POJO.ModalClass
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {


//    api key= 027213e41fb1e2cd09ad65bd0b745ece

    @GET("weather")
    fun getCurrentWeatherData(
//            https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}

        @Query("lat") latitude: String,
        @Query("lon") longitude: String,
        @Query("APPID") api_key: String,
    ): retrofit2.Call<ModalClass>


    @GET("weather")
    fun getCityWeatherData(
//        https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
//        city name as(in) q

        @Query("q") cityname: String,
        @Query("APPID") api_key: String,
    ): retrofit2.Call<ModalClass>
}