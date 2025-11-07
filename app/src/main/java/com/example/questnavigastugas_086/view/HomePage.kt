package com.example.questnavigastugas_086.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.questnavigastugas_086.R
import com.example.questnavigastugas_086.Routes

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
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.fotoku),
                contentDescription = "Logo Aplikasi",
                modifier = Modifier.size(280.dp)
            )
            Text(
                text = "Linda Permata Sari",
                fontSize = namaFontSize,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace,
                color = namaColor, // Warna Ungu
                textAlign = TextAlign.Center
            )

            // 2. Text untuk NIM (Hitam, Font 18.sp, Lebih kecil)
            Text(
                text = "20230140086",
                fontSize = nimFontSize, // Lebih kecil
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace,
                color = nimColor, // Warna Hitam
                textAlign = TextAlign.Center
            )
        }
        Button(
            onClick = {
                navController.navigate(Routes.LIST_DAFTAR)
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RoundedCornerShape(25.dp),
            colors = ButtonDefaults.buttonColors(containerColor = buttonColor) // Menggunakan warna Ungu
        ){
            Text(text = "Submit", fontSize = 18.sp, color = Color.White)
        }
        Spacer(modifier = Modifier.height(50.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun HalamanAwalPreview() {
    com.example.questnavigastugas_086.view.HalamanAwal(navController = rememberNavController())
}