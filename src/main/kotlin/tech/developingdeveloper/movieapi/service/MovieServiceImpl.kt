package tech.developingdeveloper.movieapi.service

import org.springframework.stereotype.Service
import tech.developingdeveloper.movieapi.dto.MovieDTO
import tech.developingdeveloper.movieapi.repository.MovieRepository
import tech.developingdeveloper.movieapi.utils.mapper.MovieMapper

@Service
class MovieServiceImpl(
    private val movieRepository: MovieRepository,
    private val movieMapper: MovieMapper
) : MovieService {
    override fun createMovie(movieDTO: MovieDTO): MovieDTO {

        if(movieDTO.id != -1)
            throw IllegalArgumentException("Id must be null or -1.")

        val movie = movieMapper.toEntity(movieDTO)
        // with movie id = 25
        movieRepository.save(movie)
        return movieMapper.fromEntity(movie)
    }
}