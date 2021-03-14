package tech.developingdeveloper.movieapi.service

import tech.developingdeveloper.movieapi.dto.MovieDTO


/**
 * Created by Abhishek Saxena on 14-03-2021.
 */

interface MovieService {

    fun createMovie(movieDTO: MovieDTO): MovieDTO
}