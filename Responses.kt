package com.example.yemeksiparisapp

import com.google.gson.annotations.SerializedName

data class YemeklerCevap(
    @SerializedName("yemekler") val yemekler: List<Yemek>,
    @SerializedName("success") val success: Int
)

data class SepetYemeklerCevap(
    @SerializedName("sepet_yemekler") val sepet_yemekler: List<SepetYemek>,
    @SerializedName("success") val success: Int
)

data class CRUDCevap(
    @SerializedName("success") val success: Int,
    @SerializedName("message") val message: String
)