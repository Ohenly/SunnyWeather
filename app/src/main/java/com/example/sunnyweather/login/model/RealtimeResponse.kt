package com.example.sunnyweather.login.model

import com.google.gson.annotations.SerializedName

//实时天气信息 数据模型
data class RealtimeResponse(val status: String, val result: Result) {

    //返回结果
    data class Result(val realtime: Realtime)

    //信息汇总
    data class Realtime(val skycon: String, val temperature: Float, @SerializedName("air_quality") val airQuality: AirQuality)

    //空气质量
    data class AirQuality(val aqi: AQI)

    //空气质量指数
    data class AQI(val chn: Float)

}
