package com.example.simplenavigationz.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

// IA generated: DetailScreen component as per Instrucciones_PGem.txt
@Composable
fun DetailScreen(navController: NavController, title: String?, description: String?) {
    // IA generated: Full description (long text)
    val fullDescription = "Esta es la descripción completa y detallada del blog. Aquí se expande la información que vimos en el resumen de la pantalla principal. Es un texto mucho más largo para cumplir con los requisitos del ejercicio y mostrar cómo se vería un contenido real en una aplicación de blog."

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // IA generated: Title of the blog (same as in Home)
        Text(
            text = title ?: "Sin Título",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold
        )

        // IA generated: Full description (long text)
        Text(
            text = fullDescription,
            style = MaterialTheme.typography.bodyLarge
        )

        // IA generated: Showing the short description passed as argument
        Text(
            text = "Resumen previo: ${description ?: "No disponible"}",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.secondary
        )

        // IA generated: Back button using navController.popBackStack()
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text(text = "Regresar")
        }
    }
}
