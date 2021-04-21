package com.example.patterns_k.factory.port.`in`

import com.example.patterns_k.factory.port.out.AddMealPort
import com.example.patterns_k.factory.usecase.DrinkCreator
import com.example.patterns_k.factory.usecase.SnackCreator
import org.springframework.stereotype.Service

@Service
internal class MealFactory(val addMealPort: AddMealPort) : AddMealUseCase {

    private val factories = listOf(DrinkCreator(), SnackCreator()).associateBy { it.getType() }

    override fun addMealCommand(meal: AddMealUseCase.AddMealCommand): Long = addMealPort.addMeal(
        factories.getValue(meal.type).createMeal(meal.productName, meal.quantity)
    )
}