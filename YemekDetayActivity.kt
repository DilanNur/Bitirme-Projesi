package com.example.yemeksiparisapp

class YemekDetayActivity : AppCompatActivity() {
    // Daha önce gönderdiğim detay aktivite kodunu buraya ekleyin
    companion object {
        fun newIntent(context: Context, yemek: Yemek): Intent {
            return Intent(context, YemekDetayActivity::class.java).apply {
                putExtra("yemek", yemek)
            }
        }
    }
}