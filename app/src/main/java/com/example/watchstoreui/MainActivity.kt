package com.example.watchstoreui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.watchstoreui.screens.DetailScreen
import com.example.watchstoreui.screens.HomeScreen
import com.example.watchstoreui.ui.theme.WatchStoreUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navHostController = rememberNavController()
            WatchStoreUITheme {
                Scaffold (
                    modifier = Modifier.fillMaxSize()
                ) {
                    SetUpNavigation(navHostController = navHostController)
                }
            }
        }
    }
}


@Composable
fun SetUpNavigation(navHostController: NavHostController) {
         NavHost( startDestination = "Home" , navController = navHostController ) {
               composable(route="home") {
                   HomeScreen(navHostController = navHostController)
               }
               composable(route="detail"){
                   DetailScreen(onClickBack = {navHostController.popBackStack()})
               }
         }
}