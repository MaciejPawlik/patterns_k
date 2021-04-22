package com.example.patterns_k.meal.domain

abstract class MealCreator {
    abstract fun createMeal(product: String, quantity: Int): Meal

    abstract fun getType(): MealType
}