package com.example.patterns_k.shared

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ExceptionHandler {

    @ExceptionHandler
    fun handleDataValidationError(error: DataValidationError): ResponseEntity<Sequence<String>> =
        ResponseEntity.badRequest().body(error.messages)
}