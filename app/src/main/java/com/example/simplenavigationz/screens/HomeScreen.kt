package com.example.simplenavigationz.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

// IA generated: Composable function for the Home Screen of the blog
@Composable
fun HomeScreen(navController: NavController) {
    // IA generated: Data for the blog post
    val blogTitle = "Mi Viaje a la Montaña"
    val shortDescription = "Hoy exploramos las cumbres más altas de la cordillera, una experiencia inolvidable llena de aire puro y vistas increíbles que te dejarán sin aliento."

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // IA generated: Blog Title
        Text(
            text = blogTitle,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        // IA generated: Image placeholder using a Box with color
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color.Gray)
        )

        // IA generated: Short description with ellipsis if it exceeds 3 lines
        Text(
            text = shortDescription,
            fontSize = 16.sp,
            maxLines = 3,
            overflow = TextOverflow.Ellipsis
        )

        // IA generated: Button to navigate to the Detail Screen passing arguments
        Button(onClick = {
            navController.navigate("detail/$blogTitle/$shortDescription")
        }) {
            Text(text = "Ver más")
        }
    }
}
