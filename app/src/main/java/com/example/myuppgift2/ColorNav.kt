package com.example.myuppgift2

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun ColorNavHost(navController: NavHostController, innerPadding: PaddingValues) {
    val viewModel: SharedViewModel = viewModel() // Skapa MainViewModel här
    NavHost(
        navController = navController,
        startDestination = "start",
        modifier = Modifier.padding(innerPadding)
    ) {
        composable("start") { StartScreen(navController, viewModel) } // Skicka viewModel
        composable(
            "color/{color}",
            arguments = listOf(navArgument("color") { type = NavType.StringType })
        ) { backStackEntry ->
            val color = backStackEntry.arguments?.getString("color") ?: "gray"
            ColorScreen(color, viewModel) // Skicka viewModel
        }
    }
}