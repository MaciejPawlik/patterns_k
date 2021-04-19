package com.example.patterns_k.factory.endpoint

import com.example.patterns_k.factory.model.MealType

data class MealDto(val type: MealType, val productName: String, val quantity: Int)
