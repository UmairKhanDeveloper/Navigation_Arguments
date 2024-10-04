package com.example.navigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(NavController: NavHostController) {
    var name by remember { mutableStateOf("") }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        TextField(value = name, onValueChange = {
            name = it
        }, modifier = Modifier.align(Alignment.TopCenter))
        Text(text = "HomeScreen", modifier = Modifier.clickable {
            NavController.navigate(Screens.SceondScreen.route + "/$name")
        })

    }
}
