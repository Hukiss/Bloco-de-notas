package com.ao.blocosdenotas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreatePage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(4.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var texto by remember {
            mutableStateOf(" ")
        }
        var titulo by remember {
            mutableStateOf("")
        }
        var data by remember {
            mutableStateOf("")
        }

        Text(
            text = "Data",
            fontStyle = FontStyle.Italic,
            fontFamily = FontFamily.SansSerif,
        )


        Spacer(Modifier.height(10.dp))

        TextField(
            value = titulo,
            onValueChange = { newValue ->
                titulo = newValue
            },
            label = {
                Text(
                    "Título",
                    fontStyle = FontStyle.Italic,
                    fontFamily = FontFamily.SansSerif
                )
            },
            shape = CircleShape,
            modifier = Modifier.fillMaxWidth(0.9f)

        )

        Spacer(Modifier.height(10.dp))

        TextField(
            value = texto,
            onValueChange = { newValue ->
                texto = newValue
            },
            label = { Text(text = "Texto", fontStyle = FontStyle.Italic) },
            modifier = Modifier
                .height(550.dp)
                .fillMaxWidth()
                .padding(6.dp),
            colors = TextFieldDefaults.textFieldColors(
                Color.Blue, // Cor do texto
                containerColor = Color.LightGray, // Cor de fundo do TextField
                cursorColor = Color.Blue, // Cor do cursor
                focusedIndicatorColor = Color.Green, // Cor da linha ao focar
                unfocusedIndicatorColor = Color.LightGray // Cor da linha sem foco
            ),
            shape = TextFieldDefaults.shape
        )

        Spacer(Modifier.height(25.dp))

        Button(
            onClick = {},

            ) {
            Text(
                "Guardar"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CreatePagereview() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        CreatePage()
    }
}