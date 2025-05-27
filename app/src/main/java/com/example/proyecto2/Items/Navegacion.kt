package com.example.proyecto2.Items

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyecto2.ui.PantallaRegistroUsuario

@Composable
@Preview(showBackground = true)
fun Navegacion() {
    val navController = rememberNavController()
    val favoritosViewModel = remember { FavoritosViewModel() }

    LiteraHubTheme {
        NavHost(navController = navController, startDestination = "login") {

            composable("login") {
                PantallaInicioSesion(navController)
            }

            composable("register") {
                PantallaRegistroUsuario(navController)
            }

            composable("home") {
                PantallaPrincipal(navController)
            }

            composable("favoritos") {
                PantallaFavoritos(
                    navController = navController,
                    viewModel = favoritosViewModel
                )
            }

            composable("detalleLibro/{libroId}") { backStackEntry ->
                val libroId = backStackEntry.arguments?.getString("libroId") ?: ""
                PantallaDetalleLibro(
                    navController = navController,
                    libroId = libroId,
                    viewModel = favoritosViewModel
                )
            }

            composable("genero/{nombreGenero}") { backStackEntry ->
                val genero = backStackEntry.arguments?.getString("nombreGenero") ?: ""
                PantallaGenero(genero, favoritosViewModel = favoritosViewModel, navController = navController)
            }
        }
    }
}
