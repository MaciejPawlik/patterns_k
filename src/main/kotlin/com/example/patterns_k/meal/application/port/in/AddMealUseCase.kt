package com.example.patterns_k.meal.application.port.`in`

import com.example.patterns_k.meal.domain.MealType

interface AddMealUseCase {
    fun addMealCommand(meal: AddMealCommand): Long

    class AddMealCommand(val type: MealType, val productName: String, val quantity: Int)
}