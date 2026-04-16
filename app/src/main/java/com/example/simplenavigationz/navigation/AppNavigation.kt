package com.example.simplenavigationz.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.simplenavigationz.screens.HomeScreen
import com.example.simplenavigationz.screens.DetailScreen

// IA generated: Main navigation component of the application
@Composable
fun AppNavigation() {
    // IA generated: Create a NavController to manage app navigation
    val navController = rememberNavController()

    // IA generated: NavHost defines the navigation graph and routes
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        // IA generated: Route for the Home Screen
        composable(route = "home") {
            HomeScreen(navController = navController)
        }

        // IA generated: Route for the Detail Screen with arguments
        composable(
            route = "detail/{title}/{description}",
            arguments = listOf(
                navArgument("title") { type = NavType.StringType },
                navArgument("description") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val title = backStackEntry.arguments?.getString("title")
            val description = backStackEntry.arguments?.getString("description")
            DetailScreen(navController = navController, title = title, description = description)
        }
    }
}
