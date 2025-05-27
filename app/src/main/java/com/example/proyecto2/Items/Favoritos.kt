package com.example.proyecto2.Items

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.proyecto2.Items.Libro


class FavoritosViewModel : ViewModel() {
    private val _favoritos = mutableStateListOf<Libro>()
    val favoritos: List<Libro> get() = _favoritos

    fun agregarAFavoritos(libro: Libro) {
        if (!_favoritos.contains(libro)) _favoritos.add(libro)
    }

    fun eliminarDeFavoritos(libro: Libro) {
        _favoritos.remove(libro)
    }

    fun esFavorito(libro: Libro): Boolean {
        return _favoritos.contains(libro)
    }
}
