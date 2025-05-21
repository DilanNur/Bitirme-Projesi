package com.example.yemeksiparisapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.yemeksiparisapp.data.models.Yemek
import com.example.yemeksiparisapp.databinding.ItemYemekBinding

class YemeklerAdapter(private val onClick: (Yemek) -> Unit) :
    ListAdapter<Yemek, YemeklerAdapter.YemekHolder>(DiffCallback()) {

    inner class YemekHolder(val binding: ItemYemekBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YemekHolder {
        val binding = ItemYemekBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return YemekHolder(binding)
    }

    override fun onBindViewHolder(holder: YemekHolder, position: Int) {
        val yemek = getItem(position)
        holder.binding.apply {
            tvYemekAdi.text = yemek.yemek_adi
            tvYemekFiyat.text = "${yemek.yemek_fiyat} ₺"
            Glide.with(root.context)
                .load("http://kasimadalan.pe.hu/yemekler/resimler/${yemek.yemek_resim_adi}")
                .into(ivYemekResim)

            root.setOnClickListener { onClick(yemek) }
        }
    }

    class DiffCallback : DiffUtil.ItemCallback<Yemek>() {
        override fun areItemsTheSame(oldItem: Yemek, newItem: Yemek) =
            oldItem.yemek_id == newItem.yemek_id
        override fun areContentsTheSame(oldItem: Yemek, newItem: Yemek) =
            oldItem == newItem
    }
}