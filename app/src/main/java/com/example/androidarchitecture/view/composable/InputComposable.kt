package com.example.androidarchitecture.view.composable

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun InputComposable(label: String, onTextChange: (String) -> Unit) {
    var input by remember { mutableStateOf(("")) }

    TextField(
        value = input,
        onValueChange = { nextText ->
            input = nextText
            onTextChange(nextText)
         },
        placeholder = {Text(label)},
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    )
}



