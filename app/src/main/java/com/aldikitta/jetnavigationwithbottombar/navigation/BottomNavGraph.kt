//package com.aldikitta.jetnavigationwithbottombar
//
//import androidx.compose.runtime.Composable
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import com.aldikitta.jetnavigationwithbottombar.screens.Accounts
//import com.aldikitta.jetnavigationwithbottombar.screens.Home
//import com.aldikitta.jetnavigationwithbottombar.screens.Settings
//
//@Composable
//fun BottomNavGraph(navController: NavHostController) {
//    NavHost(
//        navController = navController,
//        startDestination = BottomBarScreen.Home.route
//    ) {
//        composable(route = BottomBarScreen.Home.route) {
//            Home()
//        }
//        composable(route = BottomBarScreen.Profile.route) {
//            Accounts()
//        }
//        composable(route = BottomBarScreen.Settings.route) {
//            Settings()
//        }
//    }
//}