package com.example.patterns_k.factory.usecase

import com.example.patterns_k.factory.domain.Meal
import com.example.patterns_k.factory.domain.MealType

abstract class MealCreator {
    abstract fun createMeal(product: String, quantity: Int): Meal

    abstract fun getType(): MealType
}