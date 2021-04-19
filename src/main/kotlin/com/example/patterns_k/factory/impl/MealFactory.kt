package com.example.patterns_k.factory.impl

import com.example.patterns_k.factory.model.Meal
import com.example.patterns_k.factory.model.MealType
import org.springframework.stereotype.Service

@Service
class MealFactory(creators: Set<MealCreator>) {

    private val factories = creators.associateBy { it.getType() }

    fun createMeal(
        mealType: MealType,
        productName: String,
        quantity: Int
    ): Meal = factories.getValue(mealType).createMeal(productName, quantity)
}