package com.example.questuserinput_126

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.runtime.mutableStateOf
import android.R.string


@Composable
fun FormDataDiri(modifier: Modifier
){
    var textNama by remember {mutableStateOf(value="")}
    var textAlamat by remember {mutableStateOf(value= "")}
    var textJK by remember {mutableStateOf(value="")}

    var nama by remember {mutableStateOf(value="")}
    var alamat by remember {mutableStateOf(value = "") }
    var jenis by remember {mutableStateOf(value="")}

    val gender:list<string> = listOf("laki-laki","perempuan")


}
