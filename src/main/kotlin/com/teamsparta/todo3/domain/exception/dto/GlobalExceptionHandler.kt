package com.teamsparta.todo3.domain.exception.dto

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(ModelNotFoundException :: class )
    fun handlerModelNotFoundException(e: ModelNotFoundException) : ResponseEntity<ErrorResponse>{
        return ResponseEntity
            .status(HttpStatus.NOT_FOUND)
            .body(ErrorResponse(message = e.message))
    }
}