package com.aldikitta.jetnavigationwithbottombar.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.aldikitta.jetnavigationwithbottombar.MainScreen
import com.aldikitta.jetnavigationwithbottombar.screens.LoginContent

@Composable
fun RootNavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.AUTHENTICATION
    ) {
        authNavGraph(navController = navController)
        composable(route = Graph.HOME) {
            MainScreen()
        }
//        composable(route = Graph.AUTHENTICATION) {
//            authNavGraph(navController)
//        }
    }
}

object Graph {
    const val ROOT = "root_graph"
    const val AUTHENTICATION = "auth_graph"
    const val HOME = "home_graph"
    const val DETAILS = "details_graph"
}