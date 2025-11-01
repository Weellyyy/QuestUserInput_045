package com.example.questuserinput_045

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

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
}

