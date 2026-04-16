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
// It sets up the theme and the main navigation host.
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // IA generated: Enables the edge-to-edge display to use the full screen area.
        enableEdgeToEdge()
        
        setContent {
            SimpleNavigationZTheme {
                // IA generated: Scaffold provides a structure for top bars, snackbars, etc.
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // IA generated: Using a Box to apply the padding from the Scaffold to the navigation content.
                    Box(modifier = Modifier.padding(innerPadding)) {
                        AppNavigation()
                    }
                }
            }
        }
    }
}
