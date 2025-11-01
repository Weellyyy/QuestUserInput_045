package com.example.questuserinput_045

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ActivityForm(modifier: Modifier= Modifier)
{
    var textNamaLengkap by remember { mutableStateOf("") }
    var textKotaAsal by remember { mutableStateOf("") }
    var textTanggalLahir by remember { mutableStateOf("") }
    var textRt by remember { mutableStateOf("") }
    var textRw by remember { mutableStateOf("") }
    var textUmur by remember { mutableStateOf("") }
    var textJenisKelamin by remember { mutableStateOf("") }
    var isSetujuChecked by remember { mutableStateOf(false) }

    var namaLengkap by remember { mutableStateOf("") }
    var kotaAsal by remember { mutableStateOf("") }
    var tanggalLahir by remember { mutableStateOf("") }
    var rt by remember { mutableStateOf("") }
    var rw by remember { mutableStateOf("") }
    var umur by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("")  }

    val genderList = listOf("Laki-laki", "Perempuan" )

    val showDatePicker = remember { mutableStateOf(false) }
    val datePickerState = rememberDatePickerState()

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = painterResource(R.drawable.greenbg),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column (
            modifier = modifier
                .fillMaxWidth(0.9f)
                .fillMaxWidth(0.9f)
                .clip(RoundedCornerShape(32.dp))
                .background(Color.White.copy(alpha = 0.2f))
                .padding(horizontal = 24.dp, vertical = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text("Form Pendaftaran Joki",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White)
            Divider(
                modifier = Modifier.padding(
                    bottom = dimensionResource(R.dimen.padding_medium),
                    top = dimensionResource(R.dimen.padding_medium
                    )),
                thickness = dimensionResource(R.dimen.divider_tipis),
                color = Color.DarkGray
            )
            TextField(
                value = textNamaLengkap,
                onValueChange = { textNamaLengkap = it },
                label = { Text("Nama Lengkap") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp),
                shape = RoundedCornerShape(16.dp),
                singleLine = true,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White.copy(alpha = 0.3f),
                    unfocusedContainerColor = Color.White.copy(alpha = 0.3f),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedLabelColor = Color.White,
                    unfocusedLabelColor = Color.White.copy(alpha = 0.7f),
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                    cursorColor = Color.White
                )
            )
            TextField(
                value = textKotaAsal,
                onValueChange = { textKotaAsal = it },
                label = { Text("Asal Daerah") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp),
                shape = RoundedCornerShape(16.dp),
                singleLine = true,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White.copy(alpha = 0.3f),
                    unfocusedContainerColor = Color.White.copy(alpha = 0.3f),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedLabelColor = Color.White,
                    unfocusedLabelColor = Color.White.copy(alpha = 0.7f),
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                    cursorColor = Color.White
                )
            )
            Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                // Tanggal Lahir (terhubung ke variabel `text...`)
                TextField(
                    value = textTanggalLahir,
                    onValueChange = {},
                    label = { Text("Tanggal Lahir") },
                    modifier = Modifier
                        .weight(2f)
                        .padding(bottom = 10.dp)
                        .clickable { showDatePicker.value = true },
                    shape = RoundedCornerShape(16.dp),
                    singleLine = true,
                    readOnly = true,
                    colors = TextFieldDefaults.colors(
                        disabledContainerColor = Color.White.copy(alpha = 0.3f),
                        disabledIndicatorColor = Color.Transparent,
                        disabledLabelColor = Color.White.copy(alpha = 0.7f),
                        disabledTextColor = Color.White
                    ),
                    enabled = false
                )
                TextField(
                    value = textRt,
                    onValueChange = { textRt = it },
                    label = { Text("RT") },
                    modifier = Modifier
                        .weight(1f)
                        .padding(bottom = 10.dp),
                    shape = RoundedCornerShape(16.dp),
                    singleLine = true,
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.White.copy(alpha = 0.3f),
                        unfocusedContainerColor = Color.White.copy(alpha = 0.3f),
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedLabelColor = Color.White,
                        unfocusedLabelColor = Color.White.copy(alpha = 0.7f),
                        focusedTextColor = Color.White,
                        unfocusedTextColor = Color.White,
                        cursorColor = Color.White
                    )
                )
                TextField(
                    value = textRw,
                    onValueChange = {textRw = it},
                    label = {Text("RW")},
                    modifier = Modifier
                        .weight(1f)
                        .padding(bottom = 10.dp),
                    shape = RoundedCornerShape(16.dp),
                    singleLine = true,
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.White.copy(alpha = 0.3f),
                        unfocusedContainerColor = Color.White.copy(alpha = 0.3f),
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedLabelColor = Color.White,
                        unfocusedLabelColor = Color.White.copy(alpha = 0.7f),
                        focusedTextColor = Color.White,
                        unfocusedTextColor = Color.White,
                        cursorColor = Color.White
                    )
                )
            }
            TextField(
                value = textUmur,
                onValueChange = { textUmur = it },
                label = { Text("Umur") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp),
                shape = RoundedCornerShape(16.dp),
                singleLine = true,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White.copy(alpha = 0.3f),
                    unfocusedContainerColor = Color.White.copy(alpha = 0.3f),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedLabelColor = Color.White,
                    unfocusedLabelColor = Color.White.copy(alpha = 0.7f),
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                    cursorColor = Color.White
                )
            )
        }
    }
}

