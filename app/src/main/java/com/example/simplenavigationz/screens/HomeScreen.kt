package com.example.simplenavigationz.screens

import androidx.compose.foundation.Image
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.simplenavigationz.R
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

// IA generated: HomeScreen with Title at top, content in center, and Button at bottom
@Composable
fun HomeScreen(navController: NavController) {
    // IA generated: Sample blog data
    val blogTitle = "Mortal Kombat 1"
    val blogSummary = "Mortal Kombat 1 es un reboot de la saga lanzado en 2023 que presenta un universo renacido creado por el Dios del Fuego Liu Kang. Aqui exploramos la..."

    Column(
        modifier = Modifier
            .fillMaxSize()
            // IA generated: Background color applied as per user request #ebe1e0
            .background(Color(0xFFEBE1E0))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // IA generated: 1. Title at the top, centered horizontally, moderate top margin
        Spacer(modifier = Modifier.height(60.dp))
        Text(
            text = blogTitle,
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        // IA generated: 2. Center section - Text and Image occupying the middle space
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                // Image
                Image(
                    painter = painterResource(id = R.drawable.mortal),
                    contentDescription = "Imagen del blog",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(180.dp),
                    contentScale = ContentScale.Crop
                )
                
                Spacer(modifier = Modifier.height(8.dp))

                // Short description centered
                Text(
                    text = blogSummary,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }

        // IA generated: 3. Button at the bottom, centered, with bottom margin
        Button(
            onClick = {
                // IA generated: Encoding arguments for safety in navigation routes
                val encodedTitle = URLEncoder.encode(blogTitle, StandardCharsets.UTF_8.toString())
                val encodedDesc = URLEncoder.encode(blogSummary, StandardCharsets.UTF_8.toString())
                navController.navigate("detail/$encodedTitle/$encodedDesc")
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF810B30)),
            modifier = Modifier.padding(bottom = 20.dp)
        ) {
            Text(text = "Ver más")
        }
    }
}
