package com.example.patterns_k.factory.adapter

import com.example.patterns_k.factory.domain.MealType

data class MealDto(val type: MealType, val productName: String, val quantity: Int)
