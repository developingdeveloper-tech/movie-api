package tech.developingdeveloper.movieapi.utils.mapper


/**
 * Created by Abhishek Saxena on 13-03-2021.
 */

interface Mapper<D, E> {

    fun fromEntity(entity: E): D
    fun toEntity(domain: D): E
}