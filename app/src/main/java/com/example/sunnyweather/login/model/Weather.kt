package com.example.sunnyweather.login.model

//封装天气数据
data class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily)