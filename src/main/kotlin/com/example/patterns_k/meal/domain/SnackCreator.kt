package com.example.patterns_k.meal.domain

internal class SnackCreator : MealCreator() {
    override fun createMeal(product: String, quantity: Int): Meal = Snack(Product(product), quantity)

    override fun getType(): MealType = MealType.SNACK
}