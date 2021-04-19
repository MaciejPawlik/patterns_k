package com.example.patterns_k.factory.impl

import com.example.patterns_k.factory.model.Meal
import com.example.patterns_k.factory.model.MealType

abstract class MealCreator {
    abstract fun createMeal(product: String, quantity: Int): Meal

    abstract fun getType(): MealType
}