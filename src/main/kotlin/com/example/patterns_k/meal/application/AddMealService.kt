package com.example.patterns_k.meal.application

import com.example.patterns_k.meal.adapter.out.MealId
import com.example.patterns_k.meal.application.port.out.AddMealPort
import com.example.patterns_k.meal.domain.DrinkCreator
import com.example.patterns_k.meal.domain.SnackCreator
import com.example.patterns_k.meal.application.port.`in`.AddMealUseCase
import org.springframework.stereotype.Service

@Service
internal class AddMealService(val addMealPort: AddMealPort) : AddMealUseCase {

    private val factories = listOf(DrinkCreator(), SnackCreator()).associateBy { it.getType() }

    override fun addMealCommand(meal: AddMealUseCase.AddMealCommand): MealId = addMealPort.addMeal(
        factories.getValue(meal.type).createMeal(meal.productName, meal.quantity)
    )
}