package com.example.yemeksiparisapp

class YemeklerRepository(private val yService: YemeklerService) {
    suspend fun tumYemekleriGetir() = yService.tumYemekleriGetir()

    suspend fun sepeteYemekEkle(yemek: Yemek, adet: Int, kullaniciAdi: String) =
        yService.sepeteYemekEkle(yemek.yemek_adi, yemek.yemek_resim_adi,
            yemek.yemek_fiyat.toInt(), adet, kullaniciAdi)

    suspend fun sepettekiYemekleriGetir(kullaniciAdi: String) =
        yService.sepettekiYemekleriGetir(kullaniciAdi)

    suspend fun sepettenYemekSil(sepetYemekId: Int, kullaniciAdi: String) =
        yService.sepettenYemekSil(sepetYemekId, kullaniciAdi)
}