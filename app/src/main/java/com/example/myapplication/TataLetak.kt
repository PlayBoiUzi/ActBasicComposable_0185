package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Pastikan R.drawable mengarah ke package project, misal: import com.example.mylayout.R
// Pastikan R.drawable mengarah ke package project, misal: import com.example.mylayout.R

@Composable
fun HalamanLogin(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        // 1. Gambar Background
        Image(
            painter = painterResource(id = R.drawable.kucing), // Sesuaikan nama file gambar background
            contentDescription = "Background",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // 2. Komponen Teks dan Gambar yang ditumpuk di atas background
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Login",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )

            Text(
                text = "Ini adalah halaman login,",
                fontSize = 16.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(40.dp))

            // Logo UMY
            Image(
                painter = painterResource(id = R.drawable.logo_umy), // Sesuaikan nama file logo
                contentDescription = "Logo UMY",
                modifier = Modifier.size(130.dp)
            )

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "Nama",
                fontSize = 16.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "M. Dzaky Rafi Al Aziz",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )

            Text(
                text = "20240140185",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

