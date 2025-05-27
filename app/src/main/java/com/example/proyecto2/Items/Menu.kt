package com.example.proyecto2.Items

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DrawerMenu(navController: NavController, closeDrawer: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF6C63FF))
                .padding(24.dp)
        ) {
            Text(
                text = "LiteraHub ",
                color = Color.White,
                style = MaterialTheme.typography.headlineSmall
            )
        }


        val menuItems = listOf(
            "Inicio" to "home",
            "Favoritos" to "favoritos"
        )

        menuItems.forEach { (label, route) ->
            ListItem(
                headlineContent = { Text(label) },
                leadingContent = {
                    when (route) {
                        "home" -> Icon(Icons.Default.Home, contentDescription = "Inicio")
                        "favoritos" -> Icon(Icons.Default.Favorite, contentDescription = "Favoritos")
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate(route)
                        closeDrawer()
                    }
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }
    }
}
