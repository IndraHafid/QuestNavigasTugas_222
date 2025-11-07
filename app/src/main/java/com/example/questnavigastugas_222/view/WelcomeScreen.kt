package com.example.questnavigastugas_222.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigastugas_222.R

@Composable
fun WelcomeScreen(onNextButtonClicked: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.welcome_title),
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Bold
        )

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo Aplikasi",
            modifier = Modifier.size(200.dp)
        )

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = stringResource(id = R.string.developer_name),
                fontSize = 20.sp
            )
            Text(
                text = stringResource(id = R.string.developer_id),
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
            )
        }

        Button(
            onClick = onNextButtonClicked,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(stringResource(id = R.string.submit_button))
        }
    }
}
