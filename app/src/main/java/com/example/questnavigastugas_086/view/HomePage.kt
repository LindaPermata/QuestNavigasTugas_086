package com.example.questnavigastugas_086.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HalamanAwal(navController: NavController) {
    val backgroundColor = Color(0xFFF3E5F5)
    val textColor = Color(0xFFDC26D3)
    val buttonColor = Color(0xFFDC26D3)
    val namaColor = Color(0xFFDC26D3)
    val nimColor = Color.Black
    val namaFontSize = 23.sp
    val nimFontSize = 18.sp

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ){
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Selamat Datang",
            fontSize = 42.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace,
            color = textColor,
            style = TextStyle(lineHeight = 56.sp)
        )