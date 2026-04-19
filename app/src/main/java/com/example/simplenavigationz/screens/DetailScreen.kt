package com.example.simplenavigationz.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

// IA generated: DetailScreen component as per Instrucciones_PGem.txt
@Composable
fun DetailScreen(navController: NavController, title: String?, description: String?) {
    // IA generated: Full description (long text)
    val fullDescription = "Aquí exploramos la mitología de los reinos, el torneo que decide el destino de la Tierra y la rivalidad eterna entre Scorpion y Sub-Zero. En este nuevo universo, las alianzas han cambiado, pero la brutalidad del combate permanece igual."



    Column(
        modifier = Modifier
            .fillMaxSize()
            // IA generated: Background color applied as per user request #ebe1e0
            .background(Color(0xFFEBE1E0))
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


        // IA generated: Back button using navController.popBackStack() with custom color #810b30
        Button(
            onClick = {
                navController.popBackStack()
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF810B30))
        ) {
            Text(text = "Regresar")
        }
    }
}
