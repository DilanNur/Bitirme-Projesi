package com.example.yemeksiparisapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yemeksiparisapp.databinding.ActivityAnasayfaBinding
import com.example.yemeksiparisapp.ui.anasayfa.adapters.YemeklerAdapter

class AnasayfaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAnasayfaBinding
    private val viewModel: AnasayfaViewModel by viewModels()
    private lateinit var adapter: YemeklerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnasayfaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
        observeLiveData()
        setupFab()
    }

    private fun setupRecyclerView() {
        adapter = YemeklerAdapter { yemek ->
            startActivity(
                YemekDetayActivity.newIntent(this, yemek)
            )
        }
        binding.rvYemekler.apply {
            adapter = this@AnasayfaActivity.adapter
            layoutManager = LinearLayoutManager(this@AnasayfaActivity)
        }
    }

    private fun observeLiveData() {
        viewModel.yemeklerListesi.observe(this) { yemekler ->
            adapter.submitList(yemekler)
        }
    }

    private fun setupFab() {
        binding.fabSepet.setOnClickListener {
            startActivity(SepetActivity.newIntent(this))
        }
    }
}