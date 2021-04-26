package com.example.patterns_k.shared

data class DataValidationError(val messages: Sequence<String>): Throwable() {
}