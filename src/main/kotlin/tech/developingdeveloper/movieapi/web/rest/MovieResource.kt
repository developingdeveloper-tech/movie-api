package tech.developingdeveloper.movieapi.web.rest

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import tech.developingdeveloper.movieapi.dto.MovieDTO
import tech.developingdeveloper.movieapi.service.MovieService


/**
 * Created by Abhishek Saxena on 14-03-2021.
 */

@RestController
class MovieResource(
    private val movieService: MovieService
) {

    @PostMapping
    fun createMovie(@RequestBody movieDTO: MovieDTO): ResponseEntity<MovieDTO> {
        return ResponseEntity(movieService.createMovie(movieDTO), HttpStatus.CREATED)
    }
}