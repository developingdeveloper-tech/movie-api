package tech.developingdeveloper.movieapi.web.rest

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
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

    @GetMapping
    fun getMovies(): ResponseEntity<List<MovieDTO>> =
        ResponseEntity.ok(movieService.getMovies())

    @GetMapping("/{id}")
    fun getMovie(@PathVariable id: Int) =
        ResponseEntity.ok(movieService.getMovie(id))

    @PutMapping
    fun updateMovie(@RequestBody movieDTO: MovieDTO): ResponseEntity<MovieDTO> =
        ResponseEntity.ok(movieService.updateMovie(movieDTO))

    @DeleteMapping("/{id}")
    fun deleteMovie(@PathVariable id: Int): ResponseEntity<Unit> =
        ResponseEntity(movieService.deleteMovie(id), HttpStatus.NO_CONTENT)
}