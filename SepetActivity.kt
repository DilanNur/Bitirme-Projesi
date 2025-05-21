package com.example.yemeksiparisapp

class SepetActivity : AppCompatActivity() {
    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, SepetActivity::class.java)
        }
    }
    // Daha önce gönderdiğim sepet aktivite kodunu buraya ekleyin
}