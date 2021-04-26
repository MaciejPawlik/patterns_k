package com.example.patterns_k.shared

interface SelfValidating {

    fun validateSelf(conditions: Sequence<Pair<Boolean, String>>) = if (conditions.all { it.first }) true else throw DataValidationError(
        conditions
            .filter { !it.first }
            .map { it.second }
    )
}
