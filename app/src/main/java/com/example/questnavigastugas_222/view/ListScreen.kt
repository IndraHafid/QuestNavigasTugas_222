package com.example.questnavigastugas_222.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.questnavigastugas_222.DataViewModel

@Composable
fun ListScreen(
    dataViewModel: DataViewModel,
    onHomeButtonClicked: () -> Unit,
    onFormButtonClicked: () -> Unit
) {
        val uiState by dataViewModel.uiState.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEDE7F6))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text("List Daftar Peserta", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(24.dp))

        if (uiState.nama.isNotBlank()) {
            Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                InfoCard(label = "NAMA LENGKAP", value = uiState.nama)
                InfoCard(label = "JENIS KELAMIN", value = uiState.jenisKelamin)
                InfoCard(label = "STATUS PERKAWINAN", value = uiState.status)
                InfoCard(label = "ALAMAT", value = uiState.alamat)
            }
        } else {
            Box(
                modifier = Modifier.weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Text("Belum ada data peserta.",
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.Gray)
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Button(
                onClick = onHomeButtonClicked,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Beranda")
            }
            Button(
                onClick = onFormButtonClicked,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Formulir Pendaftaran")
            }
        }
    }
}

