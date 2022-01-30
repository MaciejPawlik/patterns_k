package com.example.patterns_k.meal.application.port.`in`

import com.example.patterns_k.meal.adapter.out.MealId
import com.example.patterns_k.meal.domain.MealType
import com.example.patterns_k.shared.SelfValidating

internal interface AddMealUseCase {
    fun addMealCommand(meal: AddMealCommand): MealId

    class AddMealCommand(val type: MealType, val productName: String, val quantity: Int) : SelfValidating {

        init {
            validateSelf(sequenceOf(
                Pair(productName.isNotEmpty(), "Name cannot be empty"),
                Pair(quantity > 0, "Quantity more than 0 required")
            ))
        }
    }
}