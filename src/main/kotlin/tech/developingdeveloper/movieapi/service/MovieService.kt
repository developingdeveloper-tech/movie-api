package tech.developingdeveloper.movieapi.service

import tech.developingdeveloper.movieapi.dto.MovieDTO


/**
 * Created by Abhishek Saxena on 14-03-2021.
 */

interface MovieService {

    fun createMovie(movieDTO: MovieDTO): MovieDTO

    fun getMovies(): List<MovieDTO>

    fun getMovie(id: Int): MovieDTO

    fun updateMovie(movieDTO: MovieDTO): MovieDTO

    fun deleteMovie(id: Int)
}