package com.gauravbora.weatherapp.POJO

import com.google.gson.annotations.SerializedName

data class ModalClass(

    @SerializedName("weather") val weather:List<Weather>,
    @SerializedName("main") val main:Main,
    @SerializedName("wind") val wind:Wind,
    @SerializedName("sys") val sys:Sys,
    @SerializedName("id") val id:Int,
    @SerializedName("name") val name:String,







        )