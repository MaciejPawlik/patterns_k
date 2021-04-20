package com.example.patterns_k.factory.usecase

import com.example.patterns_k.factory.domain.Meal
import com.example.patterns_k.factory.domain.MealType
import com.example.patterns_k.factory.domain.Product
import com.example.patterns_k.factory.domain.Snack

internal class DrinkCreator : MealCreator() {
    override fun createMeal(product: String, quantity: Int): Meal = Snack(Product(product), quantity)

    override fun getType(): MealType = MealType.DRINK
}