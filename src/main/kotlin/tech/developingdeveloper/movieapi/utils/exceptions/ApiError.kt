package tech.developingdeveloper.movieapi.utils.exceptions

import org.springframework.http.HttpStatus
import java.time.LocalDateTime


data class ApiError(
    private val _message: String?,
    val status: HttpStatus = HttpStatus.BAD_REQUEST,
    val code: Int = status.value(),
    val timestamp: LocalDateTime = LocalDateTime.now()
){
    val message: String
        get() = _message ?: "Something went wrong"
}
