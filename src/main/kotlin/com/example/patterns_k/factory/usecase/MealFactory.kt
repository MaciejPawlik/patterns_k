package com.example.patterns_k.factory.usecase

import com.example.patterns_k.factory.domain.Meal
import org.springframework.stereotype.Service

@Service
class MealFactory() : AddMealUseCase {

    private val factories = listOf(DrinkCreator(), SnackCreator()).associateBy { it.getType() }

    override fun addMealCommand(meal: AddMealUseCase.AddMealCommand): Meal = factories.getValue(meal.type).createMeal(
        meal.productName,
        meal.quantity
    )
}