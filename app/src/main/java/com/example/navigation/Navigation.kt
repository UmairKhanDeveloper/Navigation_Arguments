package com.example.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun Navigation() {
    val NavController= rememberNavController()
    NavHost(navController = NavController, startDestination = Screens.HomeScreen.route) {
        composable(Screens.HomeScreen.route){
         HomeScreen(NavController)
        }

        composable(Screens.SceondScreen.route+"/{text}", arguments = listOf(
            navArgument("text"){
                type=NavType.StringType
            }
        )){
            val text=it.arguments?.getString("text")
            SceondScreen(NavController,text)
        }
        composable(Screens.ThirdScreen.route){
            ThirdScreen(NavController)
        }
        composable(Screens.FourthScreen.route+"/{title}", arguments = listOf(
            navArgument("title"){
                type=NavType.StringType
            }
        )){
            val title=it.arguments?.getString("title")
            FourthScreen(NavController,title)
        }


    }

}

sealed class Screens(val route:String){
    object HomeScreen:Screens("Home")
    object SceondScreen:Screens("Sceond")
    object ThirdScreen:Screens("Third")
    object FourthScreen:Screens("Fourth")

}