package com.example.questnavigastugas_222

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class DataPeserta(
    val nama: String = "",
    val alamat: String = "",
    val jenisKelamin: String = "",
    val status: String = ""
)

class DataViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(DataPeserta())

    val uiState: StateFlow<DataPeserta> = _uiState.asStateFlow()


}
