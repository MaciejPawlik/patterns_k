package com.example.patterns_k.shared

import io.vavr.control.Validation

interface SelfValidating {

    fun validSelf(validations: Sequence<Validation<String, Boolean>>) = if (validations.all { it.isValid }) true else throw DataValidationError(validations
        .filter { it.isInvalid }
        .map { it.error }
        .joinToString())
}