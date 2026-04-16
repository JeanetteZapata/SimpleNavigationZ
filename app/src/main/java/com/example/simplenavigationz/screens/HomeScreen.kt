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
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

// IA generated: HomeScreen component as per Instrucciones_PGem.txt
@Composable
fun HomeScreen(navController: NavController) {
    // IA generated: Sample blog data
    val blogTitle = "Mi Blog de Viajes"
    val blogSummary = "Este es un resumen del blog que describe mis aventuras por el mundo. Es corto pero interesante."

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // IA generated: Blog Title (Text)
        Text(
            text = blogTitle,
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold
        )

        // IA generated: Image placeholder (Box with color)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .background(Color.Blue)
        )

        // IA generated: Short description (max 3 lines, ellipsis)
        Text(
            text = blogSummary,
            maxLines = 3,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.bodyMedium
        )

        // IA generated: "Ver más" button to navigate to DetailScreen
        Button(onClick = {
            // IA generated: Encoding arguments for safety in navigation routes
            val encodedTitle = URLEncoder.encode(blogTitle, StandardCharsets.UTF_8.toString())
            val encodedDesc = URLEncoder.encode(blogSummary, StandardCharsets.UTF_8.toString())
            navController.navigate("detail/$encodedTitle/$encodedDesc")
        }) {
            Text(text = "Ver más")
        }
    }
}
