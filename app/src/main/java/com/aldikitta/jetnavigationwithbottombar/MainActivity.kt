package com.aldikitta.jetnavigationwithbottombar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.aldikitta.jetnavigationwithbottombar.navigation.RootNavigationGraph
import com.aldikitta.jetnavigationwithbottombar.ui.theme.JetNavigationWithBottomBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetNavigationWithBottomBarTheme {
                // A surface container using the 'background' color from the theme
//                    MainScreen()
                RootNavigationGraph(navController = rememberNavController())
            }

        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetNavigationWithBottomBarTheme {
        MainScreen()
    }
}