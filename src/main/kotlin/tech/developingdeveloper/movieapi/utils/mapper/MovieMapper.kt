package tech.developingdeveloper.movieapi.utils.mapper

import org.springframework.stereotype.Service
import tech.developingdeveloper.movieapi.dto.MovieDTO
import tech.developingdeveloper.movieapi.entity.Movie


/**
 * Created by Abhishek Saxena on 13-03-2021.
 */

@Service
class MovieMapper: Mapper<MovieDTO, Movie> {

    override fun fromEntity(entity: Movie): MovieDTO = MovieDTO(
        entity.id,
        entity.name,
        entity.rating
    )

    override fun toEntity(domain: MovieDTO): Movie = Movie(
        domain.id,
        domain.name,
        domain.rating
    )
}