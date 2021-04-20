package com.example.patterns_k.factory.domain

import java.time.LocalDateTime

data class Product(val name: String, val calories: Int = LocalDateTime.now().second * 5)
