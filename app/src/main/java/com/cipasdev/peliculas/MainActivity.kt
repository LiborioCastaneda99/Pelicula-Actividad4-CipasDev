package com.cipasdev.peliculas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cipasdev.peliculas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            textoHolaMundo.text = "Menu principal"
        }
    }

    fun cambiarPeliculaRapidosyFuriosos(view: View){
        val intent = Intent(this, DetailActivity::class.java).apply {
            putExtra("TITULO", "Rapidos y Furiosos")
            putExtra("DESCRIPCION", "Fast & Furious es una franquicia de medios estadounidense centrada en una serie de películas de acción que se ocupan en gran medida de automóviles. La saga también incluye cortometrajes, una serie de televisión, espectáculos en vivo, videojuegos y atracciones de parques temáticos.")
            putExtra("FOTO", "https://www.universalpictures-latam.com/tl_files/content/movies/fast9/posters/01.jpg")
        }
        startActivity(intent)
    }

    fun cambiarPeliculaTerminator(view: View){
        val intent = Intent(this, DetailActivity::class.java).apply {
            putExtra("TITULO", "Terminator")
            putExtra("DESCRIPCION", "The Terminator (conocida en algunos países de Hispanoamérica como El Exterminador) es una película estadounidense de ciencia ficción y acción de 1984, dirigida por James Cameron, coescrita entre Cameron, Gale Anne Hurd y William Wisher Jr. y protagonizada por Arnold Schwarzenegger, Linda Hamilton y Michael Biehn.")
            putExtra("FOTO", "https://m.media-amazon.com/images/M/MV5BYTViNzMxZjEtZGEwNy00MDNiLWIzNGQtZDY2MjQ1OWViZjFmXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_.jpg")
        }
        startActivity(intent)
    }

    fun cambiarPeliculaElAsesino(view: View){
        val intent = Intent(this, DetailActivity::class.java).apply {
            putExtra("TITULO", "El asesino")
            putExtra("DESCRIPCION", "Mientras aguarda, oculto por las sombras, un asesino comienza a resquebrajarse psicológicamente a medida que empieza a hacerse preguntas acerca de lo que está bien y lo que está mal.")
            putExtra("FOTO", "https://www.aceprensa.com/wp-content/uploads/2023/10/el-asesino-691x1024.jpg")
        }
        startActivity(intent)
    }

    fun cambiarPeliculaNavidad(view: View){
        val intent = Intent(this, DetailActivity::class.java).apply {
            putExtra("TITULO", "Mejor Navidad, ¡imposible!")
            putExtra("DESCRIPCION", "La amistad entre dos mujeres es puesta a prueba por un presuntuoso boletín de vacaciones y una repentina aparición justo antes del comienzo de las fiestas navideñas.")
            putExtra("FOTO", "https://static.wikia.nocookie.net/doblaje/images/e/ee/Mejor_Navidad%2C_%C2%A1imposible%21.png/revision/latest?cb=20231120005107&path-prefix=es")
        }
        startActivity(intent)
    }


}