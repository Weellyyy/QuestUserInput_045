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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ActivityForm(modifier: Modifier= Modifier) {
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
    var jenisKelamin by remember { mutableStateOf("") }

    val genderList = listOf("Laki-laki", "Perempuan")

    val showDatePicker = remember { mutableStateOf(false) }
    val datePickerState = rememberDatePickerState()
    val showDataPopup = remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(R.drawable.greenbg),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = modifier
                .fillMaxWidth(0.9f)
                .fillMaxWidth(0.9f)
                .clip(RoundedCornerShape(32.dp))
                .background(Color.White.copy(alpha = 0.1f))
                .padding(horizontal = 24.dp, vertical = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Form Pendaftaran Joki",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Divider(
                modifier = Modifier.padding(
                    bottom = dimensionResource(R.dimen.padding_medium),
                    top = dimensionResource(
                        R.dimen.padding_medium
                    )
                ),
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
                    onValueChange = { textRw = it },
                    label = { Text("RW") },
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
            Text(
                "Jenis Kelamin",
                fontWeight = FontWeight.SemiBold,
                color = Color.White.copy(alpha = 0.8f),
                modifier = Modifier
                    .fillMaxWidth()
            )
            Row(verticalAlignment = Alignment.CenterVertically)
            {
                genderList.forEach { gender ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .selectable(
                                selected = textJenisKelamin == gender,
                                onClick = { textJenisKelamin = gender })
                            .padding(end = 16.dp)
                    ) {
                        RadioButton(
                            selected = textJenisKelamin == gender,
                            onClick = { textJenisKelamin = gender },
                            colors = RadioButtonDefaults.colors(
                                selectedColor = Color.White,
                                unselectedColor = Color.White.copy(alpha = 0.7f)
                            )
                        )
                        Text(gender, color = Color.White)
                    }
                }
            }
            Divider(
                modifier = Modifier.padding(
                    bottom = dimensionResource(R.dimen.padding_small),
                    top = dimensionResource(
                        R.dimen.padding_small
                    )
                ),
                thickness = dimensionResource(R.dimen.divider_tipis),
                color = Color.Black
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Checkbox(
                    checked = isSetujuChecked,
                    onCheckedChange = { isSetujuChecked = it },
                    colors = CheckboxDefaults.colors(
                        checkedColor = Color.White,
                        uncheckedColor = Color.White.copy(alpha = 0.7f),
                        checkmarkColor = Color.Black
                    )
                )
                Text("Saya setuju", color = Color.White.copy(alpha = 0.8f), fontSize = 12.sp)
            }
            Divider(
                modifier = Modifier.padding(
                    bottom = dimensionResource(R.dimen.padding_small),
                    top = dimensionResource(
                        R.dimen.padding_small
                    )
                ),
                thickness = dimensionResource(R.dimen.divider_tipis),
                color = Color.Black
            )
            Button(
                onClick = {
                    namaLengkap = textNamaLengkap
                    kotaAsal = textKotaAsal
                    tanggalLahir = textTanggalLahir
                    rt = textRt
                    rw = textRw
                    umur = textUmur
                    jenisKelamin = textJenisKelamin
                    showDataPopup.value = true
                },
                enabled =
                    textNamaLengkap.isNotEmpty() && textKotaAsal.isNotEmpty() && textTanggalLahir.isNotEmpty() && textRw.isNotEmpty() && textRt.isNotEmpty() && textUmur.isNotEmpty() && textJenisKelamin.isNotEmpty() && isSetujuChecked,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black,
                    disabledContainerColor = Color.White.copy(alpha = 0.3f),
                    disabledContentColor = Color.Black.copy(alpha = 0.5f)
                )
            ) {
                Text(
                    "Submit",
                    fontWeight = FontWeight.Bold)
            }
        }
    }
    if (showDatePicker.value) {
        DatePickerDialog(
            onDismissRequest = { showDatePicker.value = false },
            confirmButton = {
                TextButton(
                    onClick = {
                        val selectedDate = datePickerState.selectedDateMillis
                        if (selectedDate != null) {
                            val formatter = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
                            textTanggalLahir = formatter.format(Date(selectedDate))
                        }
                        showDatePicker.value = false
                    }
                ) { Text("OK")}
            },
            dismissButton = {
                TextButton(onClick = {showDatePicker.value = false})
                {Text("Batalkan") }
            }
        ) {
            DatePicker(state = datePickerState)
        }
    }
    if (showDataPopup.value) {
        AlertDialog(
            onDismissRequest = { showDataPopup.value = false },
            title = { Text(text = "Data Berhasil Dikirim") },
            text = {
                Column {
                    Text("Nama: $namaLengkap")
                    Text("Asal: $kotaAsal")
                    Text("Tanggal Lahir: $tanggalLahir")
                    Text("RT/RW: $rt / $rw")
                    Text("Umur: $umur")
                    Text("Jenis Kelamin: $jenisKelamin")
                }
            },
            confirmButton = {
                TextButton(onClick = { showDataPopup.value = false }) {
                    Text("Tutup")
                }
            }
        )
    }
}


