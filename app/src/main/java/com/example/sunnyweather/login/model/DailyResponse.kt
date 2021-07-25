package com.example.sunnyweather.login.model

import com.google.gson.annotations.SerializedName
import java.util.*

//未来天气信息 数据模型
data class DailyResponse(val status: String, val result: Result) {

    //返回结果
    data class Result(val daily: Daily)

    //日报
    data class Daily(val temperature: List<Temperature>, val skycon: List<Skycon>, @SerializedName("life_index") val lifeIndex: LifeIndex)

    //气温
    data class Temperature(val max: Float, val min: Float)

    //气象
    data class Skycon(val value: String, val date: Date)

    //生活指数
    data class LifeIndex(val coldRisk: List<LifeDescription>, val carWashing: List<LifeDescription>, val ultraviolet: List<LifeDescription>, val dressing: List<LifeDescription>)

    //描述
    data class LifeDescription(val desc: String)

}


