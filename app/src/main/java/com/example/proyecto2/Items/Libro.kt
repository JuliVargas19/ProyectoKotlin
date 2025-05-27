package com.example.proyecto2.Items

data class Libro(
    val id: String,
    val titulo: String,
    val autor: String,
    val descripcion: String,
    val genero: String,
    val urlPdf: String,
    val imagenUrl: String
)

fun ListaLibros(): List<Libro> = listOf(
    Libro(
        id = "1",
        titulo = "Las crónicas de Narnia",
        autor = "C.S. Lewis",
        descripcion = "Cuatro hermanos descubren un mundo mágico y luchan contra la Bruja Blanca junto a Aslan.",
        genero = "Fantasía",
        urlPdf = "https://drive.google.com/uc?export=download&id=1H8JzuYBQ1z7OW4gzz1u4x6BoGGiN4ufB",
        imagenUrl = "https://m.media-amazon.com/images/I/91n5XgOqb4L.jpg"
    ),
    Libro(
        id = "2",
        titulo = "Harry Potter y la piedra filosofal",
        autor = "J.K. Rowling",
        descripcion = "El libro narra la historia de Harry Potter, un niño huérfano que descubre en su undécimo cumpleaños que es un mago. Harry es invitado a asistir al Colegio Hogwarts de Magia y Hechicería, donde se embarca en aventuras con sus nuevos amigos Ron Weasley y Hermione Granger. Durante su primer año, Harry descubre la verdad sobre sus padres y se enfrenta al malvado Lord Voldemort, quien está buscando la Piedra Filosofal para recuperar su poder.",
        genero = "Fantasía",
        urlPdf = "https://drive.google.com/file/d/1dD50LPSyLP5C_5eg21mrroRhSYYIvrGH/view?usp=sharing",
        imagenUrl = "https://m.media-amazon.com/images/I/81YOuOGFCJL.jpg"
    ),
    Libro(
        id = "3",
        titulo = "Harry Potter y la cámara secreta",
        autor = "J.K. Rowling",
        descripcion = "Segundo año con nuevos misterios.",
        genero = "Fantasía",
        urlPdf = "",
        imagenUrl = "https://m.media-amazon.com/images/I/91OINeHnJGL.jpg"
    ),
    Libro(
        id = "4",
        titulo = "Harry Potter y el prisionero de Azkaban",
        autor = "J.K. Rowling",
        descripcion = "Sirius Black escapa de Azkaban.",
        genero = "Fantasía",
        urlPdf = "",
        imagenUrl = "https://m.media-amazon.com/images/I/81lAPl9Fl0L.jpg"
    ),
    Libro(
        id = "5",
        titulo = "Harry Potter y el cáliz de fuego",
        autor = "J.K. Rowling",
        descripcion = "El Torneo de los Tres Magos.",
        genero = "Fantasía",
        urlPdf = "",
        imagenUrl = "https://m.media-amazon.com/images/I/810auYt9HIL.jpg"
    ),
    Libro(
        id = "6",
        titulo = "Harry Potter y la Orden del Fénix",
        autor = "J.K. Rowling",
        descripcion = "La resistencia contra Voldemort.",
        genero = "Fantasía",
        urlPdf = "",
        imagenUrl = "https://m.media-amazon.com/images/I/81iqZ2HHD-L.jpg"
    ),
    Libro(
        id = "7",
        titulo = "Harry Potter y el misterio del príncipe",
        autor = "J.K. Rowling",
        descripcion = "Los secretos de Snape se revelan.",
        genero = "Fantasía",
        urlPdf = "",
        imagenUrl = "https://m.media-amazon.com/images/I/91zbi9M+mKL.jpg"
    ),
    Libro(
        id = "8",
        titulo = "Harry Potter y las reliquias de la muerte",
        autor = "J.K. Rowling",
        descripcion = "El enfrentamiento final.",
        genero = "Fantasía",
        urlPdf = "",
        imagenUrl = "https://m.media-amazon.com/images/I/91HHqVTAJQL.jpg"
    ),
    Libro(
        id = "9",
        titulo = "Percy Jackson y el ladrón del rayo",
        autor = "Rick Riordan",
        descripcion = "Percy descubre que es un semidiós.",
        genero = "Fantasía",
        urlPdf = "",
        imagenUrl = "https://m.media-amazon.com/images/I/91LLq4uGgfL.jpg"
    ),
    Libro(
        id = "10",
        titulo = "Percy Jackson y el mar de los monstruos",
        autor = "Rick Riordan",
        descripcion = "Percy va en busca del Vellocino de Oro.",
        genero = "Fantasía",
        urlPdf = "",
        imagenUrl = "https://m.media-amazon.com/images/I/81tTnqeT7iL.jpg"
    ),
    Libro(
        id = "11",
        titulo = "Percy Jackson y la maldición del titán",
        autor = "Rick Riordan",
        descripcion = "Una nueva amenaza surge del oeste.",
        genero = "Fantasía",
        urlPdf = "",
        imagenUrl = "https://m.media-amazon.com/images/I/91E2ArhVYgL.jpg"
    ),
    Libro(
        id = "12",
        titulo = "Percy Jackson y la batalla del laberinto",
        autor = "Rick Riordan",
        descripcion = "Exploran el misterioso laberinto de Dédalo.",
        genero = "Fantasía",
        urlPdf = "",
        imagenUrl = "https://m.media-amazon.com/images/I/91VZ3xrOj-L.jpg"
    ),
    Libro(
        id = "13",
        titulo = "Percy Jackson y el último héroe del Olimpo",
        autor = "Rick Riordan",
        descripcion = "La gran batalla final contra los titanes.",
        genero = "Fantasía",
        urlPdf = "",
        imagenUrl = "https://m.media-amazon.com/images/I/91Z+gU2B2CL.jpg"
    )
)
