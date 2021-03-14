package tech.developingdeveloper.movieapi.repository

import org.springframework.data.repository.CrudRepository
import tech.developingdeveloper.movieapi.dto.MovieDTO
import tech.developingdeveloper.movieapi.entity.Movie


/**
 * Created by Abhishek Saxena on 14-03-2021.
 */

interface MovieRepository: CrudRepository<Movie, Int>