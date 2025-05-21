package com.example.yemeksiparisapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.yemeksiparisapp.data.Repository
import com.example.yemeksiparisapp.data.models.Yemek
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AnasayfaViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {
    // LiveData tanımları ve fonksiyonlar buraya
    // (Daha önce gönderdiğim ViewModel kodunu buraya ekleyin)
}