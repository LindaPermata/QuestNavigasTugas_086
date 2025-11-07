package com.example.questnavigastugas_086.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigastugas_086.R

@Composable
fun ListDaftar(navController: NavController) {
    val headerPurple = Color(0xFFDC26D3)
    val backgroundColor = Color(0xFFDDD3E3)
    val cardBackgroundColor = Color.White

    val buttonColor = Color(0xFFDC26D3)
    val textColor = Color(0xFF8E8E93)
    val buttonTextColor = Color.White
    val labelPurple = Color(0xFF900CBB)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(top = 53.dp)
    ) {
        // Bagian Header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(headerPurple) // Warna ungu untuk header
                .heightIn(min = 100.dp)
                .padding(16.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            Text(
                text = "List Daftar Peserta", // Judul header diubah
                fontSize = 30.sp,
                color = Color.White,
                modifier = Modifier.padding(start = 10.dp)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Spacer(modifier = Modifier.height(16.dp))

            InfoCard(
                label = stringResource(id = R.string.nama_lengkap),
                value = "Linda Permata Sari",
                backgroundColor = cardBackgroundColor,
                labelColor = labelPurple // Diubah menjadi ungu
            )
            Spacer(modifier = Modifier.height(16.dp))

            InfoCard(
                label = stringResource(id = R.string.jenis_kelamin),
                value = "Perempuan",
                backgroundColor = cardBackgroundColor,
                labelColor = labelPurple
            )
            Spacer(modifier = Modifier.height(16.dp))

            InfoCard(
                label = "STATUS PERKAWINAN",
                value = "Lajang",
                backgroundColor = cardBackgroundColor,
                labelColor = labelPurple
            )
            Spacer(modifier = Modifier.height(16.dp))

            InfoCard(
                label = stringResource(id = R.string.alamat),
                value = "New York City",
                backgroundColor = cardBackgroundColor,
                labelColor = labelPurple
            )
            Spacer(modifier = Modifier.height(40.dp))

            CustomButton(text = "Beranda", color = buttonColor, textColor = buttonTextColor) {
                navController.navigate("HalamanAwal")
            }
            Spacer(modifier = Modifier.height(16.dp))

            CustomButton(text = "Formulir Pendaftaran", color = buttonColor, textColor = buttonTextColor) {
                navController.navigate("Formulir")
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun InfoCard(label: String, value: String, backgroundColor: Color, labelColor: Color) {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = backgroundColor
        ),
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 14.dp)
        ) {
            Text(
                text = label,
                fontSize = 15.sp,
                color = labelColor,
                fontWeight = FontWeight.Normal
            )
            Text(
                text = value,
                fontSize = 20.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Black
            )
        }
    }
}

@Composable
fun CustomButton(text: String, color: Color, textColor: Color, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(containerColor = color)
    ) {
        Text(text = text, fontSize = 16.sp, color = textColor)
    }
}

@Preview(showBackground = true)
@Composable
fun ListDaftarPreview() {
    com.example.questnavigastugas_086.view.ListDaftar(navController = rememberNavController())
}