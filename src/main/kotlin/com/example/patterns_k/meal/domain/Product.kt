package com.example.patterns_k.meal.domain

import java.time.LocalDateTime

data class Product(val name: String, val calories: Int = LocalDateTime.now().second * 5)
