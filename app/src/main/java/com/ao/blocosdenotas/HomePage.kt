package com.ao.blocosdenotas

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ao.blocosdenotas.componentes.NoteCards

@Composable
fun HomePage(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Column {
            Row(
                modifier = Modifier.padding(4.dp)
            ) {
                Button(
                    onClick = {},
                    modifier = Modifier.padding(8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan)
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Adicionar",
                        tint = Color.White,
                        modifier = Modifier.size(20.dp)
                    )
                    Text(text = "Anotações")
                }
            }
            Spacer(Modifier.height(2.dp))
            LazyColumn(
                modifier = Modifier.fillMaxHeight(1f)
            ) {
                items(14) {
                    NoteCards(navController)
                }
            }
        }

        FloatingActionButton(
            onClick = {navController.navigate("create") },
            shape = CircleShape,
            modifier = Modifier.size(70.dp).align(Alignment.BottomEnd).padding(4.dp),
            containerColor = Color.Blue
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Adicionar",
                tint = Color.White,
                modifier = Modifier.fillMaxSize(),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePagePreview(navController: NavController) {
    Surface() {
        HomePage(navController)
    }
}
