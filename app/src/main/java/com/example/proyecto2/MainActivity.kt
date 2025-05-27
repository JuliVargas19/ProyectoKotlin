package com.example.proyecto2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.proyecto2.Items.LiteraHubTheme
import com.example.proyecto2.Items.Navegacion
import com.example.proyecto2.ui.theme.Proyecto2Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LiteraHubTheme {
                Navegacion()
            }
        }
    }
}
