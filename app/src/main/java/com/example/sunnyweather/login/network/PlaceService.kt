package com.example.sunnyweather.login.network

import com.example.sunnyweather.SunnyWeatherApplication
import com.example.sunnyweather.login.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {

    //查询天气
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlace(@Query("query") query: String): Call<PlaceResponse>
}