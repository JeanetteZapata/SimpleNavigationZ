package com.example.simplenavigationz.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.simplenavigationz.screens.HomeScreen
import com.example.simplenavigationz.screens.DetailScreen
import java.net.URLDecoder
import java.nio.charset.StandardCharsets

// IA generated: Main navigation host of the blog application as per Instrucciones_PGem.txt
@Composable
fun AppNavigation() {
    // IA generated: Creating the NavController to manage navigation between screens
    val navController = rememberNavController()

    // IA generated: Defining the NavHost with "home" as the starting destination
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        // IA generated: Route for the HomeScreen
        composable(route = "home") {
            HomeScreen(navController = navController)
        }

        // IA generated: Route for the DetailScreen with arguments for title and description
        composable(
            route = "detail/{title}/{description}",
            arguments = listOf(
                navArgument("title") { type = NavType.StringType },
                navArgument("description") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            // IA generated: Extracting and decoding the arguments passed from HomeScreen
            val encodedTitle = backStackEntry.arguments?.getString("title") ?: ""
            val encodedDescription = backStackEntry.arguments?.getString("description") ?: ""
            
            val title = URLDecoder.decode(encodedTitle, StandardCharsets.UTF_8.toString())
            val description = URLDecoder.decode(encodedDescription, StandardCharsets.UTF_8.toString())

            DetailScreen(
                navController = navController,
                title = title,
                description = description
            )
        }
    }
}
