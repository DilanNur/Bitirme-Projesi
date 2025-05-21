package com.example.yemeksiparisapp

data class SepetYemek(
    val sepet_yemek_id: Int,
    val yemek_adi: String,
    val yemek_resim_adi: String,
    val yemek_fiyat: String,
    val yemek_siparis_adet: String,
    val kullanici_adi: String
)