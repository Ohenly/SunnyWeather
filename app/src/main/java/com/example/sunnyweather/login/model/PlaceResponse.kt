package com.example.sunnyweather.login.model

import com.google.gson.annotations.SerializedName

data class PlaceResponse(val status: String, val places: List<Place>)

// 地点
// 使用 @SerializedName注解 来让JSON字段和Kotlin字段之间建立映射关系
data class Place(val name: String, val location: Location, @SerializedName("formatted_address") val address: String)

// 方位
data class Location(val lng: String, val lat: String)