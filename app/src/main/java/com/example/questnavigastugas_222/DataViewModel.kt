package com.example.questnavigastugas_222

import androidx.lifecycle.ViewModel

data class DataPeserta(
    val nama: String = "",
    val alamat: String = "",
    val jenisKelamin: String = "",
    val status: String = ""
)

class DataViewModel : ViewModel() {

}
