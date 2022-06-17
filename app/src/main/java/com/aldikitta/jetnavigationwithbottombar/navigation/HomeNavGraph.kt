package com.aldikitta.jetnavigationwithbottombar.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.aldikitta.jetnavigationwithbottombar.BottomBarScreen
import com.aldikitta.jetnavigationwithbottombar.screens.Accounts
import com.aldikitta.jetnavigationwithbottombar.screens.Home
import com.aldikitta.jetnavigationwithbottombar.screens.ScreenContent
import com.aldikitta.jetnavigationwithbottombar.screens.Settings

@Composable
fun HomeNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.HOME,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            Home(
                name = BottomBarScreen.Home.title,
                onClick = {
                    navController.navigate(Graph.DETAILS)
                }
            )
        }
        composable(route = BottomBarScreen.Profile.route) {
            Accounts(
                name = BottomBarScreen.Profile.title,
                onClick = {
//                    navController.popBackStack()
//                    navController.popBackStack()
//                    navController.navigate(Graph.AUTHENTICATION)
                    navController.navigate(Graph.AUTHENTICATION) {
                        popUpTo(Graph.AUTHENTICATION) {
                            inclusive = false
                        }
                        launchSingleTop = true
                    }

                }
            )
        }
        composable(route = BottomBarScreen.Settings.route) {
            Settings(
                name = BottomBarScreen.Settings.title,
                onClick = { }
            )
        }
        detailsNavGraph(navController = navController)
        authNavGraph(navController = navController)
    }
}

fun NavGraphBuilder.detailsNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.DETAILS,
        startDestination = DetailsScreen.Information.route
    ) {
        composable(route = DetailsScreen.Information.route) {
            ScreenContent(name = DetailsScreen.Information.route) {
                navController.navigate(DetailsScreen.Overview.route)
            }
        }
        composable(route = DetailsScreen.Overview.route) {
            ScreenContent(name = DetailsScreen.Overview.route) {
                navController.popBackStack(
                    route = DetailsScreen.Information.route,
                    inclusive = false
                )
            }
        }
    }
}

sealed class DetailsScreen(val route: String) {
    object Information : DetailsScreen(route = "INFORMATION")
    object Overview : DetailsScreen(route = "OVERVIEW")
}
