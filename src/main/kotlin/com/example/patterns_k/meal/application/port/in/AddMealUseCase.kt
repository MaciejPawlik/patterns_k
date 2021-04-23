package com.example.patterns_k.meal.application.port.`in`

import com.example.patterns_k.meal.domain.MealType
import com.example.patterns_k.shared.SelfValidating
import io.vavr.control.Validation

internal interface AddMealUseCase {
    fun addMealCommand(meal: AddMealCommand): Long

    class AddMealCommand(val type: MealType, val productName: String, val quantity: Int) : SelfValidating {

        init {
            validateSelf(sequenceOf(
                if (productName.isNotEmpty()) Validation.valid(true) else Validation.invalid("Name cannot be empty"),
                if (quantity > 0) Validation.valid(true) else Validation.invalid("Quantity more than 0 required")
            ))
        }
    }
}