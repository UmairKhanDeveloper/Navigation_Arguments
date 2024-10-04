package com.example.navigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun SceondScreen(NavController: NavHostController, text: String?) {
    Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(text = "$text", modifier = Modifier.clickable {
            NavController.navigate(Screens.ThirdScreen.route)
        })

    }

}