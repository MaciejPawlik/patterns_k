package com.example.patterns_k.factory.port.`in`

import com.example.patterns_k.factory.domain.Meal
import com.example.patterns_k.factory.usecase.DrinkCreator
import com.example.patterns_k.factory.usecase.SnackCreator
import org.springframework.stereotype.Service

@Service
internal class MealFactory() : AddMealUseCase {

    private val factories = listOf(DrinkCreator(), SnackCreator()).associateBy { it.getType() }

    override fun addMealCommand(meal: AddMealUseCase.AddMealCommand): Meal = factories.getValue(meal.type).createMeal(
        meal.productName,
        meal.quantity
    )
}