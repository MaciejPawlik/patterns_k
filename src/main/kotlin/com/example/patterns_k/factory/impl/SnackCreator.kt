package com.example.patterns_k.factory.impl

import com.example.patterns_k.factory.model.Meal
import com.example.patterns_k.factory.model.MealType
import com.example.patterns_k.factory.model.Product
import com.example.patterns_k.factory.model.Snack
import org.springframework.stereotype.Component

@Component
internal class SnackCreator : MealCreator() {
    override fun createMeal(product: String, quantity: Int): Meal = Snack(Product(product), quantity)

    override fun getType(): MealType = MealType.SNACK
}