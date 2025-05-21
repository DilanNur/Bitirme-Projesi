package com.example.yemeksiparisapp

import retrofit2.Response
import retrofit2.http.*

interface YemeklerService {
    @GET("tumYemekleriGetir.php")
    suspend fun tumYemekleriGetir(): Response<YemeklerCevap>

    @POST("sepeteYemekEkle.php")
    @FormUrlEncoded
    suspend fun sepeteYemekEkle(
        @Field("yemek_adi") yemekAdi: String,
        @Field("yemek_resim_adi") yemekResimAdi: String,
        @Field("yemek_fiyat") yemekFiyat: Int,
        @Field("yemek_siparis_adet") yemekSiparisAdet: Int,
        @Field("kullanici_adi") kullaniciAdi: String
    ): Response<CRUDCevap>

    @POST("sepettekiYemekleriGetir.php")
    @FormUrlEncoded
    suspend fun sepettekiYemekleriGetir(
        @Field("kullanici_adi") kullaniciAdi: String
    ): Response<SepetYemeklerCevap>

    @POST("sepettenYemekSil.php")
    @FormUrlEncoded
    suspend fun sepettenYemekSil(
        @Field("sepet_yemek_id") sepetYemekId: Int,
        @Field("kullanici_adi") kullaniciAdi: String
    ): Response<CRUDCevap>
}