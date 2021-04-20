package com.example.patterns_k.factory.usecase

import com.example.patterns_k.factory.domain.Meal
import com.example.patterns_k.factory.domain.MealType

interface AddMealUseCase {
    fun addMealCommand(meal: AddMealCommand): Meal

    class AddMealCommand(val type: MealType, val productName: String, val quantity: Int)
}