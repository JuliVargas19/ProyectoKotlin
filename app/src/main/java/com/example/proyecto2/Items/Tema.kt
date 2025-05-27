package com.example.proyecto2.Items

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.proyecto2.ui.theme.Typography


private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF4B8B3B),
    onPrimary = Color.White,
    secondary = Color(0xFFE086A0),
    onSecondary = Color.White,
    background = Color(0xFFF6F1E7),
    onBackground = Color(0xFF333333),
    surface = Color.White,
    onSurface = Color(0xFF333333)
)

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF88B17A),
    onPrimary = Color.Black,
    secondary = Color(0xFFE6A1B3),
    onSecondary = Color.Black,
    background = Color(0xFF1B1B1B),
    onBackground = Color.White,
    surface = Color(0xFF2A2A2A),
    onSurface = Color.White
)

@Composable
fun LiteraHubTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
