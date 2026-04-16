package com.example.simplenavigationz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.simplenavigationz.navigation.AppNavigation
import com.example.simplenavigationz.ui.theme.SimpleNavigationZTheme

// IA generated: Main Activity that serves as the entry point for the Simple Blog app.
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleNavigationZTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // IA generated: Corrected missing import for Box was handled previously, 
                    // ensure padding is applied to the container.
                    Box(modifier = Modifier.padding(innerPadding)) {
                        AppNavigation()
                    }
                }
            }
        }
    }
}
