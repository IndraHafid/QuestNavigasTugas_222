package com.example.questnavigastugas_222

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

data class DataPeserta(
    val nama: String = "",
    val alamat: String = "",
    val jenisKelamin: String = "",
    val status: String = ""
)

class DataViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(DataPeserta())


}
