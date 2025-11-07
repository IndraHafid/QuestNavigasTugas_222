package com.example.questnavigastugas_222.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.questnavigastugas_222.DataViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormScreen(
    dataViewModel: DataViewModel,
    onSubmitButtonClicked: () -> Unit
) {
        var namaInput by remember { mutableStateOf("") }
        var alamatInput by remember { mutableStateOf("") }
        var jenisKelaminInput by remember { mutableStateOf("") }
        var statusInput by remember { mutableStateOf("") }

        val genderOptions = listOf("Laki-laki", "Perempuan")
        val statusOptions = listOf("Janda", "Lajang", "Duda")

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFF673AB7), Color(0xFFD1C4E9))
                )
            ),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Formulir Pendaftaran",
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(24.dp))


        }
    }
}
