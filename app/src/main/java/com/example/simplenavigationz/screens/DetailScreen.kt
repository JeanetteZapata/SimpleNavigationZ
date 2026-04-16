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

// IA generated: Composable function for the Detail Screen of the blog
@Composable
fun DetailScreen(navController: NavController, title: String?, description: String?) {
    // IA generated: Long content for the detailed view
    val fullContent = "Este es el contenido completo del blog. Aquí detallamos cómo fue la caminata, el equipo que llevamos y los desafíos que enfrentamos al subir la montaña. Fue un día despejado, perfecto para la fotografía y para disfrutar del silencio de la naturaleza. Recomendamos a todos los estudiantes de programación tomarse un descanso de vez en cuando para despejar la mente."

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // IA generated: Title received from arguments
        Text(
            text = title ?: "Sin título",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        // IA generated: Full description
        Text(
            text = fullContent,
            fontSize = 16.sp
        )

        // IA generated: Summary or short description passed from Home
        Text(
            text = "Resumen previo: $description",
            fontSize = 14.sp,
            color = MaterialTheme.colorScheme.secondary
        )

        // IA generated: Button to go back to the previous screen
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text(text = "Regresar")
        }
    }
}
