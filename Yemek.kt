package com.example.yemeksiparisapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Yemek(
    val yemek_id: String,
    val yemek_adi: String,
    val yemek_resim_adi: String,
    val yemek_fiyat: String
) : Parcelable