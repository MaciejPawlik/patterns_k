package com.example.patterns_k.factory.port.`in`

import com.example.patterns_k.factory.domain.MealType

interface AddMealUseCase {
    fun addMealCommand(meal: AddMealCommand): Long

    class AddMealCommand(val type: MealType, val productName: String, val quantity: Int)
}