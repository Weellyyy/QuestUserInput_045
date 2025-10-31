package com.example.questuserinput_045

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun FormDataDiri(modifier: Modifier)
{
    //variable untuk menginagat value dari keyboard
    var textNama by remember {mutableStateOf("")}
    var textAlamat by remember {mutableStateOf("")}
    var TextJK by remember {mutableStateOf("")}

    //variabel untuk menyimppan data yang diperoleh oleh komponen ui
    var nama by remember { mutableStateOf("")}
    var alamat by remember { mutableStateOf("")}
    var jenis by remember { mutableStateOf("")}

    val gender:List<String> = listOf("Laki-laki","Perempuan")


}