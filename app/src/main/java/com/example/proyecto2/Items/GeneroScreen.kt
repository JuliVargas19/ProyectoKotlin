package com.example.proyecto2.Items

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import kotlinx.coroutines.launch
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaGenero(genero: String, favoritosViewModel: FavoritosViewModel, navController: NavHostController) {


        val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
        val scope = rememberCoroutineScope()

        val libros = listOf(
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
                "2",
                "Harry Potter y la piedra filosofal",
                "J.K. Rowling",
                "El libro narra la historia de Harry Potter, un niño huérfano que descubre en su undécimo cumpleaños que es un mago. Harry es invitado a asistir al Colegio Hogwarts de Magia y Hechicería, donde se embarca en aventuras con sus nuevos amigos Ron Weasley y Hermione Granger. Durante su primer año, Harry descubre la verdad sobre sus padres y se enfrenta al malvado Lord Voldemort, quien está buscando la Piedra Filosofal para recuperar su poder.",
                "Fantasía",
                "https://drive.google.com/file/d/1dD50LPSyLP5C_5eg21mrroRhSYYIvrGH/view?usp=sharing",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fharrypotter.fandom.com%2Fes%2Fwiki%2FHarry_Potter_y_la_piedra_filosofal&psig=AOvVaw1i75uga3b7M2lNJMfoz_Jb&ust=1747786604880000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCIDKxs_isI0DFQAAAAAdAAAAABAE"
            ),
            Libro(
                "3",
                "Harry Potter y la cámara secreta",
                "J.K. Rowling",
                " En su segundo año en Hogwarts, Harry descubre una antigua cámara oculta donde habita un monstruo que está petrificando a los estudiantes. Harry debe enfrentarse al heredero de Slytherin para salvar a sus amigos y a la escuela.",
                "Fantasía",
                "https://drive.google.com/file/d/19diWkq_fE7PciUQUQCNvvF_k_VWlwdgf/view?usp=sharing",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fharrypotter.fandom.com%2Fes%2Fwiki%2FHarry_Potter_y_la_c%25C3%25A1mara_secreta&psig=AOvVaw05y8KGqHS73NW53MKNAxB4&ust=1747791703062000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCPCg4s71sI0DFQAAAAAdAAAAABAE"
            ),
            Libro(
                "4",
                "Harry Potter y el prisionero de Azkaban",
                "J.K. Rowling",
                "Harry se entera de que Sirius Black, un peligroso mago oscuro y supuesto seguidor de Voldemort, ha escapado de la prisión de Azkaban y aparentemente busca matarlo. Durante el año, Harry descubre secretos de su pasado familiar y la verdadera historia detrás de la traición que llevó a la muerte de sus padres.",
                "Fantasía",
                "https://drive.google.com/file/d/15xgzzj8dRGSTqpLrMxYtfAOPyo-anAVq/view?usp=sharing",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.buscalibre.com.co%2Flibro-harry-potter-y-el-prisionero-de-azkaban-harry-potter-3%2F9789585234062%2Fp%2F52837089&psig=AOvVaw1l_Qm2jBjoUHka1cKAgTOV&ust=1747791781536000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCKi5vfb1sI0DFQAAAAAdAAAAABAE"
            ),
            Libro(
                "5",
                "Harry Potter y el cáliz de fuego",
                "J.K. Rowling",
                "Hogwarts acoge el Torneo de los Tres Magos, una competición entre tres escuelas de magia. Aunque Harry es demasiado joven para participar, su nombre aparece misteriosamente seleccionado como cuarto campeón, forzándolo a competir en peligrosas pruebas que culminan en el retorno de Lord Voldemort.",
                "Fantasía",
                "https://drive.google.com/file/d/1RBqoPTSyv746ukhaTUCQE9yUeo7PmKmS/view?usp=sharing",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.buscalibre.com.co%2Flibro-harry-potter-y-el-caliz-de-fuego%2F9788418173110%2Fp%2F52797420&psig=AOvVaw0ExiWTiU5LzCQBVdW3CMVK&ust=1747791870205000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCODCnZ72sI0DFQAAAAAdAAAAABAE"
            ),
            Libro(
                "6",
                "Harry Potter y la Orden del Fénix",
                "J.K. Rowling",
                "Harry se une a una sociedad secreta llamada la Orden del Fénix, que lucha contra Voldemort mientras el Ministerio de Magia niega su regreso. En Hogwarts, debe enfrentarse a la tiránica profesora Dolores Umbridge y liderar un grupo de estudiantes en la resistencia.",
                "Fantasía",
                "https://drive.google.com/file/d/1S8WMlGjrllgDrzGaNVjinZn4yVgXhv9N/view?usp=sharing",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.buscalibre.com.co%2Flibro-harry-potter-y-la-orden-del-fenix%2F9789878000145%2Fp%2F52791843&psig=AOvVaw2wTWIsCDYeDmSMZ3T8d92N&ust=1747791897046000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCLDl48r2sI0DFQAAAAAdAAAAABAE"
            ),
            Libro(
                "7",
                "Harry Potter y el misterio del príncipe",
                "J.K. Rowling",
                "Dumbledore prepara a Harry para la batalla final contra Voldemort, revelándole detalles críticos sobre el pasado del Señor Tenebroso. Harry encuentra un antiguo libro de pociones perteneciente al Príncipe Mestizo que le ayuda académicamente, mientras descubre secretos oscuros sobre los horrocruxes.",
                "Fantasía",
                "https://drive.google.com/file/d/1bJb-rzFa6oaS10mpMx_rnuV8CF7dvayc/view?usp=sharing",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fharrypotter.fandom.com%2Fes%2Fwiki%2FHarry_Potter_y_el_misterio_del_pr%25C3%25ADncipe&psig=AOvVaw1rwWYmPLzk_euW2TQF7tkM&ust=1747792041052000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCOjS_-_2sI0DFQAAAAAdAAAAABAE"
            ),
            Libro(
                "8",
                "Harry Potter y las reliquias de la muerte",
                "J.K. Rowling",
                "En el libro final, Harry, Ron y Hermione abandonan Hogwarts para emprender una peligrosa misión encomendada por Dumbledore: encontrar y destruir los horrocruxes que mantienen a Voldemort inmortal. En el camino, descubren la leyenda de las Reliquias de la Muerte, tres objetos que supuestamente convierten a su poseedor en el amo de la muerte.",
                "Fantasía",
                "https://drive.google.com/file/d/1hJIYDdUtOv7Tl0QGNxKAJyIIJma6XFiH/view?usp=sharing",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.buscalibre.com.co%2Flibro-harry-potter-y-las-reliquias-de-la-muerte%2F9789878000169%2Fp%2F52791841&psig=AOvVaw3d3uFUnOY4-MsUwPJGmt16&ust=1747792111410000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCLiN35H3sI0DFQAAAAAdAAAAABAE"
            ),
            Libro(
                "9",
                "Percy Jackson y el ladrón del rayo",
                "Rick Riordan",
                " Percy Jackson descubre que es un semidiós, hijo de Poseidón, y que los dioses griegos existen en el mundo moderno. Acusado de robar el rayo maestro de Zeus, Percy debe embarcarse en una misión a través de Estados Unidos para encontrarlo antes del solsticio de verano y evitar una guerra entre los dioses.",
                "Fantasía",
                "https://drive.google.com/file/d/17aj7WVWzcibCgtEEaQiqRh4MQMMZSMND/view?usp=sharing",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.buscalibre.com.co%2Flibro-percy-jackson-y-los-dioses-del-olimpo-1-el-ladron-del-rayo%2F9789585305922%2Fp%2F53129175&psig=AOvVaw0t56ftk36aZ5sefwZke8e-&ust=1747792253112000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCPC4rdf3sI0DFQAAAAAdAAAAABAE"
            ),
            Libro(
                "10",
                "Percy Jackson y el mar de los monstruos",
                "Rick Riordan",
                "El árbol mágico que protege el Campamento Mestizo está siendo envenenado y la única cura es el legendario Vellocino de Oro. Percy y sus amigos emprenden un peligroso viaje al Mar de los Monstruos (el Mar Egeo) para recuperarlo y salvar el campamento.",
                "Fantasía",
                "https://drive.google.com/file/d/1e73FSR2R5LEyqCI2dBpQmIVZXgGBgo6q/view?usp=sharing",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Faminoapps.com%2Fc%2Flibros-aminoespanol%2Fpage%2Fblog%2Fopinion-de-percy-jackson-y-el-mar-de-los-monstruos%2FnwYg_bkcLu8K6D48X3YomG1qelkgBnXbq4&psig=AOvVaw1Oh7oG_1qMvQBIFQkH8WNO&ust=1747792286538000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCLDW2Pb3sI0DFQAAAAAdAAAAABAd"
            ),
            Libro(
                "11",
                "Percy Jackson y la maldición del titán",
                "Rick Riordan",
                "Percy debe rescatar a su amiga Annabeth y a la diosa Artemisa, quienes han sido capturadas. La misión lo lleva a enfrentarse con el general de los titanes y a descubrir una profecía que podría determinar su destino final en la guerra contra Cronos.",
                "Fantasía",
                "https://drive.google.com/file/d/1lwfq-IrpIAMTQFRDSymfbLDWS162kyEB/view?usp=sharing",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Faminoapps.com%2Fc%2Flibros-aminoespanol%2Fpage%2Fblog%2Fla-maldicion-del-titan%2FoNkz_Mludu7Gz7XngYJx70KwmPX3aN52o5&psig=AOvVaw1v7YK9vxPzTQ1qvm0T_DNF&ust=1747792426316000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCLCDkLP4sI0DFQAAAAAdAAAAABAq"
            ),
            Libro(
                "12",
                "Percy Jackson y la batalla del laberinto",
                "Rick Riordan",
                "Percy y sus amigos exploran el peligroso Laberinto de Dédalo para evitar que el ejército de Cronos lo use para invadir el Campamento Mestizo. Durante su aventura, descubren secretos sobre el pasado de Dédalo y el plan de Cronos para regresar completamente al mundo.",
                "Fantasía",
                "https://drive.google.com/file/d/1HSy85fqM5akBka_fBOOjnHyWlUJF0ROa/view?usp=sharing",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fcampamentomestizo.fandom.com%2Fwiki%2FLa_batalla_del_laberinto&psig=AOvVaw0rndN6UgIwjvef1allM5Yw&ust=1747792600587000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCMjSif_4sI0DFQAAAAAdAAAAABAE"
            ),
            Libro(
                "13",
                "Percy Jackson y el último héroe del Olimpo",
                "Rick Riordan",
                "En la batalla final, Cronos avanza hacia Nueva York y el Monte Olimpo mientras los dioses luchan contra el monstruo Tifón. Percy debe tomar decisiones cruciales sobre la profecía que ha guiado su vida y enfrentarse a Cronos en una batalla épica por el destino de la civilización occidental.",
                "Fantasía",
                "https://drive.google.com/file/d/1OeEtPej2T4gKaOGThu8s9lCy-4sgsuzS/view?usp=sharing",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fcampamentomestizo.fandom.com%2Fwiki%2FEl_%25C3%25BAltimo_h%25C3%25A9roe_del_Olimpo&psig=AOvVaw3yeRcBtZuIb6tUEhUWVc8I&ust=1747792683572000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCOiXr6b5sI0DFQAAAAAdAAAAABAE"
            )
        )
        val librosFiltrados = libros.filter { it.genero.equals(genero, ignoreCase = true) }

        ModalNavigationDrawer(
            drawerState = drawerState,
            drawerContent = {
                ModalDrawerSheet {
                    Text(
                        text = "LiteraHub",
                        style = MaterialTheme.typography.headlineSmall,
                        modifier = Modifier.padding(16.dp),
                        color = Color(0xFF4B8B3B),
                    )
                    Divider()
                    DrawerItem("Favoritos") {
                        scope.launch { drawerState.close() }
                        navController.navigate("favoritos")
                    }
                }
            }
        ) {
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = { Text("Género: $genero") },
                        navigationIcon = {
                            IconButton(onClick = { scope.launch { drawerState.open() } }) {
                                Icon(Icons.Default.Menu, contentDescription = "Menú")
                            }
                        },
                        colors = TopAppBarDefaults.topAppBarColors(
                            containerColor = Color(0xFF4B8B3B),
                            titleContentColor = Color.White
                        )
                    )
                }
            ) { padding ->
                LazyColumn(
                    contentPadding = padding,
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(librosFiltrados) { libro ->


                        var esFavorito by remember {
                            mutableStateOf(
                                favoritosViewModel.esFavorito(
                                    libro
                                )
                            )
                        }

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    navController.navigate("detalleLibro/${libro.id}")
                                },
                            elevation = CardDefaults.cardElevation(4.dp)
                        ) {
                            Row(
                                modifier = Modifier
                                    .padding(16.dp)
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    AsyncImage(
                                        model = libro.imagenUrl,
                                        contentDescription = "Portada del libro",
                                        modifier = Modifier
                                            .size(60.dp)
                                            .padding(end = 12.dp)
                                    )
                                    Column {
                                        Text(
                                            libro.titulo,
                                            style = MaterialTheme.typography.titleMedium
                                        )
                                        Text(
                                            "Autor: ${libro.autor}",
                                            style = MaterialTheme.typography.bodySmall
                                        )
                                    }
                                }

                                IconButton(onClick = {
                                    if (esFavorito) {
                                        favoritosViewModel.eliminarDeFavoritos(libro)
                                    } else {
                                        favoritosViewModel.agregarAFavoritos(libro)
                                    }
                                    esFavorito = !esFavorito
                                }) {
                                    Icon(
                                        imageVector = if (esFavorito) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
                                        contentDescription = if (esFavorito) "Eliminar de favoritos" else "Agregar a favoritos",
                                        tint = if (esFavorito) Color.Red else Color.Gray
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun DrawerItem(titulo: String, onClick: () -> Unit) {
        Text(
            text = titulo,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { onClick() }
                .padding(16.dp),
            style = MaterialTheme.typography.bodyLarge,
            color = Color(0xFF4B8B3B)
        )
    }
